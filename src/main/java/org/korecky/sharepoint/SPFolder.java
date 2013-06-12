//package org.korecky.sharepoint;
//
//import com.microsoft.schemas.sharepoint.soap.lists.GetListItems;
//import com.microsoft.schemas.sharepoint.soap.lists.GetListItemsResponse;
//import java.io.IOException;
//import java.net.URL;
//import java.security.KeyManagementException;
//import java.security.NoSuchAlgorithmException;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import javax.xml.bind.DatatypeConverter;
//import javax.xml.parsers.ParserConfigurationException;
//import org.apache.commons.lang3.StringUtils;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//
///**
// *
// * @author vkorecky
// */
//public class SPFolder {
//
//    private int id;
//    private int level;
//    protected String name;
//    protected String url;
//    private Date created;
//    private Date modified;
//    private final String webAbsluteUrl;
//    private final String listName;
//    private final String webId;
//
//    protected SPFolder(String listName, String webAbsluteUrl, String webId) {
//        this.webAbsluteUrl = webAbsluteUrl;
//        this.listName = listName;
//        this.webId = webId;
//    }
//
//    public List<SPFile> getFiles() throws SAXException, IOException, ParserConfigurationException, NoSuchAlgorithmException, KeyManagementException {
//        GetListItems.Query query = new GetListItems.Query();
//        Document docQuery = WsContext.stringToDom("<Query><Where><Eq><FieldRef Name=\"FSObjType\"/><Value Type=\"Lookup\">0</Value></Eq></Where></Query>");
//        query.getContent().add(docQuery.getDocumentElement());
//        GetListItems.QueryOptions queryOptions = new GetListItems.QueryOptions();
//        Document doc = WsContext.stringToDom("<QueryOptions><ViewAttributes IncludeRootFolder=\"False\" /><IncludeMandatoryColumns>TRUE</IncludeMandatoryColumns><DateInUtc>TRUE</DateInUtc><Folder>" + url + "</Folder></QueryOptions>");
//        queryOptions.getContent().add(doc.getDocumentElement());
//        List<SPFile> filesCollection = null;
//        GetListItemsResponse.GetListItemsResult result = WsContext.getListsStub(new URL(webAbsluteUrl)).getListItems(listName, null, query, null, "0", queryOptions, webId);
//        for (Object content : result.getContent()) {
//            if (content instanceof Element) {
//                Element rootElement = (Element) content;
//                NodeList dataNodeList = rootElement.getElementsByTagNameNS("urn:schemas-microsoft-com:rowset", "data");
//                for (int i = 0; i < dataNodeList.getLength(); i++) {
//                    Element dataElement = (Element) dataNodeList.item(i);
//                    filesCollection = new ArrayList<SPFile>();
//                    NodeList rowNodeList = dataElement.getElementsByTagNameNS("#RowsetSchema", "row");
//                    for (int j = 0; j < rowNodeList.getLength(); j++) {
//                        Element rowElement = (Element) rowNodeList.item(j);
//                        SPFile file = new SPFile(name, webAbsluteUrl);
//                        file.loadFromXml(rowElement);
//                        filesCollection.add(file);
//                    }
//                }
//            }
//        }
//        return filesCollection;
//    }
//
//    public List<SPFolder> getSubFolders() throws SAXException, ParserConfigurationException, IOException, NoSuchAlgorithmException, KeyManagementException {
//        GetListItems.Query query = new GetListItems.Query();
//        Document docQuery = WsContext.stringToDom("<Query><Where><Eq><FieldRef Name=\"FSObjType\"/><Value Type=\"Lookup\">1</Value></Eq></Where></Query>");
//        query.getContent().add(docQuery.getDocumentElement());
//        GetListItems.QueryOptions queryOptions = new GetListItems.QueryOptions();
//        Document doc = WsContext.stringToDom("<QueryOptions><ViewAttributes IncludeRootFolder=\"False\" /><IncludeMandatoryColumns>TRUE</IncludeMandatoryColumns><DateInUtc>TRUE</DateInUtc><Folder>" + url + "</Folder></QueryOptions>");
//        queryOptions.getContent().add(doc.getDocumentElement());
//        List<SPFolder> foldersCollection = null;
//        GetListItemsResponse.GetListItemsResult result = WsContext.getListsStub(new URL(webAbsluteUrl)).getListItems(listName, null, query, null, "0", queryOptions, webId);
//        for (Object content : result.getContent()) {
//            if (content instanceof Element) {
//                Element rootElement = (Element) content;
//                NodeList dataNodeList = rootElement.getElementsByTagNameNS("urn:schemas-microsoft-com:rowset", "data");
//                for (int i = 0; i < dataNodeList.getLength(); i++) {
//                    Element dataElement = (Element) dataNodeList.item(i);
//                    foldersCollection = new ArrayList<SPFolder>();
//                    NodeList rowNodeList = dataElement.getElementsByTagNameNS("#RowsetSchema", "row");
//                    for (int j = 0; j < rowNodeList.getLength(); j++) {
//                        Element rowElement = (Element) rowNodeList.item(j);
//                        SPFolder folder = new SPFolder(name, webAbsluteUrl, webId);
//                        folder.loadFromXml(rowElement);
//                        foldersCollection.add(folder);
//                    }
//                }
//            }
//        }
//        return foldersCollection;
//    }
//
//    void loadFromXml(Element rootElement) {
//        // Parse XML file                            
//        if (StringUtils.equals(rootElement.getLocalName(), "row")) {
//            name = rootElement.getAttribute("ows_LinkFilename");
//            url = rootElement.getAttribute("ows_FileRef");
//            if (StringUtils.isNotBlank(rootElement.getAttribute("ows_ID"))) {
//                id = Integer.valueOf(rootElement.getAttribute("ows_ID"));
//            }
//            if (StringUtils.isNotBlank(rootElement.getAttribute("ows__Level"))) {
//                level = Integer.valueOf(rootElement.getAttribute("ows__Level"));
//            }
//            if (StringUtils.isNotBlank(rootElement.getAttribute("ows_Created_x0020_Date"))) {
//                String[] strArray = rootElement.getAttribute("ows_Created_x0020_Date").split(";#");
//                if (strArray.length > 1) {
//                    Calendar calendar = DatatypeConverter.parseDateTime(strArray[1]);
//                    created = calendar.getTime();
//                }
//            }
//            if (StringUtils.isNotBlank(rootElement.getAttribute("ows_Modified"))) {
//                String[] strArray = rootElement.getAttribute("ows_Modified").split(";#");
//                if (strArray.length > 1) {
//                    Calendar calendar = DatatypeConverter.parseDateTime(strArray[1]);
//                    modified = calendar.getTime();
//                }                
//            }            
//        }
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public int getLevel() {
//        return level;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public Date getCreated() {
//        return created;
//    }
//
//    public Date getModified() {
//        return modified;
//    }
//
//    public String getWebAbsluteUrl() {
//        return webAbsluteUrl;
//    }
//
//    public String getListName() {
//        return listName;
//    }
//
//    public String getWebId() {
//        return webId;
//    }
//}
