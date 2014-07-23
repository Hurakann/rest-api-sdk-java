/**----------------------------------------------------------------------
*** Copyright: (c) 2013-2014 Hova Networks S.A.P.I. de C.V.
*** All rights reserved.
***
*** Redistribution and use in any form, with or without modification,
*** is strictly prohibited.
***
*** Created by : Jorge Garrido <jorge.garrido@hovanetworks.com> [zgb]
***---------------------------------------------------------------------
**/
package org.hova.hover.sdk.pojo.notifications;

/**
 * POJO class for user notifications json structure based on API responses.
 * 
 * @author zgbjgg
 */
public class UserNotificationsU {
    
    /**
     * Id for the notification.
     */
    private String notification_id;
    
    /**
     * Status for the notification, if it's read or not.
     */
    private boolean read;

    /**
     *  Id for the notification.
     * 
     * @return the notification_id
     */
    public String getNotification_id() {
        return notification_id;
    }

    /**
     *  Id for the notification.
     * 
     * @param notification_id the notification_id to set
     */
    public void setNotification_id(String notification_id) {
        this.notification_id = notification_id;
    }

    /**
     * Status for the notification, if it's read or not.
     * 
     * @return the read
     */
    public boolean isRead() {
        return read;
    }

    /**
     * Status for the notification, if it's read or not.
     * 
     * @param read the read to set
     */
    public void setRead(boolean read) {
        this.read = read;
    }
    
}
