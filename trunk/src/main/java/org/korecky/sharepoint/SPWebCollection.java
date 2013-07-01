package org.korecky.sharepoint;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Represents a SharePoint Foundation website.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPWebCollection extends SPBaseCollection<SPWeb> {

    public void loadFromXml(Element rootElement) {
        // Parse XML file                       
        if (StringUtils.equals(rootElement.getLocalName(), "Webs")) {
            items = new ArrayList<SPWeb>();
            NodeList webNodeList = rootElement.getElementsByTagName("Web");
            for (int i = 0; i < webNodeList.getLength(); i++) {
                Element webElement = (Element) webNodeList.item(i);
                SPWeb web = new SPWeb();
                web.loadFromXml(webElement);
                items.add(web);
            }
        }
    }
    
//    /**
//     * Gets the element with the specified GUID from the collection. In C#, this property is an indexer for the SPWebCollection class.
//     * @param guid
//     * @return 
//     */
//    public SPWeb getItem(String guid){
//        SPWeb web = null;
//        for (SPWeb item : items){
//            if (item.get)
//        }
//    }
//Public property 	Item[Guid] 	
//Public property 	Item[Int32] 	Gets the element at the specified index in the collection. In C#, this property is an indexer for the SPWebCollection class.
//Public property 	Item[String] 	Gets the element with the specified site-relative URL from the collection.
//Public property 	Names 	Gets an array that contains the site-relative URLs of all the websites in the collection.
//Public property 	WebsInfo 	List of SPWebInfo objects representing the SPWeb objects in the collection. 
}
