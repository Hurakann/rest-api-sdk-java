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
package org.hova.hover.sdk.user.merge;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.ClientPOST;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.User;
import org.hova.hover.sdk.pojo.merge.UserMergeC;

/**
 * This class is responsible for using the resource merge to create, update
 * or fetch merged users into a collection to avoid duplicates.
 *
 * @author zgbjgg
 */
public class UserMergeResource {
    
    /**
     * The resource of our versioning api.
     */ 
    private static String URI = "/v1/user/merge";
    
    /**
     * Our data encode as json (in next releases maybe include xml format).
     */
    private static String CTYPE = "application/json";   
    
    /**
     * Create a merge (collection) of users.
     * 
     * @param merge a merge object containing data to post.
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws ClassNotFoundException
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response create(UserMergeC merge) throws ClassNotFoundException, 
            MalformedURLException, IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(merge);

        // Creates a new http client
        ClientPOST client = new ClientPOST(body, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;

    }
    
    /**
     * Fetch a user to get a merge state, you must use 'MergeF[]' to cast the
     * resulting data.
     * 
     * @param userid the user id who check merge state.
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
