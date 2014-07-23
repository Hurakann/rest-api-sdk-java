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
 * POJO class for branches user & parent login info based on API responses.
 * 
 * @author zgbjgg
 */
public class Branches {
    
    /**
     * The color of the user.
     */
    private String color;
    
    /**
     * The parent user info.
     */
    private Parent parent;
    
    /**
     * The tree id of the user.
     */
    private String tree_id;
    
    /**
     * The branch id of the user.
     */
    private String branch_id;
    
    /**
     * The behaviour id of the user.
     */
    private String behaviour_id;
    
    /**
     * The profile user info.
     */
    private Profile profile;

    /**
     * @return the color of the user
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the user color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the parent info of the user 
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * @param parent the user parent info to set
     */
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    /**
     * @return the tree_id of the user
     */
    public String getTree_id() {
        return tree_id;
    }

    /**
     * @param tree_id the user tree_id to set
     */
    public void setTree_id(String tree_id) {
        this.tree_id = tree_id;
    }

    /**
     * @return the branch_id of the user
     */
    public String getBranch_id() {
        return branch_id;
    }

    /**
     * @param branch_id the user branch_id to set
     */
    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    /**
     * @return the behaviour_id of the user
     */
    public String getBehaviour_id() {
        return behaviour_id;
    }

    /**
     * @param behaviour_id the user behaviour_id to set
     */
    public void setBehaviour_id(String behaviour_id) {
        this.behaviour_id = behaviour_id;
    }

    /**
     * @return the profile info of the user
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * @param profile the user profile info to set
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    
    
    
}
