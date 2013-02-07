/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.httpclient.util.URIUtil;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author vkorecky
 */
public class SPFile {
    private String name;
    private boolean exists;    
    private String url;
    private final String webAbsluteUrl;

    protected SPFile(String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
    }
    
    /**
     * Gets byte array of downloaded file
     * @return
     * @throws MalformedURLException
     * @throws IOException 
     */
    public byte[] saveBinary() throws MalformedURLException, IOException {
        if (!exists) {
            return null;
        }        
        HttpURLConnection conn = null;        
        URL urlRequest = new URL(URIUtil.encodeQuery(getAbsoluteUrl()));
        conn = (HttpURLConnection) urlRequest.openConnection();
        int contentLength = conn.getContentLength();
        int bufferLength = 128;
        InputStream stream = conn.getInputStream();
        byte[] fileData = new byte[contentLength];
        int bytesread = 0;
        int offset = 0;
        while (bytesread >= 0) {
            if ((offset + bufferLength) > contentLength) {
                bufferLength = contentLength - offset;
            }
            bytesread = stream.read(fileData, offset, bufferLength);
            if (bytesread == -1) {
                break;
            }
            offset += bytesread;
        }

        return fileData;
    }
    
    /**
     * Saves the file to local file.
     * @return
     * @throws MalformedURLException
     * @throws IOException 
     */
    public void saveBinary(File file) throws FileNotFoundException, IOException{
        if (exists) {
            FileOutputStream fout = new FileOutputStream(file);
            fout.write(saveBinary());
            fout.flush();
            fout.close();
        }                
    }

    /**
     * Gets the Web site where the file is located.
     *
     * @return
     */
    public SPWeb getWeb() {
        throw new NotImplementedException();
    }

    /**
     * Gets the parent library of the SPFile.
     *
     * @return
     */
    public SPList getDocumentLibrary() {
        throw new NotImplementedException();
    }

    /**
     * Gets the list item object that corresponds to the file if the file
     * belongs to a document library.
     *
     * @return
     */
    public SPListItem getItem() {
        throw new NotImplementedException();
    }

    /**
     * Gets the site-relative URL of the file.
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets the name of the file including the extension.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a Boolean value that indicates whether the file exists.
     *
     * @return
     */
    public boolean isExists() {
        return exists;
    }    

    /**
     * Gets the absolute URL of the file.
     *
     * @return
     */
    public String getAbsoluteUrl() throws MalformedURLException {
        URL webUrl = new URL(webAbsluteUrl);        
        URL urlRequest = new URL(webUrl, url);
        return urlRequest.toString();        
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setExists(boolean exists) {
        this.exists = exists;
    }

    protected void setUrl(String url) {
        this.url = url;
    }
    
    
}
