package org.korecky.sharepoint;

import java.net.URISyntaxException;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;

/**
 *
 * @author vkorecky
 */
public class SPAttachment extends SPFileBase {
    
    protected SPAttachment(String webAbsluteUrl) {
        super(webAbsluteUrl);
    }
    
    public void loadFromXml(Element rootElement) throws URISyntaxException {
        // Parse XML file                            
        if (StringUtils.contains(rootElement.getLocalName(), "Attachment")) {
            url = rootElement.getTextContent().replaceFirst(webAbsluteUrl, "");
            String[] pathparts = url.split("\\/");
            name = url.substring(url.lastIndexOf('/') + 1, url.length() - 1);
        }
    }
}
