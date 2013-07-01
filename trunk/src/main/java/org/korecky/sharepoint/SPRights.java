/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.util.EnumSet;

/**
 *
 * @author vkorecky
 */
public enum SPRights {

    AddAndCustomizePages(0x00040000, "Add, change, or delete ASPX pages, HTML pages, or Web Part Pages, and edit the Web site using a Windows SharePoint Services-compatible editor."),
    AddDelPrivateWebParts(0x10000000, "Add or remove Web Parts on a personalized Web Part Page."),
    AddListItems(0x00000002, "Add items to lists, add documents to document libraries, and add Web discussion comments."),
    ApplyStyleSheets(0x00100000, "Apply a style sheet (.CSS file) to the Web site."),
    ApplyThemeAndBorder(0x00080000, "Apply a theme or borders to the entire Web site."),
    BrowseDirectories(0x04000000, "Browse directories in a Web site."),
    BrowseUserInfo(0x08000000, "View information about users. This right is not available through the user interface."),
    CancelCheckout(0x00000100, "Check in a document without saving the current changes."),
    CreatePersonalGroups(0x01000000, "Create, change, and delete site groups, including adding users to the site groups and specifying which rights are assigned to a site group."),
    CreateSSCSite(0x00400000, "Create a Web site using Self-Service Site Creation."),
    DeleteListItems(0x00000008, "Delete items from a list, documents from a document library, and Web discussion comments in documents."),
    EditListItems(0x00000004, "Edit items in lists, edit documents in document libraries, edit Web discussion comments in documents, and customize Web Part Pages in document libraries."),
    EmptyMask(0x00000000, "Has no permissions on the Web site. Not available through the user interface."),
    FullMask(-1, "Has all permissions on the Web site. Not available through the user interface."),
    ManageListPermissions(0x00000400, "Grant, deny, or change user permissions to a list."),
    ManageLists(0x00000800, "Approve content in lists, add or remove columns in a list, and add or remove public views of a list."),
    ManagePersonalViews(0x00000200, "Create, change, and delete personal views of lists."),
    ManageRoles(0x02000000, "Create, change, and delete site groups, including adding users to the site groups and specifying which rights are assigned to a site group."),
    ManageSubwebs(0x00800000, "Manage or create subsites."),
    ManageWeb(0x40000000, "Manage a site, including the ability to perform all administration tasks for the site and manage contents and permissions"),
    OpenWeb(0x00010000, "Open the SharePoint Web site and get metadata related to the site, as well as see the underlying navigation structure (not exposed in the user interface)."),
    UpdatePersonalWebParts(0x20000000, "Update Web Parts to display personalized information."),
    ViewListItems(0x00000001, "View items in lists, documents in document libraries, view Web discussion comments, and set up e-mail alerts for lists."),
    ViewPages(0x00020000, "View pages in a Web site."),
    ViewUsageData(0x00200000, "View reports on Web site usage.");
    private final int mask;
    private final String description;

    private SPRights(int mask, String description) {
        this.mask = mask;
        this.description = description;
    }

    public int getMask() {
        return mask;
    }

    public String getDescription() {
        return description;
    }

    public static EnumSet<SPRights> parse(int value) {
        EnumSet<SPRights> rights = null;
        for (SPRights enumItem : SPRights.values()) {
            if ((value & enumItem.getMask()) == enumItem.getMask()) {
                rights.add(enumItem);
            }
        }
        return rights;
    }
}
