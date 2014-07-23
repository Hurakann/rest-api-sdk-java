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
package org.hova.hover.sdk.pojo;

/**
 * POJO class for user json structure based on API responses (only to fetch).
 * 
 * @author zgbjgg
 */
public class UserC {
    
    /**
     * User id of the registered user.
     */
    private String user_id;
    
    /**
     * Returns 'i_nfc_unresolved' if couldn't assign nfc to user, 'i_nfc_resolved' otherwise.
     */
    private String i_nfc;
    
    /**
     * Returns 'i_services_unresolved' if couldn't assign nfc to user, 'i_services_resolved' otherwise.
     */
    private String i_services;

    /**
     * The user id of the registered user
     * 
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * The user id of the registered user
     * 
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * Returns 'i_nfc_unresolved' if couldn't assign nfc to user, 'i_nfc_resolved' otherwise. 
     * 
     * @return the i_nfc
     */
    public String getI_nfc() {
        return i_nfc;
    }

    /**
     * Returns 'i_nfc_unresolved' if couldn't assign nfc to user, 'i_nfc_resolved' otherwise.
     * 
     * @param i_nfc the i_nfc to set
     */
    public void setI_nfc(String i_nfc) {
        this.i_nfc = i_nfc;
    }

    /**
     * Returns 'i_services_unresolved' if couldn't assign nfc to user, 'i_services_resolved' otherwise.
     * 
     * @return the i_services
     */
    public String getI_services() {
        return i_services;
    }

    /**
     * Returns 'i_services_unresolved' if couldn't assign nfc to user, 'i_services_resolved' otherwise.
     * 
     * @param i_services the i_services to set
     */
    public void setI_services(String i_services) {
        this.i_services = i_services;
    }
    
    
    
}
