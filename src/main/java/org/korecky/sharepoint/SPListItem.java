package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.lists.GetAttachmentCollectionResponse.GetAttachmentCollectionResult;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Represents an item or row in a list
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPListItem {

//    private final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
//    private final SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_PATTERN);
    private int id;
    private int level;
    private String title;
    private boolean hasAttachments;
    private String linkTitle;
    private int owshiddenversion;
    private String uniqueId;
    private Date created;
    private Date modified;
    private String metaInfo;
    private Map<String, String> properties;
    private String fileRef;
    private String fileName;
    private String contentTypeId;
    private final String webAbsluteUrl;
    private final String listName;

    protected SPListItem(String listName, String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
    }

    /**
     * Initialize from XML
     *
     * @param rootElement
     * @throws ParseException
     */
    public void loadFromXml(Element rootElement) throws ParseException {
        // Parse XML file                            
        if (StringUtils.contains(rootElement.getLocalName(), "row")) {
            properties = new HashMap<String, String>();
            for (int i = 0; i < rootElement.getAttributes().getLength(); i++) {
                Attr attribute = (Attr) rootElement.getAttributes().item(i);
                properties.put(attribute.getName(), attribute.getValue());

                if ((StringUtils.equals(attribute.getName(), "ows_ID")) && (StringUtils.isNotBlank(attribute.getValue()))) {
                    id = Integer.valueOf(attribute.getValue());
                } else if (StringUtils.equals(attribute.getName(), "ows_Title")) {
                    title = attribute.getValue();
                } else if (StringUtils.equals(attribute.getName(), "ows_ContentTypeId")) {
                    contentTypeId = attribute.getValue();
                } else if (StringUtils.equals(attribute.getName(), "ows_LinkTitle")) {
                    linkTitle = attribute.getValue();
                } else if (StringUtils.equals(attribute.getName(), "ows_Attachments")) {
                    hasAttachments = false;
                    if (StringUtils.equals(attribute.getValue().trim(), "1")) {
                        hasAttachments = true;
                    }
                } else if ((StringUtils.equals(attribute.getName(), "ows_owshiddenversion")) && (StringUtils.isNotBlank(attribute.getValue()))) {
                    owshiddenversion = Integer.valueOf(attribute.getValue());
                } else if ((StringUtils.equals(attribute.getName(), "ows_UniqueId")) && (StringUtils.isNotBlank(attribute.getValue()))) {
                    String[] uniqueIdArray = attribute.getValue().split("#");
                    if (uniqueIdArray.length > 1) {
                        uniqueId = uniqueIdArray[1];
                    }
                } else if ((StringUtils.equals(attribute.getName(), "ows_Created")) && (StringUtils.isNotBlank(attribute.getValue()))) {
                    Calendar calendar = DatatypeConverter.parseDateTime(attribute.getValue());
                    created = calendar.getTime();
                } else if ((StringUtils.equals(attribute.getName(), "ows_Modified")) && (StringUtils.isNotBlank(attribute.getValue()))) {
//                    created = formatter.parse(attribute.getValue());
                    Calendar calendar = DatatypeConverter.parseDateTime(attribute.getValue());
                    modified = calendar.getTime();
                } else if ((StringUtils.equals(attribute.getName(), "ows_MetaInfo")) && (StringUtils.isNotBlank(attribute.getValue()))) {
                    String[] metaInfoArray = attribute.getValue().split("#");
                    if (metaInfoArray.length > 1) {
                        metaInfo = metaInfoArray[1];
                    }
                } else if ((StringUtils.equals(attribute.getName(), "ows__Level")) && (StringUtils.isNotBlank(attribute.getValue()))) {
                    level = Integer.valueOf(attribute.getValue());
                } else if ((StringUtils.equals(attribute.getName(), "ows_FileRef")) && (StringUtils.isNotBlank(attribute.getValue()))) {
                    String[] fileRefArray = attribute.getValue().split("#");
                    fileRef = fileRefArray[1];
                } else if (StringUtils.equals(attribute.getName(), "ows_LinkFilename")) {
                    fileName = attribute.getValue();
                }
            }
        }
    }

    /**
     * Gets the file that is represented by the item from a document library.
     *
     * @return
     */
    public SPFile getFile() {
        SPFile file = new SPFile(listName, webAbsluteUrl);
        file.setName(fileName);
        file.setUrl(fileRef);
        if (fileRef.endsWith("_.000")) {
            file.setExists(false);
        } else {
            file.setExists(true);
        }
        return file;
    }

    /**
     * Gets the collection of attachments that are associated with the item.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public List<SPAttachment> getAttachments() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException, URISyntaxException {
        List<SPAttachment> attachmentCollection = new ArrayList<SPAttachment>();
        GetAttachmentCollectionResult result = WsContext.getListsPort(new URL(webAbsluteUrl)).getAttachmentCollection(listName, String.valueOf(id));
        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof Element) {
                    // Parse XML file                    
                    Element rootElement = (Element) content;
                    if (StringUtils.equals(rootElement.getLocalName(), "Attachments")) {
                        NodeList attachmentNodeList = rootElement.getElementsByTagName("Attachment");
                        for (int i = 0; i < attachmentNodeList.getLength(); i++) {
                            Element attachmentElement = (Element) attachmentNodeList.item(i);
                            SPAttachment attachment = new SPAttachment(listName, webAbsluteUrl);
                            attachment.loadFromXml(attachmentElement);
                            attachmentCollection.add(attachment);
                        }
                    }
                }
            }
        }
        return attachmentCollection;
    }

    /**
     * Add attachment to existing list item.
     *
     * @param fileName
     * @param fileContent
     * @return
     * @throws MalformedURLException
     * @throws KeyManagementException
     * @throws NoSuchAlgorithmException
     */
    public SPAttachment addAttachment(String fileName, byte[] fileContent) throws MalformedURLException, KeyManagementException, NoSuchAlgorithmException {
        String result = WsContext.getListsPort(new URL(webAbsluteUrl)).addAttachment(listName, String.valueOf(id), fileName, fileContent);
        SPAttachment attachment = new SPAttachment(listName, webAbsluteUrl);
        attachment.setUrl(result);
        return attachment;
    }

    /**
     * Add attachment to existing list item.
     *
     * @param fileName
     * @param fileContent
     * @return
     * @throws MalformedURLException
     * @throws KeyManagementException
     * @throws NoSuchAlgorithmException
     */
    public SPAttachment addAttachment(File localFile) throws MalformedURLException, KeyManagementException, NoSuchAlgorithmException, FileNotFoundException, IOException {
        ByteArrayOutputStream ous = null;
        InputStream ios = null;
        try {
            byte[] buffer = new byte[4096];
            ous = new ByteArrayOutputStream();
            ios = new FileInputStream(localFile);
            int read = 0;
            while ((read = ios.read(buffer)) != -1) {
                ous.write(buffer, 0, read);
            }
        } finally {
            try {
                if (ous != null) {
                    ous.flush();
                    ous.close();
                }
            } catch (IOException e) {
                // swallow, since not that important
            }
            try {
                if (ios != null) {
                    ios.close();
                }
            } catch (IOException e) {
                // swallow, since not that important
            }
        }
        return addAttachment(localFile.getName(), ous.toByteArray());
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getTitle() {
        return title;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public int getOwshiddenversion() {
        return owshiddenversion;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public String getWebAbsluteUrl() {
        return webAbsluteUrl;
    }

    public String getMetaInfo() {
        return metaInfo;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public String getFileRef() {
        return fileRef;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContentTypeId() {
        return contentTypeId;
    }

    public String getListName() {
        return listName;
    }    
}
