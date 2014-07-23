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
 * POJO class for profiles update
 * 
 * @author zgbjgg
 */
public class ProfileU {
 
    /**
     * Id for the profile.
     */
    private String profile_id;
    
    /**
     * Name for the profile.
     */
    private String name;

    /**
     * Id for the profile.
     * 
     * @return the profile_id
     */
    public String getProfile_id() {
        return profile_id;
    }

    /**
     * Id for the profile.
     * 
     * @param profile_id the profile_id to set
     */
    public void setProfile_id(String profile_id) {
        this.profile_id = profile_id;
    }

    /**
     * Name for the profile.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Name for the profile.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
