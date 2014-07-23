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
package org.hova.hover.sdk.pojo.profiles;

/**
 * POJO class for profiles creation
 * 
 * @author zgbjgg
 */
public class ProfileC {
    
    /**
     * The user id owner of profile.
     */
    private String user_id;
    
    /**
     * The name of the profile. 
     */
    private String name;
    
    /**
     * The id where this profile is based (maybe null).
     */
    private String based_on_id;

    /**
     * The user id owner of profile.
     * 
     * @return the user id owner of profile
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * The user id owner of profile.
     * 
     * @param user_id the profile owner user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * The name of the profile.
     * 
     * @return the name of the profile
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the profile.
     * 
     * @param name the profile name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The id where this profile is based (maybe null).
     * 
     * @return the based_on_id of profile
     */
    public String getBased_on_id() {
        return based_on_id;
    }

    /**
     * The id where this profile is based (maybe null).
     * 
     * @param based_on_id the profile based_on_id to set
     */
    public void setBased_on_id(String based_on_id) {
        this.based_on_id = based_on_id;
    }
    
    
    
}
