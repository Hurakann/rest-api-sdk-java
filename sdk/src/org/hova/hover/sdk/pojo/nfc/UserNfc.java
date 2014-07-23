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
package org.hova.hover.sdk.pojo.nfc;

/**
 * POJO class for user nfc json structure based on API responses.
 * 
 * @author zgbjgg
 */
public class UserNfc {
    
    /**
     * Delivery date of nfc card.
     */
    private String delivery_date;
    
    /**
     * Date to renewal the nfc card.
     */   
    private String renewal;
    
    /**
     * Status of the nfc card.
     */
    private boolean status;
    
    /**
     * Cost of the nfc card.
     */
    private String cost;
    
    /**
     * User id that nfc is assigned.
     */
    private String user_id;
    
    /**
     * Nfc id of the card (commonly uses the mac address).
     */
    private String nfc_id;
    
    /**
     * Validity of the nfc card.
     */
    private String validity;

    /**
     * Delivery date of nfc card.
     * 
     * @return the delivery_date
     */
    public String getDelivery_date() {
        return delivery_date;
    }

    /**
     * Delivery date of nfc card.
     * 
     * @param delivery_date the delivery_date to set
     */
    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    /**
     * Date to renewal the nfc card.
     * 
     * @return the renewal
     */
    public String getRenewal() {
        return renewal;
    }

    /**
     * Date to renewal the nfc card.
     * 
     * @param renewal the renewal to set
     */
    public void setRenewal(String renewal) {
        this.renewal = renewal;
    }

    /**
     * Status of the nfc card.
     * 
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Status of the nfc card.
     * 
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Cost of the nfc card.
     * 
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * Cost of the nfc card.
     * 
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * User id that nfc is assigned.
     * 
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * User id that nfc is assigned.
     * 
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * Nfc id of the card (commonly uses the mac address).
     * 
     * @return the nfc_id
     */
    public String getNfc_id() {
        return nfc_id;
    }

    /**
     * Nfc id of the card (commonly uses the mac address).
     * 
     * @param nfc_id the nfc_id to set
     */
    public void setNfc_id(String nfc_id) {
        this.nfc_id = nfc_id;
    }

    /**
     * Validity of the nfc card.
     * 
     * @return the validity
     */
    public String getValidity() {
        return validity;
    }

    /**
     * Validity of the nfc card.
     * 
     * @param validity the validity to set
     */
    public void setValidity(String validity) {
        this.validity = validity;
    }
    
    
}
