
/**
 * UserGroupCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.6  Built on : Aug 30, 2011 (10:00:16 CEST)
 */

    package com.google.code.sharepoint.soap;

    /**
     *  UserGroupCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class UserGroupCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public UserGroupCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public UserGroupCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for removeUserCollectionFromSite method
            * override this method for handling normal response from removeUserCollectionFromSite operation
            */
           public void receiveResultremoveUserCollectionFromSite(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUserCollectionFromSite operation
           */
            public void receiveErrorremoveUserCollectionFromSite(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRolesAndPermissionsForCurrentUser method
            * override this method for handling normal response from getRolesAndPermissionsForCurrentUser operation
            */
           public void receiveResultgetRolesAndPermissionsForCurrentUser(
                    com.google.code.sharepoint.soap.UserGroupStub.GetRolesAndPermissionsForCurrentUserResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRolesAndPermissionsForCurrentUser operation
           */
            public void receiveErrorgetRolesAndPermissionsForCurrentUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addUserCollectionToRole method
            * override this method for handling normal response from addUserCollectionToRole operation
            */
           public void receiveResultaddUserCollectionToRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUserCollectionToRole operation
           */
            public void receiveErroraddUserCollectionToRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserCollectionFromSite method
            * override this method for handling normal response from getUserCollectionFromSite operation
            */
           public void receiveResultgetUserCollectionFromSite(
                    com.google.code.sharepoint.soap.UserGroupStub.GetUserCollectionFromSiteResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserCollectionFromSite operation
           */
            public void receiveErrorgetUserCollectionFromSite(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllUserCollectionFromWeb method
            * override this method for handling normal response from getAllUserCollectionFromWeb operation
            */
           public void receiveResultgetAllUserCollectionFromWeb(
                    com.google.code.sharepoint.soap.UserGroupStub.GetAllUserCollectionFromWebResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllUserCollectionFromWeb operation
           */
            public void receiveErrorgetAllUserCollectionFromWeb(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRolesAndPermissionsForSite method
            * override this method for handling normal response from getRolesAndPermissionsForSite operation
            */
           public void receiveResultgetRolesAndPermissionsForSite(
                    com.google.code.sharepoint.soap.UserGroupStub.GetRolesAndPermissionsForSiteResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRolesAndPermissionsForSite operation
           */
            public void receiveErrorgetRolesAndPermissionsForSite(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateGroupInfo method
            * override this method for handling normal response from updateGroupInfo operation
            */
           public void receiveResultupdateGroupInfo(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateGroupInfo operation
           */
            public void receiveErrorupdateGroupInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUserFromWeb method
            * override this method for handling normal response from removeUserFromWeb operation
            */
           public void receiveResultremoveUserFromWeb(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUserFromWeb operation
           */
            public void receiveErrorremoveUserFromWeb(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeGroup method
            * override this method for handling normal response from removeGroup operation
            */
           public void receiveResultremoveGroup(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeGroup operation
           */
            public void receiveErrorremoveGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateUserInfo method
            * override this method for handling normal response from updateUserInfo operation
            */
           public void receiveResultupdateUserInfo(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateUserInfo operation
           */
            public void receiveErrorupdateUserInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRoleCollectionFromGroup method
            * override this method for handling normal response from getRoleCollectionFromGroup operation
            */
           public void receiveResultgetRoleCollectionFromGroup(
                    com.google.code.sharepoint.soap.UserGroupStub.GetRoleCollectionFromGroupResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRoleCollectionFromGroup operation
           */
            public void receiveErrorgetRoleCollectionFromGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRoleCollectionFromUser method
            * override this method for handling normal response from getRoleCollectionFromUser operation
            */
           public void receiveResultgetRoleCollectionFromUser(
                    com.google.code.sharepoint.soap.UserGroupStub.GetRoleCollectionFromUserResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRoleCollectionFromUser operation
           */
            public void receiveErrorgetRoleCollectionFromUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRoleCollection method
            * override this method for handling normal response from getRoleCollection operation
            */
           public void receiveResultgetRoleCollection(
                    com.google.code.sharepoint.soap.UserGroupStub.GetRoleCollectionResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRoleCollection operation
           */
            public void receiveErrorgetRoleCollection(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserCollectionFromRole method
            * override this method for handling normal response from getUserCollectionFromRole operation
            */
           public void receiveResultgetUserCollectionFromRole(
                    com.google.code.sharepoint.soap.UserGroupStub.GetUserCollectionFromRoleResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserCollectionFromRole operation
           */
            public void receiveErrorgetUserCollectionFromRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRoleCollectionFromWeb method
            * override this method for handling normal response from getRoleCollectionFromWeb operation
            */
           public void receiveResultgetRoleCollectionFromWeb(
                    com.google.code.sharepoint.soap.UserGroupStub.GetRoleCollectionFromWebResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRoleCollectionFromWeb operation
           */
            public void receiveErrorgetRoleCollectionFromWeb(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addGroupToRole method
            * override this method for handling normal response from addGroupToRole operation
            */
           public void receiveResultaddGroupToRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addGroupToRole operation
           */
            public void receiveErroraddGroupToRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addUserToGroup method
            * override this method for handling normal response from addUserToGroup operation
            */
           public void receiveResultaddUserToGroup(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUserToGroup operation
           */
            public void receiveErroraddUserToGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroupCollectionFromRole method
            * override this method for handling normal response from getGroupCollectionFromRole operation
            */
           public void receiveResultgetGroupCollectionFromRole(
                    com.google.code.sharepoint.soap.UserGroupStub.GetGroupCollectionFromRoleResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroupCollectionFromRole operation
           */
            public void receiveErrorgetGroupCollectionFromRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeRole method
            * override this method for handling normal response from removeRole operation
            */
           public void receiveResultremoveRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeRole operation
           */
            public void receiveErrorremoveRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeGroupFromRole method
            * override this method for handling normal response from removeGroupFromRole operation
            */
           public void receiveResultremoveGroupFromRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeGroupFromRole operation
           */
            public void receiveErrorremoveGroupFromRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserCollectionFromWeb method
            * override this method for handling normal response from getUserCollectionFromWeb operation
            */
           public void receiveResultgetUserCollectionFromWeb(
                    com.google.code.sharepoint.soap.UserGroupStub.GetUserCollectionFromWebResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserCollectionFromWeb operation
           */
            public void receiveErrorgetUserCollectionFromWeb(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addGroup method
            * override this method for handling normal response from addGroup operation
            */
           public void receiveResultaddGroup(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addGroup operation
           */
            public void receiveErroraddGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addUserToRole method
            * override this method for handling normal response from addUserToRole operation
            */
           public void receiveResultaddUserToRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUserToRole operation
           */
            public void receiveErroraddUserToRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addRole method
            * override this method for handling normal response from addRole operation
            */
           public void receiveResultaddRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addRole operation
           */
            public void receiveErroraddRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroupCollection method
            * override this method for handling normal response from getGroupCollection operation
            */
           public void receiveResultgetGroupCollection(
                    com.google.code.sharepoint.soap.UserGroupStub.GetGroupCollectionResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroupCollection operation
           */
            public void receiveErrorgetGroupCollection(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addRoleDef method
            * override this method for handling normal response from addRoleDef operation
            */
           public void receiveResultaddRoleDef(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addRoleDef operation
           */
            public void receiveErroraddRoleDef(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserCollectionFromGroup method
            * override this method for handling normal response from getUserCollectionFromGroup operation
            */
           public void receiveResultgetUserCollectionFromGroup(
                    com.google.code.sharepoint.soap.UserGroupStub.GetUserCollectionFromGroupResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserCollectionFromGroup operation
           */
            public void receiveErrorgetUserCollectionFromGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserLoginFromEmail method
            * override this method for handling normal response from getUserLoginFromEmail operation
            */
           public void receiveResultgetUserLoginFromEmail(
                    com.google.code.sharepoint.soap.UserGroupStub.GetUserLoginFromEmailResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserLoginFromEmail operation
           */
            public void receiveErrorgetUserLoginFromEmail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroupCollectionFromWeb method
            * override this method for handling normal response from getGroupCollectionFromWeb operation
            */
           public void receiveResultgetGroupCollectionFromWeb(
                    com.google.code.sharepoint.soap.UserGroupStub.GetGroupCollectionFromWebResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroupCollectionFromWeb operation
           */
            public void receiveErrorgetGroupCollectionFromWeb(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroupInfo method
            * override this method for handling normal response from getGroupInfo operation
            */
           public void receiveResultgetGroupInfo(
                    com.google.code.sharepoint.soap.UserGroupStub.GetGroupInfoResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroupInfo operation
           */
            public void receiveErrorgetGroupInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateRoleInfo method
            * override this method for handling normal response from updateRoleInfo operation
            */
           public void receiveResultupdateRoleInfo(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateRoleInfo operation
           */
            public void receiveErrorupdateRoleInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUserCollectionFromRole method
            * override this method for handling normal response from removeUserCollectionFromRole operation
            */
           public void receiveResultremoveUserCollectionFromRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUserCollectionFromRole operation
           */
            public void receiveErrorremoveUserCollectionFromRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroupCollectionFromSite method
            * override this method for handling normal response from getGroupCollectionFromSite operation
            */
           public void receiveResultgetGroupCollectionFromSite(
                    com.google.code.sharepoint.soap.UserGroupStub.GetGroupCollectionFromSiteResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroupCollectionFromSite operation
           */
            public void receiveErrorgetGroupCollectionFromSite(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUserFromGroup method
            * override this method for handling normal response from removeUserFromGroup operation
            */
           public void receiveResultremoveUserFromGroup(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUserFromGroup operation
           */
            public void receiveErrorremoveUserFromGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserCollection method
            * override this method for handling normal response from getUserCollection operation
            */
           public void receiveResultgetUserCollection(
                    com.google.code.sharepoint.soap.UserGroupStub.GetUserCollectionResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserCollection operation
           */
            public void receiveErrorgetUserCollection(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateRoleDefInfo method
            * override this method for handling normal response from updateRoleDefInfo operation
            */
           public void receiveResultupdateRoleDefInfo(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateRoleDefInfo operation
           */
            public void receiveErrorupdateRoleDefInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGroupCollectionFromUser method
            * override this method for handling normal response from getGroupCollectionFromUser operation
            */
           public void receiveResultgetGroupCollectionFromUser(
                    com.google.code.sharepoint.soap.UserGroupStub.GetGroupCollectionFromUserResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGroupCollectionFromUser operation
           */
            public void receiveErrorgetGroupCollectionFromUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUserCollectionFromGroup method
            * override this method for handling normal response from removeUserCollectionFromGroup operation
            */
           public void receiveResultremoveUserCollectionFromGroup(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUserCollectionFromGroup operation
           */
            public void receiveErrorremoveUserCollectionFromGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserInfo method
            * override this method for handling normal response from getUserInfo operation
            */
           public void receiveResultgetUserInfo(
                    com.google.code.sharepoint.soap.UserGroupStub.GetUserInfoResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserInfo operation
           */
            public void receiveErrorgetUserInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addUserCollectionToGroup method
            * override this method for handling normal response from addUserCollectionToGroup operation
            */
           public void receiveResultaddUserCollectionToGroup(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUserCollectionToGroup operation
           */
            public void receiveErroraddUserCollectionToGroup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRoleInfo method
            * override this method for handling normal response from getRoleInfo operation
            */
           public void receiveResultgetRoleInfo(
                    com.google.code.sharepoint.soap.UserGroupStub.GetRoleInfoResult_type0 result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRoleInfo operation
           */
            public void receiveErrorgetRoleInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUserFromSite method
            * override this method for handling normal response from removeUserFromSite operation
            */
           public void receiveResultremoveUserFromSite(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUserFromSite operation
           */
            public void receiveErrorremoveUserFromSite(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeUserFromRole method
            * override this method for handling normal response from removeUserFromRole operation
            */
           public void receiveResultremoveUserFromRole(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeUserFromRole operation
           */
            public void receiveErrorremoveUserFromRole(java.lang.Exception e) {
            }
                


    }
    