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
 * POJO class for login info structure based on API responses.
 * 
 * @author zgbjgg
 */
public class Profile {
    
    /**
     * The profile name.
     */
    private String name;
    
    /**
     * The profile id.
     */
    private String id;

    /**
     * @return the name of the profile
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the profile name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id of the profile
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the profile id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
}
