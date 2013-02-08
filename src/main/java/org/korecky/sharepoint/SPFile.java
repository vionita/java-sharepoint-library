package org.korecky.sharepoint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author vkorecky
 */
public class SPFile extends SPFileBase {

    private boolean exists;

    protected SPFile(String webAbsluteUrl) {
        super(webAbsluteUrl);
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
}
