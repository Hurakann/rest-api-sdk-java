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
package org.hova.hover.sdk.user.tags;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.ClientPOST;
import org.hova.hover.sdk.http.ClientPUT;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.tags.UserTagsCU;

/**
 * This class is responsible for using the resource tags to create, update
 * or fetch tags for the user.
 * 
 * @author zgbjgg
 */
public class UserTagsResource {
    
    /**
     * The resource of our versioning api.
     */
    private static String URI = "/v1/user/tags";
    
    /**
     * Our data encode as json (in next releases maybe include xml format).
     */
    private static String CTYPE = "application/json"; 
    
    /**
     * Create a list of tags for the user.
     * 
     * @param userTags the tags object representing data to post.
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws ClassNotFoundException
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response create(UserTagsCU userTags) throws 
            ClassNotFoundException, MalformedURLException, IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(userTags);

        // Creates a new http client
        ClientPOST client = new ClientPOST(body, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;

    }
    
    // Use TagsF[] to serialize data
    /**
     * Fetch all tags created for the user, you must use 'TagsF' to cast resulting data.
     * 
     * @param userid the user id who has tags
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response fetch(String userid) throws MalformedURLException, IOException {
        
        // Build a query string data for [GET]
        String queryString = "user_id="+userid;
        
        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);
        
        // Send request
        Response response = client.request();
        
        return response;
                
    }

    /**
     * Update the tags for the user (add action).
     * 
     * @param userTags the tags object representing data to update.
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response update(UserTagsCU userTags) throws MalformedURLException,
            IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(userTags);

        // Creates a new http client
        ClientPUT client = new ClientPUT(body, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;
    }
    
    
}
