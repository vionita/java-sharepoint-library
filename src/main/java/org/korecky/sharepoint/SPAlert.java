package org.korecky.sharepoint;

import org.korecky.sharepoint.support.WsContext;
import com.microsoft.schemas.sharepoint.soap.alerts.Alert;
import com.microsoft.schemas.sharepoint.soap.alerts.ArrayOfDeleteFailure;
import com.microsoft.schemas.sharepoint.soap.alerts.ArrayOfString;
import com.microsoft.schemas.sharepoint.soap.alerts.DeliveryChannel;
import com.microsoft.schemas.sharepoint.soap.alerts.EmailChannel;
import com.microsoft.schemas.sharepoint.soap.alerts.ErrorType;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private String title;
    private boolean active;
    private SPEventType eventType;
    private String alertForTitle;
    private String alertForUrl;
    private String editAlertUrl;
    private Map<String, String> properties;
    private List<SPDeliveryChannel> deliveryChanels;
    private final String webAbsluteUrl;

    protected SPAlert(String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
    }

    public void loadFromAlert(Alert tmpAlert) {
        id = tmpAlert.getId();
        title = tmpAlert.getTitle();
        alertForUrl = tmpAlert.getAlertForTitle();
        alertForUrl = tmpAlert.getAlertForUrl();
        editAlertUrl = tmpAlert.getEditAlertUrl();
        eventType = SPEventType.valueOf(tmpAlert.getEventType());
        active = tmpAlert.isActive();
        if (tmpAlert.getDeliveryChannels() != null) {
            deliveryChanels = new ArrayList<SPDeliveryChannel>();
            for (DeliveryChannel deliveryChanel : tmpAlert.getDeliveryChannels().getDeliveryChannel()) {
                if (deliveryChanel instanceof EmailChannel) {
                    SPEmailChannel emailChanel = new SPEmailChannel();
                    deliveryChanels.add(emailChanel);
                    emailChanel.address = ((EmailChannel) deliveryChanel).getAddress();
                    emailChanel.alertFrequency = SPAlertFrequency.valueOf(((EmailChannel) deliveryChanel).getFrequency());
                }
            }
        }
    }

    /**
     * Delete current allert from Sharepoint
     *
     * @param tmpAlert
     * @return
     * @throws NoSuchAlgorithmException
     * @throws MalformedURLException
     * @throws KeyManagementException
     */
    public ErrorType delete(Alert tmpAlert) throws NoSuchAlgorithmException, MalformedURLException, KeyManagementException {
        ArrayOfString arrayStr = new ArrayOfString();
        arrayStr.getString().add(id);
        ArrayOfDeleteFailure failureArray = WsContext.getAlertsPort(new URL(webAbsluteUrl)).deleteAlerts(arrayStr);
        return failureArray.getDeleteFailure().get(0).getError();
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

    public boolean isActive() {
        return active;
    }

    public String getAlertForTitle() {
        return alertForTitle;
    }

    public String getAlertForUrl() {
        return alertForUrl;
    }

    public String getEditAlertUrl() {
        return editAlertUrl;
    }

    public List<SPDeliveryChannel> getDeliveryChanels() {
        return deliveryChanels;
    }

    /**
     * Gets the properties of the alert.
     *
     * @return
     */
    public Map<String, String> getProperties() {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("id", id);
        properties.put("Title", title);
        properties.put("AlertForTitle", alertForUrl);
        properties.put("AlertForUrl", alertForUrl);
        properties.put("EditAlertUrl", editAlertUrl);
        properties.put("EventType", String.valueOf(eventType));
        properties.put("Active", String.valueOf(active));
        if (deliveryChanels != null) {
            for (SPDeliveryChannel deliveryChanel : deliveryChanels) {
                if (deliveryChanel instanceof SPEmailChannel) {
                    properties.put("EmailChanel_Frequency", String.valueOf(((SPEmailChannel) deliveryChanel).getAlertFrequency()));
                    properties.put("EmailChanel_Address", ((SPEmailChannel) deliveryChanel).getAddress());
                }
            }
        }
        return properties;
    }

    /**
     * A structure describing how a notification is to be delivered.
     */
    public abstract class SPDeliveryChannel {

        public abstract void loadFromDeliveryChannel(DeliveryChannel deliveryChanel);
    }

    /**
     * Provides the information required to deliver a notification through an
     * electronic mail service.
     */
    public class SPEmailChannel extends SPDeliveryChannel {

        private SPAlertFrequency alertFrequency;
        private String address;

        /**
         *
         * @param deliveryChanel
         */
        @Override
        public void loadFromDeliveryChannel(DeliveryChannel deliveryChanel) {
            throw new UnsupportedOperationException("Not supported yet.");
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
         * Get the string Address.
         *
         * @return
         */
        public String getAddress() {
            return address;
        }
    }

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
