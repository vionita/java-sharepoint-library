package org.korecky.sharepoint;

import java.text.ParseException;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Represents a SharePoint Foundation website.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPListCollection extends SPBaseCollection<SPList> {

    private final String webAbsluteUrl;

    protected SPListCollection(String webAbsluteUrl) {
        super();
        this.webAbsluteUrl = webAbsluteUrl;
    }

    public void loadFromXml(Element rootElelement) throws ParseException {
        // Parse XML file                            
        if (StringUtils.equals(rootElelement.getLocalName(), "Lists")) {
            NodeList listNodeList = rootElelement.getElementsByTagName("List");
            for (int i = 0; i < listNodeList.getLength(); i++) {
                Element listElement = (Element) listNodeList.item(i);
                SPList list = new SPList(webAbsluteUrl);
                list.loadFromXml(listElement);
                items.add(list);
            }

        }
    }
}
