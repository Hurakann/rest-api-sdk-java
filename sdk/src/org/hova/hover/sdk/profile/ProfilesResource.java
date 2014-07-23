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
package org.hova.hover.sdk.profile;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.ClientPOST;
import org.hova.hover.sdk.http.ClientPUT;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.profiles.ProfileC;
import org.hova.hover.sdk.pojo.profiles.ProfileU;

/**
 * This class is responsible for using the resource profiles to create, update
 * or fetch profiles
 * 
 * @author zgbjgg
 */
public class ProfilesResource {
    
   /**
     * The resource of our versioning api.
     */
    private static String URI = "/v1/profiles";
    
    /**
     * Our data encode as json (in next releases maybe include xml format).
     */
    private static String CTYPE = "application/json";
    
    /**
     * Create a profile in the Hover system to be assigned to the user, objects
     * or entities.
     * 
     * @param profile the profile object representing the data to post. The data could
     *                  be encoded by SDK as json format
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response create(ProfileC profile) throws MalformedURLException,
            IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(profile);

        // Creates a new http client
        ClientPOST client = new ClientPOST(body, URI, CTYPE);

        // Send request
        Response response = client.request();
        
        return response;
    }
    
    /**
     * Update the name of any existing profile.
     * 
     * @param profile the profile object representing the data to update. The data could
     *                  be encoded by SDK as json format
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response update(ProfileU profile) throws MalformedURLException, 
            IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(profile);

        // Creates a new http client
        ClientPUT client = new ClientPUT(body, URI, CTYPE);

        // Send request
        Response response = client.request();        
        
        return response;
    }
    
    
    // Use ProfileF as serialization class
    /**
     * Fetch all profiles created by a single user, you must use ProfilesF class
     * to cast the resulting data.
     * 
     * @param userid the user owner of the profiles
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation 
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response fetch(String userid) throws MalformedURLException, 
            IOException {
        
        // Build a query string data for [GET]
        String queryString = "user_id="+userid;
        
        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);
        
        // Send request
        Response response = client.request();
        
        return response;
                
    }
    
}
