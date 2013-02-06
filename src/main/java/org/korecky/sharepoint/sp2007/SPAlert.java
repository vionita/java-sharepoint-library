/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint.sp2007;

import java.util.Map;

/**
 *
 * @author vkorecky
 */
public class SPAlert extends org.korecky.sharepoint.general.SPAlert {

    protected SPAlert(String id, SPAlertFrequency alertFrequency, String title, SPEventType eventType, String listUrl, SPAlertStatus status, Map<String, String> properties, SPAlertDeliveryChannels deliveryChannels) {
        super(id, alertFrequency, title, eventType, listUrl, status, properties, deliveryChannels);
    }
    
}
