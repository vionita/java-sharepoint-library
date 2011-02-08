
/**
 * QueryServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.3  Built on : Nov 12, 2010 (02:24:07 CET)
 */

    package com.google.code.sharepoint.soap;

    /**
     *  QueryServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class QueryServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public QueryServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public QueryServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for status method
            * override this method for handling normal response from status operation
            */
           public void receiveResultstatus(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from status operation
           */
            public void receiveErrorstatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryEx method
            * override this method for handling normal response from queryEx operation
            */
           public void receiveResultqueryEx(
                    com.google.code.sharepoint.soap.QueryServiceStub.QueryExResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryEx operation
           */
            public void receiveErrorqueryEx(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for query method
            * override this method for handling normal response from query operation
            */
           public void receiveResultquery(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from query operation
           */
            public void receiveErrorquery(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registration method
            * override this method for handling normal response from registration operation
            */
           public void receiveResultregistration(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registration operation
           */
            public void receiveErrorregistration(java.lang.Exception e) {
            }
                


    }
    