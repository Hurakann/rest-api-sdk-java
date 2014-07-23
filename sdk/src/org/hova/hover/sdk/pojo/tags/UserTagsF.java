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
package org.hova.hover.sdk.pojo.tags;

/**
 * POJO class for user tags json structure based on API responses (only to fetch).
 * 
 * @author zgbjgg
 */
public class UserTagsF {
    
    /**
     * Tags for the user.
     */
    private String[] tags;

    /**
     * Tags for the user.
     * 
     * @return the tags
     */
    public String[] getTags() {
        return tags;
    }

    /**
     * Tags for the user.
     * 
     * @param tags the tags to set
     */
    public void setTags(String[] tags) {
        this.tags = tags;
    }
    
}
