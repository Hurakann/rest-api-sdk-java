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
public class UserMergeC {
    
    /**
     * The branch id of the main user.
     */
    private String branch_id;
    
    /**
     * The main user id to be set in merge.
     */
    private String main_user_id;
    
    /**
     * The list of users id to merge.
     */
    private String[] users_id;

    
    /**
     * The branch id of the main user.
     * 
     * @return the branch_id
     */
    public String getBranch_id() {
        return branch_id;
    }

    /**
     * The branch id of the main user.
     * 
     * @param branch_id the branch_id to set
     */
    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    /**
     * The main user id to be set in merge.
     * 
     * @return the main_user_id
     */
    public String getMain_user_id() {
        return main_user_id;
    }

    /**
     * The main user id to be set in merge.
     * 
     * @param main_user_id the main_user_id to set
     */
    public void setMain_user_id(String main_user_id) {
        this.main_user_id = main_user_id;
    }

    /**
     * The list of users id to merge.
     * 
     * @return the users_id
     */
    public String[] getUsers_id() {
        return users_id;
    }

    /**
     * The list of users id to merge.
     * 
     * @param users_id the users_id to set
     */
    public void setUsers_id(String[] users_id) {
        this.users_id = users_id;
    }
    
    
    
}
