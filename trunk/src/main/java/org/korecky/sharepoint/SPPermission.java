/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.util.EnumSet;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;

/**
 *
 * @author vkorecky
 */
public class SPPermission {

    private SPBasePermissions basePermissions;
    private SPMember member;
    private Object parent;
    private EnumSet<SPRights> permissionMask;
    private final String webAbsoluteUrl;

    protected SPPermission(Object parent, String webAbsoluteUrl) {
        this.parent = parent;
        this.webAbsoluteUrl = webAbsoluteUrl;
    }

    void loadFromXml(Element rootElement) {
        // Parse XML file                            
        if (StringUtils.equals(rootElement.getLocalName(), "Permission")) {
            member = new SPMember(Integer.parseInt(rootElement.getAttribute("MemberID")));
            permissionMask = SPRights.parse(Integer.parseInt(rootElement.getAttribute("Mask")));
        }
    }

    /**
     * Modifies site-level permissions for the site group that exists on the
     * site, or adds or modifies permissions to the specified list for the user,
     * site group, or cross-site group that exists on the site.
     *
     * @param objectName
     * @param objectType
     * @param permissionIdentifier
     * @param permissionType
     * @param permissionMask
     */
    public void AddPermission(
            String objectName,
            String objectType,
            String permissionIdentifier,
            String permissionType,
            int permissionMask) {
    }

    /**
     * Gets the base permissions for the permission.
     *
     * @return
     */
    public SPBasePermissions getBasePermissions() {
        return basePermissions;
    }

    /**
     * Gets the member object for the user or group that has the permission.
     *
     * @return
     */
    public SPMember getMember() {
        return member;
    }

    /**
     * Gets the parent object for the specified permission object, which can be
     * a list or a Web site.
     *
     * @return
     */
    public Object getParent() {
        return parent;
    }

    /**
     * Gets or sets the rights for the permission mask of the user or group.
     *
     * @return
     */
    public EnumSet<SPRights> getPermissionMask() {
        return permissionMask;
    }
}
