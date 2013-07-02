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
public class SPListTemplateCollection extends SPBaseCollection<SPListTemplate> {
// TODO:
//Public property 	Count 	Gets the number of list definitions or list templates in the collection. (Overrides SPBaseCollection.Count.)
//Public property 	Item[Int32] 	Gets the list definition or list template object at the specified index in the collection. In Microsoft Visual C#, this property is an indexer for the SPListTemplateCollection class.
//Public property 	Item[String] 	Gets the list definitions or list template object with the specified name from the collection. In Microsoft Visual C#, this property is an indexer for the SPListTemplateCollection class.
//Public property 	SchemaXml 	Gets the schema that describes the collection of list definitions.
//Public property 	Web 	Gets the parent Web site of the collection. 
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetEnumerator 	Gets an enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetType 	(Inherited from Object.)
//Public method 	GetTypedEnumerator<T> 	Returns a type-safe enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public method 	ToString 	(Inherited from Object.)        

    private final String webAbsluteUrl;

    protected SPListTemplateCollection(String webAbsluteUrl) {
        super();
        this.webAbsluteUrl = webAbsluteUrl;
    }

    public void loadFromXml(Element rootElement) throws ParseException {
        // Parse XML file   
        if (StringUtils.equals(rootElement.getLocalName(), "ListTemplates")) {
            items = new ArrayList<SPListTemplate>();
            NodeList listTemplateNodeList = rootElement.getElementsByTagName("ListTemplate");
            for (int i = 0; i < listTemplateNodeList.getLength(); i++) {
                Element listTemplateElement = (Element) listTemplateNodeList.item(i);
                SPListTemplate listTemplate = new SPListTemplate(webAbsluteUrl);
                listTemplate.loadFromXml(listTemplateElement);
                items.add(listTemplate);
            }

        }
    }
}
