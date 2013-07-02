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
public class SPFileCollection extends SPBaseCollection<SPFile> {
// TODO:
//Public property 	Count 	Gets the number of files in the collection. (Overrides SPBaseCollection.Count.)
//Public property 	Folder 	Gets the parent folder of the collection.
//Public property 	Item[Int32] 	Gets the file object at the specified index in the collection. In Microsoft Visual C#, this property is an indexer for the SPFileCollection class.
//Public property 	Item[String] 	Gets the file object with the specified URL from the collection. In Microsoft Visual C#, this property is an indexer for the SPFileCollection class.
//Public property 	Web 	Gets the site to which the collection belongs. 
//Public method 	Add(String, SPTemplateFileType) 	Creates a file in the collection using the specified URL and template file type.
//Public method 	Add(String, []) 	Creates a file in the collection using the specified URL and a byte array that contains the file.
//Public method 	Add(String, Stream) 	Creates a file in the collection using the specified URL and a stream that contains the contents of a file.
//Public method 	Add(String, [], SPFileCollectionAddParameters) 	Creates a file in the collection using the specified URL, a byte array that contains the contents of a file, and an SPFileCollectionAddParameters object.
//Public method 	Add(String, [], Boolean) 	Creates a file in the collection using the specified URL, a byte array that contains the contents of a file, and a Boolean value that specifies whether to overwrite any file that has the same name.
//Public method 	Add(String, [], Hashtable) 	Creates a file in the collection using the specified URL, a byte array that contains the contents of a file, and a hash table that contains metadata for the file.
//Public method 	Add(String, Stream, SPFileCollectionAddParameters) 	Creates a file in the collection using the specified URL, a stream that contains the contents of a file, and an SPFileCollectionAddParameters object.
//Public method 	Add(String, Stream, Boolean) 	Creates a file in the collection using the specified URL, a stream that contains the contents of a file, and a Boolean value that specifies whether to overwrite any file that has the same name.
//Public method 	Add(String, Stream, Hashtable) 	Creates a file in the collection using the specified URL, a stream that contains the contents of a file, and a hash table that contains metadata for the file.
//Public method 	Add(String, [], Hashtable, Boolean) 	Creates a file in the collection using the specified URL, a byte array that contains the contents of a file, a hash table that contains metadata for the file, and a Boolean value that specifies whether to overwrite any file that has the same name.
//Public method 	Add(String, Stream, Hashtable, Boolean) 	Creates a file in the collection using the specified URL, a stream that contains the contents of a file, a hash table that contains metadata for the file, and a Boolean value that specifies whether to overwrite any file that has the same name.
//Public method 	Add(String, [], Boolean, String, Boolean) 	Creates a file in the collection using the specified URL, a byte array that contains the contents of a file, a Boolean value that specifies whether to overwrite any file that has the same name, a check-in comment, and a Boolean value that specifies whether to check required fields.
//Public method 	Add(String, Stream, Boolean, String, Boolean) 	Creates a file in the collection using the specified URL, a stream that contains the contents of a file, a Boolean value that specifies whether to overwrite any file that has the same name, a check-in comment, and a Boolean value that specifies whether to check required fields.
//Public method 	Add(String, Stream, Hashtable, Boolean, Boolean) 	Creates a file in the collection based on the specified URL, a Stream object that contains a file, and a hash table that contains metadata for the file.
//Public method 	Add(String, [], SPUser, SPUser, DateTime, DateTime) 	Creates a file in the collection using the specified URL, a byte array that contains the contents of a file, user objects that represent the users who created and last modified the file, and DateTime values that specify when they did so.
//Public method 	Add(String, Stream, SPUser, SPUser, DateTime, DateTime) 	Creates a file in the collection using the specified URL, a stream that contains the contents of a file, user objects that represent the users who created and last modified the file, and DateTime values that specify when they did so.
//Public method 	Add(String, Stream, Boolean, Boolean, Stream, String) 	Creates a file in the collection using the specified URL, a stream that contains the contents of a file, a Boolean value that specifies whether to overwrite any file that has the same name, a Boolean value that specifies whether to check required fields, a stream that contains file format metadata, and an output variable to receive an ETag.
//Public method 	Add(String, [], Hashtable, SPUser, SPUser, DateTime, DateTime, Boolean) 	Creates a file in the collection using the specified URL, a byte array that contains the contents of a file, a hash table that contains metadata for the file, user objects that represent the users who created and last modified the file, DateTime values that specify when they did so, and a Boolean value that specifies whether to overwrite any file that has the same name.
//Public method 	Add(String, Stream, Hashtable, SPUser, SPUser, DateTime, DateTime, String, Boolean) 	Creates a file in the collection using the specified URL, a stream that contains the contents of a file, a hash table that contains metadata for the file, user objects that represent the users who created and last modified the file, DateTime values that specify when they did so, a check-in comment, and a Boolean value that specifies whether to overwrite any file that has the same name.
//Public method 	Add(String, Stream, Hashtable, SPUser, SPUser, DateTime, DateTime, String, Boolean, Boolean) 	Creates a file in the collection based on the specified URL, on a Stream object that contains a file, a Hashtable object that contains metadata for the file, on SPUser objects that represent the users who created and last modified the file, and on DateTime values that specify when they did so.
//Public method 	Delete 	Deletes the file located at the specified URL.
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetEnumerator 	Gets an enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetType 	(Inherited from Object.)
//Public method 	GetTypedEnumerator<T> 	Returns a type-safe enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public method 	ToString 	(Inherited from Object.)        

    protected final String webAbsluteUrl;
    protected final String listName;

    protected SPFileCollection(String listName, String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
    }

    public void loadFromXml(Element rootElement) throws ParseException {
        // Parse XML file  
        items = new ArrayList<SPFile>();
        NodeList rowNodeList = rootElement.getElementsByTagNameNS("#RowsetSchema", "row");
        for (int j = 0; j < rowNodeList.getLength(); j++) {
            Element rowElement = (Element) rowNodeList.item(j);
            SPFile file = new SPFile(listName, webAbsluteUrl);
            file.loadFromXml(rowElement);
            items.add(file);
        }
    }
}
