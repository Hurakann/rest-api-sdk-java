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
package org.hova.hover.sdk.pojo.services;

/**
 * POJO class for user services json structure based on API responses.
 * 
 * @author zgbjgg
 */
public class UserService {
        
    private String activation_date;
    private String status;
    private String expiration_date;
    private String validity;
    private String service_id;
    private String user_id;

    /**
     * Activation date of the service (format YYYY-MM-DD)
     * 
     * @return the activation_date
     */
    public String getActivation_date() {
        return activation_date;
    }

    /**
     * Activation date of the service (format YYYY-MM-DD)
     * 
     * @param activation_date the activation_date to set
     */
    public void setActivation_date(String activation_date) {
        this.activation_date = activation_date;
    }

    /**
     * Status for the service (true or false)
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Status for the service (true or false)
     * 
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Expiration date of the service (format YYYY-MM-DD)
     * 
     * @return the expiration_date
     */
    public String getExpiration_date() {
        return expiration_date;
    }

    /**
     * Activation date of the service (format YYYY-MM-DD)
     * 
     * @param expiration_date the expiration_date to set
     */
    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    /**
     * Validity for the service (yearly, monthly, so on ...)
     * 
     * @return the validity
     */
    public String getValidity() {
        return validity;
    }

    /**
     * Validity for the service (yearly, monthly, so on ...)
     * 
     * @param validity the validity to set
     */
    public void setValidity(String validity) {
        this.validity = validity;
    }

    /**
     * The id of the service in which user could be assigned
     * 
     * @return the service_id
     */
    public String getService_id() {
        return service_id;
    }

    /**
     * The id of the service in which user could be assigned
     * 
     * @param service_id the service_id to set
     */
    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    /**
     * The user id that could be assigned to the service
     * 
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * The user id that could be assigned to the service
     * 
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }  
    
}
