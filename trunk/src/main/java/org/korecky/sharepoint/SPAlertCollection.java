/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.alerts.Alert;
import com.microsoft.schemas.sharepoint.soap.alerts.AlertInfo;
import java.util.UUID;

/**
 *
 * @author vkorecky
 */
public class SPAlertCollection extends SPBaseCollection<SPAlert> {
// TODO:
//Public property 	Site 	Gets the parent site collection for the collection. This property is deprecated.
//Public property 	Web 	Gets the parent Web site of the collection. This property is deprecated.
//Public method 	Add() 	Adds an alert to the collection of alerts for the specified title, list, event type bitmask, time interval, and filter.
//Public method 	Add(SPList, SPEventType, SPAlertFrequency) 	Deprecated. Use Add(SPList, SPEventType, SPAlertFrequency, SPAlertDeliveryChannels) instead.
//Public method 	Add(SPListItem, SPEventType, SPAlertFrequency) 	Adds an alert to the collection of alerts for a list item based on the specified event type and time interval. This method overload is deprecated. Use Add(SPListItem, SPEventType, SPAlertFrequency, SPAlertDeliveryChannels) instead.
//Public method 	Add(SPList, SPEventType, SPAlertFrequency, SPAlertDeliveryChannels) 	Adds an alert for a list to the collection.
//Public method 	Add(SPListItem, SPEventType, SPAlertFrequency, SPAlertDeliveryChannels) 	Adds an alert for a list item to the collection.
//Public method 	Delete(Guid) 	Deletes the alert with the specified GUID from the collection.
//Public method 	Delete(Int32) 	Deletes the alert at the specified index in the collection.
//Public method 	Equals 	(Inherited from Object.)
//Protected method 	Finalize 	(Inherited from Object.)
//Public method 	GetEnumerator 	Gets an enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetHashCode 	(Inherited from Object.)
//Public method 	GetType 	(Inherited from Object.)
//Public method 	GetTypedEnumerator<T> 	Returns a type-safe enumerator to iterate through the collection. (Inherited from SPBaseCollection.)
//Public method 	GetUniqueUsers 	Returns a string array that lists all the users of a site, without listing them more than once, who receive alerts for list items.
//Protected method 	MemberwiseClone 	(Inherited from Object.)
//Public method 	ToString 	(Inherited from Object.)
    
    
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

    /**
     * Gets the alert with the specified GUID from the collection.
     * @param id
     * @return 
     */    
    public SPAlert getItem(UUID id) {
        SPAlert foundAlert = null;
        if (items != null) {
            for (SPAlert alert : items) {
                if (alert.getId().equals(id)) {
                    foundAlert = alert;
                    break;
                }
            }
        }
        return foundAlert;
    }
}
