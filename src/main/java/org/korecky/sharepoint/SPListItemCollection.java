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
public class SPListItemCollection extends SPBaseCollection<SPListItem> {
// TODO:
//Public property 	Count 	Gets the number of list items in the collection, excluding folders. (Overrides SPBaseCollection.Count.)
//Public property 	Fields 	Returns a collection that contains all the fields that the query returned.
//Public property 	Item[Guid] 	Gets the item object with the specified GUID from the collection.
//Public property 	Item[Int32] 	Gets the list item at the specified index in the collection.
//Public property 	List 	Gets the parent list of the collection.
//Public property 	ListItemCollectionPosition 	Gets an object that is used to obtain the next set of rows in a paged view of a list.
//Public property 	NumberOfFields 	Gets the number of fields that are represented in the collection.
//Public property 	QueryFieldNames 	Gets a collection of query field names.
//Public property 	SourceQuery 	Gets the query that retrieved the current collection of list items.
//Public property 	Xml 	Gets all the data in the collection in XMLDATA format.
//Public property 	XmlDataSchema 	Gets the schema that defines the XML that is returned by the Xml property.
//Protected property 	XMLUseAllProperties 	Gets a Boolean value that indicates whether the extended properties of the collection are serialized.
//Public method 	Add() 	Creates an item but requires the SPListItem.Update method to actually add the item to the list.
//Public method 	Add(String, SPFileSystemObjectType) 	Creates an item that uses the specified folder URL and object type but requires the SPListItem.Update method to actually add the item to the list.
//Public method 	Add(String, SPFileSystemObjectType, String) 	Creates an item that uses the specified folder URL, object type, and leaf name but requires the SPListItem.Update method to actually add the item to the list.
//Public method 	BeginLoadData 	Prevents updates, additions, and other operations on the collection while loading data.
//Public method 	Delete 	Deletes the item at the specified index in the collection.
//Public method 	DeleteItemById 	Deletes the item with the specified integer ID from the collection.
//Public method 	EndLoadData 	Allows normal operations on the collection to resume after loading data.
//Protected method 	EnsureListItemsData 	Checks data for the items and, if necessary, updates the data to ensure it is current.
//Protected method 	EnsureListScopeData 	Checks scope data for the items and, if necessary, updates it to ensure that the most current data is used.
//Protected method 	EnsureListScopeDict 	Checks the scope dictionary for the items and, if necessary, updates it to ensure that the most current data is used.
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetDataTable 	Returns the collection of list items as a data table.
//Public method 	GetEnumerator 	Returns an enumerator to iterate through the collection. (Overrides SPBaseCollection.GetEnumerator().)
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetItemById 	Returns the item with the specified integer ID from the collection.
//Public method 	GetType 	(Inherited from Object.)
//Public method 	GetTypedEnumerator<T> 	Returns a type-safe enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Protected method 	Init 	Initializes the specified list, query, and view.
//Protected method 	ListScopeXmlHelper 	Returns the scope XML of the collection.
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public method 	ReorderItems 	Reorders the items in the list.
//Public method 	ToString 	(Inherited from Object.)
//Protected field 	m_iRowCount 	This member is reserved for internal use and is not intended to be used directly from your code.

    private final String webAbsluteUrl;
    private final String listName;

    protected SPListItemCollection(String listName, String webAbsluteUrl) {
        super();
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
    }

    public void loadFromXml(Element rootElement) throws ParseException {
        // Parse XML file                               
        items = new ArrayList<SPListItem>();
        NodeList rowNodeList = rootElement.getElementsByTagNameNS("#RowsetSchema", "row");
        for (int j = 0; j < rowNodeList.getLength(); j++) {
            Element rowElement = (Element) rowNodeList.item(j);
            SPListItem item = new SPListItem(listName, webAbsluteUrl);
            item.loadFromXml(rowElement);
            items.add(item);
        }
    }
}
