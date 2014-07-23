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
 * POJO class for profiles fetch
 * 
 * @author zgbjgg
 */
public class ProfileF {
    
    /**
     * Id for the profile.
     */
    private String profile_id;
    
    /**
     * Tree id for the profile.
     */
    private String tree_id;

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
     * Tree id for the profile.
     * 
     * @return the tree_id
     */
    public String getTree_id() {
        return tree_id;
    }

    /**
     * Tree id for the profile.
     * 
     * @param tree_id the tree_id to set
     */
    public void setTree_id(String tree_id) {
        this.tree_id = tree_id;
    }
    
}
