
/**
 * WebsCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package com.google.code.sharepoint.soap;

    /**
     *  WebsCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebsCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebsCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebsCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for revertFileContentStream method
            * override this method for handling normal response from revertFileContentStream operation
            */
           public void receiveResultrevertFileContentStream(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revertFileContentStream operation
           */
            public void receiveErrorrevertFileContentStream(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWeb method
            * override this method for handling normal response from getWeb operation
            */
           public void receiveResultgetWeb(
                    com.google.code.sharepoint.soap.WebsStub.GetWebResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWeb operation
           */
            public void receiveErrorgetWeb(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getContentTypes method
            * override this method for handling normal response from getContentTypes operation
            */
           public void receiveResultgetContentTypes(
                    com.google.code.sharepoint.soap.WebsStub.GetContentTypesResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getContentTypes operation
           */
            public void receiveErrorgetContentTypes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for webUrlFromPageUrl method
            * override this method for handling normal response from webUrlFromPageUrl operation
            */
           public void receiveResultwebUrlFromPageUrl(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from webUrlFromPageUrl operation
           */
            public void receiveErrorwebUrlFromPageUrl(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllSubWebCollection method
            * override this method for handling normal response from getAllSubWebCollection operation
            */
           public void receiveResultgetAllSubWebCollection(
                    com.google.code.sharepoint.soap.WebsStub.GetAllSubWebCollectionResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllSubWebCollection operation
           */
            public void receiveErrorgetAllSubWebCollection(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateContentTypeXmlDocument method
            * override this method for handling normal response from updateContentTypeXmlDocument operation
            */
           public void receiveResultupdateContentTypeXmlDocument(
                    com.google.code.sharepoint.soap.WebsStub.UpdateContentTypeXmlDocumentResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateContentTypeXmlDocument operation
           */
            public void receiveErrorupdateContentTypeXmlDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getContentType method
            * override this method for handling normal response from getContentType operation
            */
           public void receiveResultgetContentType(
                    com.google.code.sharepoint.soap.WebsStub.GetContentTypeResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getContentType operation
           */
            public void receiveErrorgetContentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for revertCss method
            * override this method for handling normal response from revertCss operation
            */
           public void receiveResultrevertCss(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revertCss operation
           */
            public void receiveErrorrevertCss(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCustomizedPageStatus method
            * override this method for handling normal response from getCustomizedPageStatus operation
            */
           public void receiveResultgetCustomizedPageStatus(
                    com.google.code.sharepoint.soap.WebsStub.CustomizedPageStatus result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCustomizedPageStatus operation
           */
            public void receiveErrorgetCustomizedPageStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getColumns method
            * override this method for handling normal response from getColumns operation
            */
           public void receiveResultgetColumns(
                    com.google.code.sharepoint.soap.WebsStub.GetColumnsResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getColumns operation
           */
            public void receiveErrorgetColumns(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getActivatedFeatures method
            * override this method for handling normal response from getActivatedFeatures operation
            */
           public void receiveResultgetActivatedFeatures(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getActivatedFeatures operation
           */
            public void receiveErrorgetActivatedFeatures(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createContentType method
            * override this method for handling normal response from createContentType operation
            */
           public void receiveResultcreateContentType(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createContentType operation
           */
            public void receiveErrorcreateContentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for customizeCss method
            * override this method for handling normal response from customizeCss operation
            */
           public void receiveResultcustomizeCss(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from customizeCss operation
           */
            public void receiveErrorcustomizeCss(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateColumns method
            * override this method for handling normal response from updateColumns operation
            */
           public void receiveResultupdateColumns(
                    com.google.code.sharepoint.soap.WebsStub.UpdateColumnsResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateColumns operation
           */
            public void receiveErrorupdateColumns(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateContentType method
            * override this method for handling normal response from updateContentType operation
            */
           public void receiveResultupdateContentType(
                    com.google.code.sharepoint.soap.WebsStub.UpdateContentTypeResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateContentType operation
           */
            public void receiveErrorupdateContentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteContentType method
            * override this method for handling normal response from deleteContentType operation
            */
           public void receiveResultdeleteContentType(
                    com.google.code.sharepoint.soap.WebsStub.DeleteContentTypeResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteContentType operation
           */
            public void receiveErrordeleteContentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListTemplates method
            * override this method for handling normal response from getListTemplates operation
            */
           public void receiveResultgetListTemplates(
                    com.google.code.sharepoint.soap.WebsStub.GetListTemplatesResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListTemplates operation
           */
            public void receiveErrorgetListTemplates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for revertAllFileContentStreams method
            * override this method for handling normal response from revertAllFileContentStreams operation
            */
           public void receiveResultrevertAllFileContentStreams(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from revertAllFileContentStreams operation
           */
            public void receiveErrorrevertAllFileContentStreams(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeContentTypeXmlDocument method
            * override this method for handling normal response from removeContentTypeXmlDocument operation
            */
           public void receiveResultremoveContentTypeXmlDocument(
                    com.google.code.sharepoint.soap.WebsStub.RemoveContentTypeXmlDocumentResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeContentTypeXmlDocument operation
           */
            public void receiveErrorremoveContentTypeXmlDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWebCollection method
            * override this method for handling normal response from getWebCollection operation
            */
           public void receiveResultgetWebCollection(
                    com.google.code.sharepoint.soap.WebsStub.GetWebCollectionResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWebCollection operation
           */
            public void receiveErrorgetWebCollection(java.lang.Exception e) {
            }
                


    }
    