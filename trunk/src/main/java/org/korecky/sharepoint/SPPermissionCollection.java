package org.korecky.sharepoint;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.korecky.sharepoint.support.Tools;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author vkorecky
 */
public class SPPermissionCollection extends SPBaseCollection<SPPermission> {

    private final String webAbsluteUrl;
    private final Object parent;

    protected SPPermissionCollection(Object parent, String webAbsluteUrl) {
        this.parent = parent;
        this.webAbsluteUrl = webAbsluteUrl;
    }

    void loadFromXmlString(String permissionsXmlString) throws ParserConfigurationException, SAXException, IOException {
        if (permissionsXmlString != null) {
            Document xmlDoc = Tools.loadXMLFromString(permissionsXmlString);
            Element rootElelement = xmlDoc.getDocumentElement();
            loadFromXml(rootElelement);
        }
    }

    private void loadFromXml(Element rootElelement) {
        // Parse XML file                            
        if (StringUtils.equals(rootElelement.getLocalName(), "Permissions")) {
            NodeList nodeList = rootElelement.getElementsByTagName("Permission");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element permissionElement = (Element) nodeList.item(i);
                SPPermission permission = new SPPermission(parent, webAbsluteUrl);
                permission.loadFromXml(permissionElement);
                items.add(permission);
            }
        }
    }
}
