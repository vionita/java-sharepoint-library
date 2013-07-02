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
public class SPFolderCollection extends SPBaseCollection<SPFolder> {
// TODO:
//Public property 	Count 	Gets the number of folders in the collection. (Overrides SPBaseCollection.Count.)
//Public property 	Folder 	Gets the parent folder of the collection.
//Public property 	Item[Int32] 	Gets the folder object at the specified index in the collection. In C#, this property is an indexer for the SPFolderCollection class.
//Public property 	Item[String] 	Gets the folder object that is located at the specified URL from the collection. In C#, this property is an indexer for the SPFolderCollection class.
//Public property 	Web 	Gets the parent Web site of the collection. 
//Public method 	Add 	Adds the folder that is located at the specified URL to the collection.
//Public method 	Delete 	Deletes the folder that is located at the specified URL from the collection.
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetEnumerator 	Gets an enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetType 	(Inherited from Object.)
//Public method 	GetTypedEnumerator<T> 	Returns a type-safe enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public method 	ToString 	(Inherited from Object.)        

    private final String webAbsluteUrl;
    private final String listName;
    private final String webId;

    protected SPFolderCollection(String listName, String webAbsluteUrl, String webId) {
        super();
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
        this.webId = webId;
    }

    public void loadFromXml(Element rootElement) throws ParseException {
        // Parse XML file    
        items = new ArrayList<SPFolder>();
        NodeList rowNodeList = rootElement.getElementsByTagNameNS("#RowsetSchema", "row");
        for (int j = 0; j < rowNodeList.getLength(); j++) {
            Element rowElement = (Element) rowNodeList.item(j);
            SPFolder folder = new SPFolder(listName, webAbsluteUrl, webId);
            folder.loadFromXml(rowElement);
            items.add(folder);
        }
    }
}
