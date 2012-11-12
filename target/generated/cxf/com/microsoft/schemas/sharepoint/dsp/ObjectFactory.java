
package com.microsoft.schemas.sharepoint.dsp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.sharepoint.dsp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DataRoot_QNAME = new QName("http://schemas.microsoft.com/sharepoint/dsp", "dataRoot");
    private final static QName _QueryRequest_QNAME = new QName("http://schemas.microsoft.com/sharepoint/dsp", "queryRequest");
    private final static QName _Request_QNAME = new QName("http://schemas.microsoft.com/sharepoint/dsp", "request");
    private final static QName _Authentication_QNAME = new QName("http://schemas.microsoft.com/sharepoint/dsp", "authentication");
    private final static QName _Versions_QNAME = new QName("http://schemas.microsoft.com/sharepoint/dsp", "versions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.sharepoint.dsp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DspQuery }
     * 
     */
    public DspQuery createDspQuery() {
        return new DspQuery();
    }

    /**
     * Create an instance of {@link Versions }
     * 
     */
    public Versions createVersions() {
        return new Versions();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link QueryRequest }
     * 
     */
    public QueryRequest createQueryRequest() {
        return new QueryRequest();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link DataRoot }
     * 
     */
    public DataRoot createDataRoot() {
        return new DataRoot();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link PTQuery }
     * 
     */
    public PTQuery createPTQuery() {
        return new PTQuery();
    }

    /**
     * Create an instance of {@link Fields }
     * 
     */
    public Fields createFields() {
        return new Fields();
    }

    /**
     * Create an instance of {@link ServerParameterInfo }
     * 
     */
    public ServerParameterInfo createServerParameterInfo() {
        return new ServerParameterInfo();
    }

    /**
     * Create an instance of {@link OrderField }
     * 
     */
    public OrderField createOrderField() {
        return new OrderField();
    }

    /**
     * Create an instance of {@link DSQuery }
     * 
     */
    public DSQuery createDSQuery() {
        return new DSQuery();
    }

    /**
     * Create an instance of {@link ArrayOfOrderField }
     * 
     */
    public ArrayOfOrderField createArrayOfOrderField() {
        return new ArrayOfOrderField();
    }

    /**
     * Create an instance of {@link AllFields }
     * 
     */
    public AllFields createAllFields() {
        return new AllFields();
    }

    /**
     * Create an instance of {@link ServerParameter }
     * 
     */
    public ServerParameter createServerParameter() {
        return new ServerParameter();
    }

    /**
     * Create an instance of {@link ArrayOfServerParameter }
     * 
     */
    public ArrayOfServerParameter createArrayOfServerParameter() {
        return new ArrayOfServerParameter();
    }

    /**
     * Create an instance of {@link DspQuery.Where }
     * 
     */
    public DspQuery.Where createDspQueryWhere() {
        return new DspQuery.Where();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/sharepoint/dsp", name = "dataRoot")
    public JAXBElement<DataRoot> createDataRoot(DataRoot value) {
        return new JAXBElement<DataRoot>(_DataRoot_QNAME, DataRoot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/sharepoint/dsp", name = "queryRequest")
    public JAXBElement<QueryRequest> createQueryRequest(QueryRequest value) {
        return new JAXBElement<QueryRequest>(_QueryRequest_QNAME, QueryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/sharepoint/dsp", name = "request")
    public JAXBElement<RequestHeader> createRequest(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_Request_QNAME, RequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/sharepoint/dsp", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Versions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/sharepoint/dsp", name = "versions")
    public JAXBElement<Versions> createVersions(Versions value) {
        return new JAXBElement<Versions>(_Versions_QNAME, Versions.class, null, value);
    }

}
