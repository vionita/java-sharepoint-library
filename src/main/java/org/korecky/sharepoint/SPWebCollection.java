package org.korecky.sharepoint;

import java.util.ArrayList;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Represents a collection of SPWeb objects.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPWebCollection extends SPBaseCollection<SPWeb> {

// TODO:
//Public method 	Add(String) 	Creates an SPWeb object with the specified website-relative URL.
//Public method 	Add(String, String, String, UInt32, SPWebTemplate, Boolean, Boolean) 	Creates an SPWeb object with the specified site-relative URL, title, description, locale ID, and site definition or site template object.
//Public method 	Add(String, String, String, UInt32, String, Boolean, Boolean) 	Creates a website with the specified site-relative URL, title, description, locale ID, and site definition or site template name.
//Public method 	Delete 	Deletes the website with the specified website-relative URL from the collection.
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetEnumerator 	Gets an enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetType 	(Inherited from Object.)
//Public method 	GetTypedEnumerator<T> 	Returns a type-safe enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public property 	WebsInfo 	List of SPWebInfo objects representing the SPWeb objects in the collection.   
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

//Public property 	Names 	Gets an array that contains the site-relative URLs of all the websites in the collection.
//Public property 	WebsInfo 	List of SPWebInfo objects representing the SPWeb objects in the collection. 
    /**
     * Gets the element with the specified site-relative URL from the
     * collection.
     *
     * @param value
     * @return
     */
    public SPWeb getItem(String url) {
        SPWeb foundWeb = null;
        if (items != null) {
            for (SPWeb web : items) {
                if (StringUtils.equalsIgnoreCase(web.getUrl(), url)) {
                    foundWeb = web;
                    break;
                }
            }
        }
        return foundWeb;
    }

    /**
     * Gets the element with the specified GUID from the collection
     *
     * @param id
     * @return
     */    
    public SPWeb getItem(UUID id) {
        SPWeb foundWeb = null;
        if (items != null) {
            for (SPWeb web : items) {
                if (web.getId().equals(id)) {
                    foundWeb = web;
                    break;
                }
            }
        }
        return foundWeb;
    }

    /**
     * Gets an array that contains the site-relative URLs of all the websites in
     * the collection.
     *
     * @return
     */
    public String[] getNames() {
        String[] names = null;
        if (items != null) {
            names = new String[items.size()];
            for (int i = 0; i < items.size(); i++) {
                names[i] = items.get(i).getUrl();
            }
        }
        return names;
    }
}
