/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author vkorecky
 */
public class SPAttachmentCollection extends SPBaseCollection<SPAttachment> {
// TODO:
//Public property 	Count 	Gets the number of attachments in the collection.
//Public property 	IsSynchronized 	Gets a Boolean value that indicates whether access to the collection is synchronized or thread safe.
//Public property 	Item 	Gets the file name of the attachment at the specified index in the collection. [C#] In C#, this property is the indexer for the SPAttachmentCollection class.
//Public property 	SyncRoot 	Gets an object that is used to synchronize access to the collection.
//Public property 	UrlPrefix 	Gets the URL for the directory that contains the collection. 
//Public method 	Add 	Adds the attachment that is represented by the specified file name and byte array to the list item.
//Public method 	AddNow 	Adds the attachment that is represented by the specified file name and byte array to the list item without requiring an update to the parent list item.
//Public method 	Delete 	Deletes the attachment with the specified file name from the collection.
//Public method 	DeleteNow 	Deletes the attachment with the specified file name from the collection without requiring an update to the parent list item.
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetEnumerator 	Returns an enumerator to iterate through the collection.
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetType 	(Inherited from Object.)
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public method 	Recycle 	Recycles the attachment that is represented by the specified file name.
//Public method 	RecycleNow 	Recycles the attachment that is represented by the specified file name without requiring an update to the parent list item.
//Public method 	ToString 	(Inherited from Object.)        
        
    protected final String webAbsluteUrl;
    protected final String listName;

    protected SPAttachmentCollection(String listName, String webAbsluteUrl) {
        super();
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
    }

    public void loadFromXml(Element rootElement) throws ParseException, URISyntaxException {
        // Parse XML file   
        if (StringUtils.equals(rootElement.getLocalName(), "Attachments")) {
            items = new ArrayList<SPAttachment>();
            NodeList attachmentNodeList = rootElement.getElementsByTagName("Attachment");
            for (int i = 0; i < attachmentNodeList.getLength(); i++) {
                Element attachmentElement = (Element) attachmentNodeList.item(i);
                SPAttachment attachment = new SPAttachment(listName, webAbsluteUrl);
                attachment.loadFromXml(attachmentElement);
                items.add(attachment);
            }
        }
    }
}
