package org.korecky.sharepoint;

import java.text.ParseException;
import java.util.UUID;
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
// TODO:
//Public property 	IncludeMobileDefaultViewUrl 	Gets or sets a Boolean value that specifies whether to return the URL of the default mobile view for lists in the collection.
//Public property 	IncludeRootFolder 	Gets or sets a Boolean value that specifies whether the root folder of a list in the collection is returned by the RootFolder property.
//Public property 	ListsForCurrentUser 	Gets or sets a Boolean value that specifies whether only lists to which the current user has permissions are returned from the collection.
//Public property 	Web 	Gets the parent Web site of the collection. 
//Public method 	Add(String, String, SPListTemplate) 	Creates a list with the specified title, description, and list template object.
//Public method 	Add(String, String, SPListTemplateType) 	Creates a list with the specified title, description, and list definition type.
//Public method 	Add(String, String, SPListTemplate, SPDocTemplate) 	Creates a document library with the specified title, description, list template object, and document template object.
//Public method 	Add(String, String, String, SPListDataSource) 	Creates a list with the specified title, description, URL, and external data source.
//Public method 	Add(String, String, String, String, Int32, String) 	Creates a document library with the specified title, description, URL, Feature ID, list template type, and document template type.
//Public method 	Add(String, String, String, String, Int32, String, SPListTemplate.QuickLaunchOptions) 	Creates a list based on the specified title, description, URL, Feature ID, template type, document template type, and options for displaying a link to the list in Quick Launch.
//Public method 	Add(String, String, String, String, Int32, String, String, SPFeatureDefinition, SPListTemplate.QuickLaunchOptions) 	Creates a list based on the specified title, description, URL, Feature ID, template type, document template type, the list feature definition, customizations to the feature definition, and options for displaying a link to the list in Quick Launch.
//Public method 	CreateListFromRpc 	Creates a list from a name value collection that represents the arguments of a form submission.
//Public method 	Delete 	Deletes the list with the specified GUID from the collection.
//Protected method 	EnsureListsData 	Checks data for a specified list and, if necessary, updates the list to ensure that the most current data is used.
//Public method 	EnsureSiteAssetsLibrary 	A list that is designated as a default asset location for images or other files which the users upload to their wiki pages.
//Public method 	EnsureSitePagesLibrary 	A list that is designated as a default location for wiki pages.
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetEnumerator 	Gets an enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetList(Guid, Boolean) 	Returns the list with the specified GUID from the collection.
//Public method 	GetList(Guid, Boolean, Boolean) 	Returns the list with the specified GUID from the collection, including metadata for views and forms, and security data.
//Public method 	GetList(Guid, Boolean, Boolean, Boolean) 	Returns the list with the specified GUID from the collection, including metadata for views and forms, security data, and related fields.
//Public method 	GetType 	(Inherited from Object.)
//Public method 	GetTypedEnumerator<T> 	Returns a type-safe enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public method 	ToString 	(Inherited from Object.)
//Public method 	TryGetList 	Returns the list with the specified title from the collection, but returns null instead of an exception if the list does not exist.    

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

    /**
     * Gets the list with the specified GUID from the collection.
     *
     * @param id
     * @return
     */
    public SPList getItem(UUID id) {
        SPList foundList = null;
        if (items != null) {
            for (SPList list : items) {
                if (list.getId().equals(id)) {
                    foundList = list;
                    break;
                }
            }
        }
        return foundList;
    }

    /**
     * Gets the list object that has the specified name from the collection.
     *
     * @param name
     * @return
     */
    public SPList getItem(String name) {
        SPList foundList = null;
        if (items != null) {
            for (SPList list : items) {
                if (StringUtils.equals(list.getName(), name)) {
                    foundList = list;
                    break;
                }
            }
        }
        return foundList;
    }
}
