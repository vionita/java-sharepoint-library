package org.korecky.sharepoint;

import java.util.EnumSet;

/**
 *
 * @author vkorecky
 */
public enum SPBasePermissions {

    EmptyMask(0x0000000000000000L, "Has no permissions on the Web site. Not available through the user interface."),
    ViewListItems(0x0000000000000001L, "View items in lists, documents in document libraries, and view Web discussion comments."),
    AddListItems(0x0000000000000002L, "Add items to lists, add documents to document libraries, and add Web discussion comments."),
    EditListItems(0x0000000000000004L, "Edit items in lists, edit documents in document libraries, edit Web discussion comments in documents, and customize Web Part Pages in document libraries."),
    DeleteListItems(0x0000000000000008L, "Delete items from a list, documents from a document library, and Web discussion comments in documents."),
    ApproveItems(0x0000000000000010L, "Approve a minor version of a list item or document."),
    OpenItems(0x0000000000000020L, "View the source of documents with server-side file handlers."),
    ViewVersions(0x0000000000000040L, "View past versions of a list item or document."),
    DeleteVersions(0x0000000000000080L, "Delete past versions of a list item or document."),
    CancelCheckout(0x0000000000000100L, "Discard or check in a document which is checked out to another user."),
    ManagePersonalViews(0x0000000000000200L, "Create, change, and delete personal views of lists."),
    ManageLists(0x0000000000000800L, "Create and delete lists, add or remove columns in a list, and add or remove public views of a list."),
    ViewFormPages(0x0000000000001000L, "View forms, views, and application pages, and enumerate lists."),
    AnonymousSearchAccessList(0x0000000000002000L, "Make content of a list or document library retrieveable for anonymous users through SharePoint search. The list permissions in the site do not change."),
    Open(0x0000000000010000L, "Allow users to open a Web site, list, or folder to access items inside that container."),
    ViewPages(0x0000000000020000L, "View pages in a Web site."),
    AddAndCustomizePages(0x0000000000040000L, "Add, change, or delete HTML pages or Web Part Pages, and edit the Web site using a SharePoint Foundation–compatible editor."),
    ApplyThemeAndBorder(0x0000000000080000L, "Apply a theme or borders to the entire Web site."),
    ApplyStyleSheets(0x0000000000100000L, "Apply a style sheet (.css file) to the Web site."),
    ViewUsageData(0x0000000000200000L, "View reports on Web site usage."),
    CreateSSCSite(0x0000000000400000L, "Create a Web site using Self-Service Site Creation."),
    ManageSubwebs(0x0000000000800000L, "Create subsites such as team sites, Meeting Workspace sites, and Document Workspace sites."),
    CreateGroups(0x0000000001000000L, "Create a group of users that can be used anywhere within the site collection."),
    ManagePermissions(0x0000000002000000L, "Create and change permission levels on the Web site and assign permissions to users and groups."),
    BrowseDirectories(0x0000000004000000L, "Enumerate files and folders in a Web site using Microsoft Office SharePoint Designer 2007 and WebDAV interfaces."),
    BrowseUserInfo(0x0000000008000000L, "View information about users of the Web site."),
    AddDelPrivateWebParts(0x0000000010000000L, "Add or remove personal Web Parts on a Web Part Page."),
    UpdatePersonalWebParts(0x0000000020000000L, "Update Web Parts to display personalized information."),
    ManageWeb(0x0000000040000000L, "Grant the ability to perform all administration tasks for the Web site as well as manage content. Activate, deactivate, or edit properties of Web site scoped Features through the object model or through the user interface (UI). When granted on the root Web site of a site collection, activate, deactivate, or edit properties of site collection scoped Features through the object model. To browse to the Site Collection Features page and activate or deactivate site collection scoped Features through the UI, you must be a site collection administrator."),
    AnonymousSearchAccessWebLists(0x0000000080000000L, "Content of lists and document libraries in the Web site will be retrieveable for anonymous users through SharePoint search if the list or document library has AnonymousSearchAccessList set."),
    UseClientIntegration(0x0000001000000000L, "Use features that launch client applications; otherwise, users must work on documents locally and upload changes. "),
    UseRemoteAPIs(0x0000002000000000L, "Use SOAP, WebDAV, or Microsoft Office SharePoint Designer 2007 interfaces to access the Web site."),
    ManageAlerts(0x0000004000000000L, "Manage alerts for all users of the Web site."),
    CreateAlerts(0x0000008000000000L, "Create e-mail alerts."),
    EditMyUserInfo(0x0000010000000000L, "Allows a user to change his or her user information, such as adding a picture."),
    EnumeratePermissions(0x4000000000000000L, "Enumerate permissions on the Web site, list, folder, document, or list item."),
    FullMask(0x7FFFFFFFFFFFFFFFL, "Has all permissions on the Web site. Not available through the user interface.");
    private final long mask;
    private final String description;

    private SPBasePermissions(long mask, String description) {
        this.mask = mask;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public long getMask() {
        return mask;
    }

    public static EnumSet<SPBasePermissions> parse(long value) {
        EnumSet<SPBasePermissions> permissions = null;
        for (SPBasePermissions enumItem : SPBasePermissions.values()) {
            if ((value & enumItem.getMask()) == enumItem.getMask()) {
                permissions.add(enumItem);
            }
        }
        return permissions;
    }
}
