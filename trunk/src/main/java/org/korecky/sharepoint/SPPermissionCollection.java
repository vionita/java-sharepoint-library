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
// TODO:
//Add 	Creates a foundPermission object with the specified member and permissions in the collection.
//AddCollection 	Adds a collection of permissions to the collection based on arrays that specify user information, user permissions, cross-site group names, cross-site group permissions, site group names, and site group permissions.
//CheckPermissions 	Verifies whether the current user has the specified permissions for the list or site and, if not, throws an Access Denied exception.
//DoesUserHavePermissions 	Returns a Boolean value that indicates whether the current user has the specified permissions for the list or site.
//Remove(Int32) 	Removes the foundPermission object at the given index in the collection.
//Remove(Microsoft.SharePoint.SPMember) 	Removes the foundPermission associated with the specified member from the collection.
//RemoveCollection 	Removes the permissions represented by an integer array of member IDs from the collection.
//ResetPermissions 	Resets the permissions inherited from the parent object.    
//Count 	Int32 	Gets the number of permissions in the collection.
//Inherited 	Boolean 	Gets a Boolean value that specifies whether the collection is inherited from the parent object.
//Item(Microsoft.SharePoint.SPMember) 	Microsoft.SharePoint.SPPermission 	
//Parent 	Object 	Gets the parent object for the collection of permissions, which can be a list or a site.
//RequestAccess 	Boolean 	Gets or sets a Boolean value that specifes whether request for access is enabled for a list.
//RequestAccessEmail 	String 	Gets or sets whether request for access is enabled for a site and specifies the e-mail address to which requests are sent.
//Xml 	String 	Gets the collection of permissions in XML format.     

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

    /**
     * Gets the foundPermission object with the specified member from the
     * collection.
     *
     * @param member
     * @return
     */
    public SPPermission getItem(SPMember member) {
        SPPermission foundPermission = null;
        if (items != null) {
            for (SPPermission permission : items) {
                if (permission.getMember().equals(member)) {
                    foundPermission = permission;
                    break;
                }
            }
        }
        return foundPermission;
    }
}
