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
 * POJO class for parent login info based on API responses.
 * 
 * @author zgbjgg
 */
public class Parent {
    
    /**
     * The name of the parent user.
     */
    private String name;
    
    /**
     * The branch of the parent user.
     */
    private String branch_id;
    
    /**
     * The user id of the parent user.
     */
    private String user_id;
    
    /**
     * The color user for the parent user.
     */
    private String coloruser;

    /**
     * @return the name of the parent user
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the parent user name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the branch_id of the parent user
     */
    public String getBranch_id() {
        return branch_id;
    }

    /**
     * @param branch_id the parent user branch_id to set
     */
    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    /**
     * @return the user_id of the parent user
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the parent user user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the coloruser of the parent user
     */
    public String getColoruser() {
        return coloruser;
    }

    /**
     * @param coloruser the parent user coloruser to set
     */
    public void setColoruser(String coloruser) {
        this.coloruser = coloruser;
    }
    
}
