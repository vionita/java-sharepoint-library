package org.korecky.sharepoint.sp2007;

import com.microsoft.schemas.sharepoint.soap.alerts.Alert;
import com.microsoft.schemas.sharepoint.soap.alerts.AlertInfo;
import com.microsoft.schemas.sharepoint.soap.alerts.DeliveryChannel;
import com.microsoft.schemas.sharepoint.soap.alerts.EmailChannel;
import java.net.MalformedURLException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a SharePoint Foundation website.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPWeb extends org.korecky.sharepoint.general.SPWeb {
    
    protected SPWeb() {
        super();
    }
    
    protected SPWeb(String title, String url) {
        super(title, url);
    }

    /**
     * Gets the collection of alerts for the site or subsite.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public List<SPAlert> getAlerts() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        List<SPAlert> alertCollection = null;
        AlertInfo alertInfo = getAlertsWs();
        if (alertInfo != null) {
            alertCollection = new ArrayList<>();
            for (Alert tmpAlert : alertInfo.getAlerts().getAlert()) {
                if (tmpAlert.getDeliveryChannels() != null) {
                    for (DeliveryChannel deliveryChanel : tmpAlert.getDeliveryChannels().getDeliveryChannel()) {
                        Map<String, String> properties = new HashMap<>();
                        properties.put("id", tmpAlert.getId());
                        properties.put("Title", tmpAlert.getTitle());
                        properties.put("AlertForTitle", tmpAlert.getAlertForTitle());
                        properties.put("AlertForUrl", tmpAlert.getAlertForUrl());
                        properties.put("EditAlertUrl", tmpAlert.getEditAlertUrl());
                        properties.put("EventType", tmpAlert.getEventType());
                        properties.put("Active", String.valueOf(tmpAlert.isActive()));
                        if (deliveryChanel instanceof EmailChannel) {
                            EmailChannel emailChanel = (EmailChannel) deliveryChanel;
                            properties.put("DeliveryChannels ", "Email");
                            properties.put("Address", emailChanel.getAddress());
                            properties.put("Frequency", emailChanel.getFrequency());
                            org.korecky.sharepoint.general.SPAlert.SPAlertStatus alertStatus = org.korecky.sharepoint.general.SPAlert.SPAlertStatus.Off;
                            if (tmpAlert.isActive()) {
                                alertStatus = org.korecky.sharepoint.general.SPAlert.SPAlertStatus.On;
                            }
                            SPAlert alert = new SPAlert(tmpAlert.getId(),
                                    org.korecky.sharepoint.general.SPAlert.SPAlertFrequency.valueOf(emailChanel.getFrequency()),
                                    tmpAlert.getTitle(),
                                    org.korecky.sharepoint.general.SPAlert.SPEventType.valueOf(tmpAlert.getEventType()),
                                    tmpAlert.getAlertForUrl(),
                                    alertStatus,
                                    properties,
                                    org.korecky.sharepoint.general.SPAlert.SPAlertDeliveryChannels.Email);
                            alertCollection.add(alert);
                        }
                    }
                }
            }
        }
        return alertCollection;
    }
}
