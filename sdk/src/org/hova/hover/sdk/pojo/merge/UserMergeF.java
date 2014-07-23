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
package org.hova.hover.sdk.pojo.merge;

/**
 * POJO class for user merge json structure based on API responses.
 * 
 * @author zgbjgg
 */
public class UserMergeF {
    
    /**
     * The user id merged into a collection.
     */
    private String user_id;
    
    /**
     * The name of the user merged.
     */
    private String name;
    
    /**
     * The type of the user merged: main, merge or free.
     */
    private String merge;

    /**
     * The user id merged into a collection.
     * 
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * The user id merged into a collection.
     * 
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * The name of the user merged.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the user merged.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The type of the user merged: main, merge or free.
     * 
     * @return the merge
     */
    public String getMerge() {
        return merge;
    }

    /**
     * The type of the user merged: main, merge or free.
     * 
     * @param merge the merge to set
     */
    public void setMerge(String merge) {
        this.merge = merge;
    }
    
}
