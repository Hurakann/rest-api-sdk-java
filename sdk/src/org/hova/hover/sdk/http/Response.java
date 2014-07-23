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
package org.hova.hover.sdk.http;

import com.google.gson.Gson;

/**
 * HTTP Code and Body as the API responses on the requested resource.
 * 
 * @author zgbjgg
 */
public class Response {
    
    // body response
    private String body;
    
    // Http status code
    private int httpcode;
    
    // save Object 
    private Object bodyT;
    

    /**
     * Get the body of the requested resource
     * 
     * @return the body of the requested resource as string (no decoded)
     */
    public String getBody() {
        return body;
    }

    /**
     * Set the body of the requested resource
     * 
     * @param body the body to set of the requested resource (only for HTTP Clients)
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Get the HTTP Status Code of the requested resource
     * 
     * @return the httpcode of the requested resource as integer
     */
    public int getHttpcode() {
        return httpcode;
    }

    /**
     * Set the HTTP Status Code of the requested resource
     * 
     * @param httpcode the httpcode to set of the requested resource (only for HTTP Clients)
     */
    public void setHttpcode(int httpcode) {
        this.httpcode = httpcode;
    }

    /**
     * Get the decoded json and translates to the desired class
     * 
     * @param clazz the class to cast the data object
     * 
     * @return the bodyT casted to 'clazz'
     */
    public Object getBodyT(Class clazz) {
        // Translates map to class
        Gson gson = new Gson();
        bodyT = gson.fromJson(this.getBody(), clazz);       
        return clazz.cast(bodyT);
    }

    /**
     * Set the decoded json as an class Object
     * 
     * @param bodyT the bodyT to set as an object
     */
    public void setBodyT(Object bodyT) {
        this.bodyT = bodyT;
    }

    
}
