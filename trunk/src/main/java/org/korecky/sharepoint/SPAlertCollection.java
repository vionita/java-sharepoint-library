/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.alerts.Alert;
import com.microsoft.schemas.sharepoint.soap.alerts.AlertInfo;

/**
 *
 * @author vkorecky
 */
public class SPAlertCollection extends SPBaseCollection<SPAlert> {

    private final String webAbsluteUrl;

    protected SPAlertCollection(String webAbsluteUrl) {
        super();
        this.webAbsluteUrl = webAbsluteUrl;
    }

    void loadFromXml(AlertInfo alertInfo) {
        if (alertInfo != null) {
            for (Alert tmpAlert : alertInfo.getAlerts().getAlert()) {
                SPAlert alert = new SPAlert(webAbsluteUrl);
                alert.loadFromAlert(tmpAlert);
                items.add(alert);
            }
        }
    }
}
