/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.text.ParseException;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author vkorecky
 */
public class SPViewCollection extends SPBaseCollection<SPView> {
// TODO:
//Public property 	Count 	Gets the number of views in the collection. (Overrides SPBaseCollection.Count.)
//Public property 	Item[Guid] 	Gets the view object with the specified GUID from the collection.
//Public property 	Item[Int32] 	Gets the view object at the specified index in the collection.
//Public property 	Item[String] 	Gets the view object with the specified name from the collection.
//Public property 	List 	Gets the parent list for the view collection.
//Public property 	SchemaXml 	Gets the complete view schemas for the collection. 
//Public method 	Add(String, StringCollection, String, UInt32, Boolean, Boolean) 	Creates a view in the collection with the specified name, view fields, query, row limit, and Boolean values that specify whether the view displays items page by page and whether it is the default view.
//Public method 	Add(String, StringCollection, String, UInt32, Boolean, Boolean, SPViewCollection.SPViewType, Boolean) 	Creates a view in the collection with the specified name, view fields, query, row limit, Boolean values specifying whether the view displays items page by page and whether it is the default view, the view type, and a Boolean value specifying whether the view is personal or public.
//Public method 	Add(String, StringCollection, String, String, String, UInt32, Boolean, Boolean, SPViewCollection.SPViewType, Boolean) 	Creates a view in the collection with the specified name, view fields, query, joins, projected fields, row limit, view type, and Boolean values that specify whether the view displays items page by page, whether it is the default view, and whether the view is personal or public.
//Public method 	Delete 	Deletes the view with the specified GUID from the collection.
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetEnumerator 	Gets an enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetType 	(Inherited from Object.)
//Public method 	GetTypedEnumerator<T> 	Returns a type-safe enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetViewByBaseViewId 	Returns the first view in the SPViewCollection whose BaseViewID matches baseViewId.
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public method Static member 	SPViewTypeToString 	Returns a string representation of the specified view type.
//Public method Static member 	StringToSPViewType 	Returns a view type for the specified string.
//Public method 	ToString 	(Inherited from Object.)

    private final String webAbsluteUrl;
    private final String listName;

    protected SPViewCollection(String listName, String webAbsluteUrl) {
        super();
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
    }

    public void loadFromXml(Element rootElement) throws ParseException {
        // Parse XML file                               
        if (StringUtils.equals(rootElement.getLocalName(), "Views")) {
            NodeList viewNodeList = rootElement.getElementsByTagName("View");
            items = new ArrayList<SPView>();
            for (int i = 0; i < viewNodeList.getLength(); i++) {
                Element viewElement = (Element) viewNodeList.item(i);
                SPView view = new SPView(listName, webAbsluteUrl);
                view.loadFromXml(viewElement);
                items.add(view);
            }
        }
    }
}
