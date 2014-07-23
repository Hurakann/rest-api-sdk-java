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
package org.hova.hover.sdk.user.login;

import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.Response;

/**
 * The class is responsible for trying login  
 * of the user in the Hover system using the Hover API.
 * 
 * @author zgbjgg
 */
public class UserLoginResource {

    // the resource of our versioning api
    private static String URI = "/v1/user/login";
    
    // Our data encode as json (in next releases maybe include xml format)
    private static String CTYPE = "application/json";

   
    
    /**
     * Try user login, if it's successfully get the basic user info 
     * using the Hover API.
     * 
     * @param user the username for the login, it could be NFC id, username or email.
     * @param password the password for the login, it could be password string or
     *                  fingerprint tag.
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response login(String user, String password) throws 
            MalformedURLException, IOException {
        
        // Build a query string data for [GET]
        String queryString = "user="+user+"&password="+password;
        
        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);
        
        // Send request
        Response response = client.request();
        
        return response;
                
    }
}

