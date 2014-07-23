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
public class UserNotificationsF {
    
    /**
     * Title for the notification.
     */
    private String title;
    
    /**
     * Status of the notification, if it's read or not.
     */
    private boolean read;
    
    /**
     * Id for the notification.
     */
    private String notification_id;
    
    /**
     * Time when was created the notification.
     */
    private String time;
    
    /**
     * Date when was created the notification.
     */
    private String date;

    /**
     * Title for the notification.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Title for the notification.
     * 
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Status of the notification, if it's read or not.
     * 
     * @return the read
     */
    public boolean isRead() {
        return read;
    }

    /**
     * Status of the notification, if it's read or not.
     * 
     * @param read the read to set
     */
    public void setRead(boolean read) {
        this.read = read;
    }

    /**
     * Id for the notification.
     * 
     * @return the notification_id
     */
    public String getNotification_id() {
        return notification_id;
    }

    /**
     * Id for the notification.
     * 
     * @param notification_id the notification_id to set
     */
    public void setNotification_id(String notification_id) {
        this.notification_id = notification_id;
    }

    /**
     * Time when was created the notification.
     * 
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * Time when was created the notification.
     * 
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Date when was created the notification.
     * 
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Date when was created the notification.
     * 
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
