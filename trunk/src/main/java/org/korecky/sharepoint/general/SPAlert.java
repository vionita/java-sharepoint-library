package org.korecky.sharepoint.general;

import java.util.Dictionary;
import java.util.Map;

/**
 * Represents an alert, which generates periodic e-mail or Short Message Service
 * (SMS) notifications sent to a user about the list, list item, document, or
 * document library to which the alert applies.
 *
 * @author vkorecky
 */
public class SPAlert {

    private String id;
    private SPAlertFrequency alertFrequency;
    private String title;
    private SPEventType eventType;
    private String listUrl;
    private SPAlertStatus status;
    private Map<String,String> properties;
    private SPAlertDeliveryChannels deliveryChannels;

    public SPAlert(String id, SPAlertFrequency alertFrequency, String title, SPEventType eventType, String listUrl, SPAlertStatus status, Map<String,String> properties, SPAlertDeliveryChannels deliveryChannels) {
        this.id = id;
        this.alertFrequency = alertFrequency;
        this.title = title;
        this.eventType = eventType;
        this.listUrl = listUrl;
        this.status = status;
        this.properties = properties;
        this.deliveryChannels = deliveryChannels;
    }

    /**
     * Gets the ID of the alert.
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the time interval for sending the alert.
     *
     * @return
     */
    public SPAlertFrequency getAlertFrequency() {
        return alertFrequency;
    }

    /**
     * Gets the title of the alert as displayed in the user interface.
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the type of event to which the alert applies.
     *
     * @return
     */
    public SPEventType getEventType() {
        return eventType;
    }

    /**
     * Gets or sets the type of event to which the alert applies as a bitmask.
     *
     * @return
     */
    public int getEventTypeBitmask() {
        return eventType.getBitmask();
    }

    /**
     * Gets the site-relative URL of the list to which the alert applies.
     *
     * @return
     */
    public String getListUrl() {
        return listUrl;
    }

    /**
     * Gets the status of the alert.
     *
     * @return
     */
    public SPAlertStatus getStatus() {
        return status;
    }

    /**
     * Gets the properties of the alert.
     *
     * @return
     */
    public Map<String,String> getProperties() {
        return properties;
    }

    /**
     * Gets or sets a value that indicates the delivery method of the alert.
     *
     * @return
     */
    public SPAlertDeliveryChannels getDeliveryChannels() {
        return deliveryChannels;
    }

// TODO:    List	Gets or sets the list or document library to which the alert applies.
// TODO:    ListID	Gets or sets the GUID of the list or document library to which the alert applies.
    /**
     * The SPAlertFrequency enumeration specifies the time interval for sending
     * an alert about changes to a specific list, list item, document library,
     * or document.
     */
    public enum SPAlertFrequency {

        /**
         * Send immediately when the list or list item changes
         */
        Immediate,
        /**
         * Send daily
         */
        Daily,
        /**
         * Send weekly
         */
        Weekly
    };

    /**
     * Specifies the status of an alert.
     */
    public enum SPAlertStatus {

        /**
         * The alert is implemented
         */
        On,
        /**
         * The alert is not implemented
         */
        Off,
        /**
         * The alert is not functional
         */
        Error
    }

    /**
     * Specifies the method of delivering alerts.
     */
    public enum SPAlertDeliveryChannels {

        /**
         * Delivery as E-mail
         */
        Email,
        /**
         * Delivery as SMS message
         */
        Sms
    }

    /**
     * Specifies the type of event for a list, list item, document, or document
     * library to which an alert responds.
     */
    public enum SPEventType {

        /**
         * Additions to the list or list item
         */
        Add(0x00000001),
        /**
         * All changes made in a list or list item
         */
        Modify(0x00000002),
        /**
         * Deletion of a list or list item
         */
        Delete(0x00000004),
        /**
         * Changes in Web discussions
         */
        Discussion(0x00000FF0),
        /**
         * All events pertaining to the list or list item
         */
        All(-1);
        // ID of type
        private int bitmask;

        SPEventType(int bitmask) {
            this.bitmask = bitmask;
        }

        /**
         * Get bitmask
         *
         * @return
         */
        public int getBitmask() {
            return bitmask;
        }
    }
}
