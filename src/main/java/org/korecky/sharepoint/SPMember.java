/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

/**
 *
 * @author vkorecky
 */
public class SPMember {

    private int id;

    public SPMember(int id) {
        this.id = id;
    }

    /**
     * Gets the member ID for the user or group.
     *
     * @return
     */
    public int getId() {
        return id;
    }
}
