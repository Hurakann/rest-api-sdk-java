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
public class UserNotificationsC {
    
    /**
     * Title for the notification.
     */
    private String title;
    
    /**
     * Message body of the notification.
     */
    private String message;
    
    /**
     * Branch id of the user owner of the notification.
     */
    private String branch_id;

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
     * Message body of the notification.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Message body of the notification.
     * 
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Branch id of the user owner of the notification.
     * 
     * @return the branch_id
     */
    public String getBranch_id() {
        return branch_id;
    }

    /**
     * Branch id of the user owner of the notification.
     * 
     * @param branch_id the branch_id to set
     */
    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }
    
    
}
