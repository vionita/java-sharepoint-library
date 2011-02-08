
/**
 * ListsCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package com.google.code.sharepoint.soap;

    /**
     *  ListsCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ListsCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ListsCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ListsCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getListItems method
            * override this method for handling normal response from getListItems operation
            */
           public void receiveResultgetListItems(
                    com.google.code.sharepoint.soap.ListsStub.GetListItemsResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListItems operation
           */
            public void receiveErrorgetListItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteAttachment method
            * override this method for handling normal response from deleteAttachment operation
            */
           public void receiveResultdeleteAttachment(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteAttachment operation
           */
            public void receiveErrordeleteAttachment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateContentTypeXmlDocument method
            * override this method for handling normal response from updateContentTypeXmlDocument operation
            */
           public void receiveResultupdateContentTypeXmlDocument(
                    com.google.code.sharepoint.soap.ListsStub.UpdateContentTypeXmlDocumentResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateContentTypeXmlDocument operation
           */
            public void receiveErrorupdateContentTypeXmlDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteContentTypeXmlDocument method
            * override this method for handling normal response from deleteContentTypeXmlDocument operation
            */
           public void receiveResultdeleteContentTypeXmlDocument(
                    com.google.code.sharepoint.soap.ListsStub.DeleteContentTypeXmlDocumentResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteContentTypeXmlDocument operation
           */
            public void receiveErrordeleteContentTypeXmlDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addAttachment method
            * override this method for handling normal response from addAttachment operation
            */
           public void receiveResultaddAttachment(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addAttachment operation
           */
            public void receiveErroraddAttachment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListItemChanges method
            * override this method for handling normal response from getListItemChanges operation
            */
           public void receiveResultgetListItemChanges(
                    com.google.code.sharepoint.soap.ListsStub.GetListItemChangesResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListItemChanges operation
           */
            public void receiveErrorgetListItemChanges(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for undoCheckOut method
            * override this method for handling normal response from undoCheckOut operation
            */
           public void receiveResultundoCheckOut(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from undoCheckOut operation
           */
            public void receiveErrorundoCheckOut(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getVersionCollection method
            * override this method for handling normal response from getVersionCollection operation
            */
           public void receiveResultgetVersionCollection(
                    com.google.code.sharepoint.soap.ListsStub.GetVersionCollectionResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVersionCollection operation
           */
            public void receiveErrorgetVersionCollection(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addDiscussionBoardItem method
            * override this method for handling normal response from addDiscussionBoardItem operation
            */
           public void receiveResultaddDiscussionBoardItem(
                    com.google.code.sharepoint.soap.ListsStub.AddDiscussionBoardItemResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addDiscussionBoardItem operation
           */
            public void receiveErroraddDiscussionBoardItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkInFile method
            * override this method for handling normal response from checkInFile operation
            */
           public void receiveResultcheckInFile(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkInFile operation
           */
            public void receiveErrorcheckInFile(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteList method
            * override this method for handling normal response from deleteList operation
            */
           public void receiveResultdeleteList(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteList operation
           */
            public void receiveErrordeleteList(java.lang.Exception e) {
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
            * auto generated Axis2 call back method for getListCollection method
            * override this method for handling normal response from getListCollection operation
            */
           public void receiveResultgetListCollection(
                    com.google.code.sharepoint.soap.ListsStub.GetListCollectionResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListCollection operation
           */
            public void receiveErrorgetListCollection(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateContentType method
            * override this method for handling normal response from updateContentType operation
            */
           public void receiveResultupdateContentType(
                    com.google.code.sharepoint.soap.ListsStub.UpdateContentTypeResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateContentType operation
           */
            public void receiveErrorupdateContentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListContentType method
            * override this method for handling normal response from getListContentType operation
            */
           public void receiveResultgetListContentType(
                    com.google.code.sharepoint.soap.ListsStub.GetListContentTypeResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListContentType operation
           */
            public void receiveErrorgetListContentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkOutFile method
            * override this method for handling normal response from checkOutFile operation
            */
           public void receiveResultcheckOutFile(
                    boolean result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkOutFile operation
           */
            public void receiveErrorcheckOutFile(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addList method
            * override this method for handling normal response from addList operation
            */
           public void receiveResultaddList(
                    com.google.code.sharepoint.soap.ListsStub.AddListResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addList operation
           */
            public void receiveErroraddList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteContentType method
            * override this method for handling normal response from deleteContentType operation
            */
           public void receiveResultdeleteContentType(
                    com.google.code.sharepoint.soap.ListsStub.DeleteContentTypeResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteContentType operation
           */
            public void receiveErrordeleteContentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addListFromFeature method
            * override this method for handling normal response from addListFromFeature operation
            */
           public void receiveResultaddListFromFeature(
                    com.google.code.sharepoint.soap.ListsStub.AddListFromFeatureResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addListFromFeature operation
           */
            public void receiveErroraddListFromFeature(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAttachmentCollection method
            * override this method for handling normal response from getAttachmentCollection operation
            */
           public void receiveResultgetAttachmentCollection(
                    com.google.code.sharepoint.soap.ListsStub.GetAttachmentCollectionResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAttachmentCollection operation
           */
            public void receiveErrorgetAttachmentCollection(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateListItems method
            * override this method for handling normal response from updateListItems operation
            */
           public void receiveResultupdateListItems(
                    com.google.code.sharepoint.soap.ListsStub.UpdateListItemsResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateListItems operation
           */
            public void receiveErrorupdateListItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListItemChangesSinceToken method
            * override this method for handling normal response from getListItemChangesSinceToken operation
            */
           public void receiveResultgetListItemChangesSinceToken(
                    com.google.code.sharepoint.soap.ListsStub.GetListItemChangesSinceTokenResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListItemChangesSinceToken operation
           */
            public void receiveErrorgetListItemChangesSinceToken(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for applyContentTypeToList method
            * override this method for handling normal response from applyContentTypeToList operation
            */
           public void receiveResultapplyContentTypeToList(
                    com.google.code.sharepoint.soap.ListsStub.ApplyContentTypeToListResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from applyContentTypeToList operation
           */
            public void receiveErrorapplyContentTypeToList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListAndView method
            * override this method for handling normal response from getListAndView operation
            */
           public void receiveResultgetListAndView(
                    com.google.code.sharepoint.soap.ListsStub.GetListAndViewResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListAndView operation
           */
            public void receiveErrorgetListAndView(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getList method
            * override this method for handling normal response from getList operation
            */
           public void receiveResultgetList(
                    com.google.code.sharepoint.soap.ListsStub.GetListResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getList operation
           */
            public void receiveErrorgetList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateList method
            * override this method for handling normal response from updateList operation
            */
           public void receiveResultupdateList(
                    com.google.code.sharepoint.soap.ListsStub.UpdateListResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateList operation
           */
            public void receiveErrorupdateList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListContentTypes method
            * override this method for handling normal response from getListContentTypes operation
            */
           public void receiveResultgetListContentTypes(
                    com.google.code.sharepoint.soap.ListsStub.GetListContentTypesResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListContentTypes operation
           */
            public void receiveErrorgetListContentTypes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateContentTypesXmlDocument method
            * override this method for handling normal response from updateContentTypesXmlDocument operation
            */
           public void receiveResultupdateContentTypesXmlDocument(
                    com.google.code.sharepoint.soap.ListsStub.UpdateContentTypesXmlDocumentResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateContentTypesXmlDocument operation
           */
            public void receiveErrorupdateContentTypesXmlDocument(java.lang.Exception e) {
            }
                


    }
    