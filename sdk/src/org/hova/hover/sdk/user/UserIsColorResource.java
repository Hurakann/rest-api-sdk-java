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
package org.hova.hover.sdk.user;

import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.Response;

/**
 * The class is responsible for using the resource is color to check if user
 * is registered with that color and return the branch id
 *
 * @author zgbjgg
 */
public class UserIsColorResource {
    
    /**
     * The resource of our versioning api.
     */
    private static String URI = "/v1/user/is_color";
    
    /**
     * Our data encode as json (in next releases maybe include xml format).
     */
    private static String CTYPE = "application/json";
    
    /**
     * Check if user registered with provided email has any color assigned.
     * 
     * @param email the email of the user to be check
     * @param color the color to be check
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response check(String email, String color) throws MalformedURLException,
            IOException {
        
        String queryString = "email=" + email + "&color=" + color;
        
        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);

        // Send request
        Response response = client.request();
        
        return response;
    }

}
