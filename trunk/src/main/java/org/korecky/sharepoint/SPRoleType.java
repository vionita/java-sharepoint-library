package org.korecky.sharepoint;

import java.util.EnumSet;

/**
 * Specifies the types of roles that are available for users and groups.
 *
 * @author vkorecky
 */
public enum SPRoleType {

    Administrator("Has all rights from other site groups, plus rights to manage site groups and view usage analysis data. The Administrator site group cannot be customized or deleted, and there must always be at least one member of the Administrator site group. Members of the Administrator site group always have access to, or can grant themselves access to, any item in the Web site.", EnumSet.of(SPRights.CreateSSCSite, SPRights.ViewListItems, SPRights.ViewPages, SPRights.AddDelPrivateWebParts, SPRights.AddListItems, SPRights.BrowseDirectories, SPRights.CreatePersonalGroups, SPRights.DeleteListItems, SPRights.EditListItems, SPRights.ManagePersonalViews, SPRights.UpdatePersonalWebParts, SPRights.AddAndCustomizePages, SPRights.ApplyStyleSheets, SPRights.ApplyThemeAndBorder, SPRights.CancelCheckout, SPRights.ManageLists, SPRights.ManageListPermissions, SPRights.ManageRoles, SPRights.ManageSubwebs, SPRights.ViewUsageData)),
    Contributor("Has Reader rights, plus rights to add, edit, and delete items, manage list permissions, manage personal views, personalize Web Part Pages, and browse directories. Contributors cannot create new lists or document libraries, but they can add content to existing lists and document libraries.", EnumSet.of(SPRights.CreateSSCSite, SPRights.ViewListItems, SPRights.ViewPages, SPRights.AddDelPrivateWebParts, SPRights.AddListItems, SPRights.BrowseDirectories, SPRights.CreatePersonalGroups, SPRights.DeleteListItems, SPRights.EditListItems, SPRights.ManagePersonalViews, SPRights.UpdatePersonalWebParts)),
    Guest("Has limited rights to view pages and specific page elements. This site group is used for giving users access to a particular page, list, or item in a list, without granting them rights to view the entire site. Users cannot be explicitly added to the Guest site group, rather users who are given access to lists or document libraries by way of per-list permissions are automatically added to the Guest site group. The Guest site group cannot be customized or deleted.", null),
    None("Has no rights on the Web site.", null),
    Reader("Has rights to view items, personalize Web parts, use alerts, and create their own top-level Web site using Self-Service Site Creation. Readers can only read a site; they cannot add content. Note that when a reader creates a site using Self-Service Site Creation, he or she becomes the site owner and a member of the Administrator site group for the new site. This does not affect the users site group membership for any other site.", EnumSet.of(SPRights.CreateSSCSite, SPRights.ViewListItems, SPRights.ViewPages)),
    WebDesigner("Has Contributor rights, plus rights to cancel checkout, delete items, manage lists, add and customize pages, define and apply themes and borders, and link style sheets. Web Designers can modify the structure of the site and create new lists or document libraries.", EnumSet.of(SPRights.CreateSSCSite, SPRights.ViewListItems, SPRights.ViewPages, SPRights.AddDelPrivateWebParts, SPRights.AddListItems, SPRights.BrowseDirectories, SPRights.CreatePersonalGroups, SPRights.DeleteListItems, SPRights.EditListItems, SPRights.ManagePersonalViews, SPRights.UpdatePersonalWebParts, SPRights.AddAndCustomizePages, SPRights.ApplyStyleSheets, SPRights.ApplyThemeAndBorder, SPRights.CancelCheckout, SPRights.ManageLists));
    private final String description;
    private final EnumSet<SPRights> rights;

    private SPRoleType(String description, EnumSet<SPRights> rights) {
        this.description = description;
        this.rights = rights;
    }

    public String getDescription() {
        return description;
    }

    public EnumSet<SPRights> getRights() {
        return rights;
    }
}
