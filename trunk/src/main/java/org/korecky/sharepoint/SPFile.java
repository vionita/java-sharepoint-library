package org.korecky.sharepoint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;

/**
 *
 * @author vkorecky
 */
public class SPFile extends SPFileBase {

    private int id;
    private int level;    
    private Date created;
    private Date modified;
    private boolean exists;
    // TODO: parse more attributes include uniqueId
    private UUID uniqueId;

    public SPFile(String listName, String webAbsluteUrl) {
        super(listName, webAbsluteUrl);
    }

    /**
     * Gets byte array of downloaded file
     *
     * @return
     * @throws MalformedURLException
     * @throws IOException
     */
    @Override
    public byte[] saveBinary() throws MalformedURLException, IOException {
        if (!exists) {
            return null;
        }
        return super.saveBinary();
    }

    /**
     * Saves the file to local file.
     *
     * @param file
     * @throws FileNotFoundException
     * @throws IOException
     */
    @Override
    public void saveBinary(File file) throws FileNotFoundException, IOException {
        if (exists) {
            super.saveBinary(file);
        }
    }

     void loadFromXml(Element rootElement) {
        // Parse XML file                            
        if (StringUtils.equals(rootElement.getLocalName(), "row")) {
            name = rootElement.getAttribute("ows_LinkFilename");
            url = rootElement.getAttribute("ows_FileRef");
            if (StringUtils.isNotBlank(rootElement.getAttribute("ows_ID"))) {
                id = Integer.valueOf(rootElement.getAttribute("ows_ID"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("ows__Level"))) {
                level = Integer.valueOf(rootElement.getAttribute("ows__Level"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("ows_Created_x0020_Date"))) {
                String[] strArray = rootElement.getAttribute("ows_Created_x0020_Date").split(";#");
                if (strArray.length > 1) {
                    Calendar calendar = DatatypeConverter.parseDateTime(strArray[1]);
                    created = calendar.getTime();
                }
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("ows_Modified"))) {
                String[] strArray = rootElement.getAttribute("ows_Modified").split(";#");
                if (strArray.length > 1) {
                    Calendar calendar = DatatypeConverter.parseDateTime(strArray[1]);
                    modified = calendar.getTime();
                }
            }
        }
    }
    
    /**
     * Gets a Boolean value that indicates whether the file exists.
     *
     * @return
     */
    public boolean isExists() {
        return exists;
    }

    protected void setExists(boolean exists) {
        this.exists = exists;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }
    
    public UUID getUniqueId() {
        return uniqueId;
    }
}
