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
package org.hova.hover.sdk.pojo;

/**
 * POJO class for user json structure based on API responses (only to register).
 * 
 * @author zgbjgg
 */
public class User {
    
    /**
     * The parent branch of the user.
     */
    private String branch_id;
    
    /**
     * The name of the user, company, any object, etc...
     */
    private String name;
    
    /**
     * The lastname of the user, company, any object, etc...
     */
    private String lastname;
    
    /**
     * The lastname2 of the user, company, any object, etc...
     */
    private String lastname2;
    
    /**
     * The gender for the user.
     */
    private String gender;
    
    /**
     * The birthday date of the user.
     */
    private String birthday;
    
    /**
     * The actual phase of the user based on the registration data.
     */
    private String phase;
    
    /**
     * The color for the user (commonly 'black').
     */
    private String coloruser;
    
    /**
     * The language tag for the user (es, en, ita, etc..).
     */
    private String language;
    
    /**
     * The profile id that user could taken.
     */
    private String profile_id;
    
    /**
     * The parent user id of the user.
     */
    private String user_id;
    
    /**
     * The username for the user.
     */
    private String username;
    
    /**
     * The email for the user.
     */
    private String email;
    
    /**
     * The password for the user
     */
    private String password;

    /**
     * Branch id for the parent user (owner of the user)
     * 
     * @return the branch_id
     */
    public String getBranch_id() {
        return branch_id;
    }

    /**
     * Branch id for the parent user (owner of the user)
     * 
     * @param branch_id the branch_id to set
     */
    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    /**
     * Name for the user
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Name for the user
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Lastname for the user
     * 
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Lastname for the user
     * 
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Lastname2 for the user
     * 
     * @return the lastname2
     */
    public String getLastname2() {
        return lastname2;
    }

    /**
     * Lastname2 for the user
     * 
     * @param lastname2 the lastname2 to set
     */
    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    /**
     * Gender of the user
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Gender of the user
     * 
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Birthday of the user (format YYYY-MM-DD)
     * 
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Birthday of the user (format YYYY-MM-DD)
     * 
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * Phase to keep the user (1, 2, 3 or 4)
     * 
     * @return the phase
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Phase to keep the user (1, 2, 3 or 4)
     * 
     * @param phase the phase to set
     */
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Color for distinct the user (use black please!!)
     * 
     * @return the coloruser
     */
    public String getColoruser() {
        return coloruser;
    }

    /**
     * Color for distinct the user (use black please!!)
     * 
     * @param coloruser the coloruser to set
     */
    public void setColoruser(String coloruser) {
        this.coloruser = coloruser;
    }

    /**
     * Language short description for the user (es, en, so on....)
     * 
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Language short description for the user (es, en, so on....)
     * 
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Profile that could take the user
     * 
     * @return the profile_id
     */
    public String getProfile_id() {
        return profile_id;
    }

    /**
     * Profile that could take the user
     * 
     * @param profile_id the profile_id to set
     */
    public void setProfile_id(String profile_id) {
        this.profile_id = profile_id;
    }

    /**
     * User id of the parent user
     * 
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * User id of the parent user
     * 
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * Username for the user
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Username for the user
     * 
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Email for the user
     *  
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Email for the user
     * 
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Password for the user
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Password for the user
     * 
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
