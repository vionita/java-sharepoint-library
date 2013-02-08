package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.lists.GetAttachmentCollectionResponse.GetAttachmentCollectionResult;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

/**
 * Represents an item or row in a list
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPListItem {

    private final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private final SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_PATTERN);
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
    private final String webAbsluteUrl;
    private final String listName;

    protected SPListItem(String listName, String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
    }

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
                    created = formatter.parse(attribute.getValue());
                } else if ((StringUtils.equals(attribute.getName(), "ows_Modified")) && (StringUtils.isNotBlank(attribute.getValue()))) {
                    created = formatter.parse(attribute.getValue());
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
     * @return 
     */
    public SPFile getFile() {
        SPFile file = new SPFile(webAbsluteUrl);
        file.setName(fileName);
        file.setUrl(fileRef);
        if (fileRef.endsWith("_.000")) {
            file.setExists(false);
        } else {
            file.setExists(true);
        }
        return file;
    }
    
    public SPFile getAttachments() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        SPFile file = new SPFile(webAbsluteUrl);
       GetAttachmentCollectionResult result = WsContext.getListsPort(new URL(webAbsluteUrl)).getAttachmentCollection(listName, String.valueOf(id));
//        if (result.getContent() != null) {
//            for (Object content : result.getContent()) {
//                if (content instanceof Element) {
//                    // Parse XML file                    
//                    Element rootElement = (Element) content;
//                    if (StringUtils.equals(rootElement.getLocalName(), "listitems")) {
//                        NodeList dataNodeList = rootElement.getElementsByTagNameNS("urn:schemas-microsoft-com:rowset", "data");
//                        for (int i = 0; i < dataNodeList.getLength(); i++) {
//                            Element dataElement = (Element) dataNodeList.item(i);
//                            itemsCollection = new ArrayList<>();
//                            NodeList rowNodeList = dataElement.getElementsByTagNameNS("#RowsetSchema", "row");
//                            for (int j = 0; j < rowNodeList.getLength(); j++) {
//                                Element rowElement = (Element) rowNodeList.item(j);
//                                SPListItem item = new SPListItem(webAbsluteUrl);
//                                item.loadFromXml(rowElement);
//                                itemsCollection.add(item);
//                            }
//
//                        }
//                    }
//                }
//            }
//        }
        return file;
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
}
