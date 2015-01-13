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

/**
 *
 * @author vkorecky
 */
abstract class SPFileBase {

    protected String name;
    protected String url;
    protected final String webAbsluteUrl;
    protected final String listName;

    protected SPFileBase(String listName, String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
    }

    /**
     * Gets byte array of downloaded file
     *
     * @return
     * @throws MalformedURLException
     * @throws IOException
     */
    public byte[] saveBinary() throws MalformedURLException, IOException {
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
     *
     * @return
     * @throws MalformedURLException
     * @throws IOException
     */
    public void saveBinary(File file) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(saveBinary());
        fout.flush();
        fout.close();
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
     * Gets the absolute URL of the file.
     *
     * @return
     */
    public String getAbsoluteUrl() throws MalformedURLException {
        URL webUrl = new URL(webAbsluteUrl);
        URL urlRequest = new URL(webUrl.toString() + url);
        return urlRequest.toString();
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setUrl(String url) {
        this.url = url;
    }
    
    public String getWebAbsluteUrl() {
        return webAbsluteUrl;
    }

    public String getListName() {
        return listName;
    }
}
