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
package org.hova.hover.sdk.pojo.login;

/**
 * POJO class for user login info based on API responses.
 * 
 * @author zgbjgg
 */
public class UserLogin {
    
    /**
     * The user id for the logged user.
     */
    private String user_id;
    
    /**
     * The user name for the logged user.
     */
    private String name;
    
    /**
     * The user lastname for the logged user.
     */
    private String lastname;
    
    /**
     * The user lastname2 for the logged user.
     */
    private String lastname2;
    
    /**
     * The user language for the logged user.
     */
    private String language;
    
    /**
     * The user branches info for the logged user.
     */
    private Branches[] branches;

    /**
     * @return the user_id of the user
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the user name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname of the user
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the user lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the lastname2 of the user
     */
    public String getLastname2() {
        return lastname2;
    }

    /**
     * @param lastname2 the user lastname2 to set
     */
    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    /**
     * @return the language of the user
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the user language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the branches info of the user
     */
    public Branches[] getBranches() {
        return branches;
    }

    /**
     * @param branches the user branches info to set
     */
    public void setBranches(Branches[] branches) {
        this.branches = branches;
    }
    
}
