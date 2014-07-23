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

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.ClientPOST;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.User;

/**
 * The class is responsible for posting, getting, updating and deleting data 
 * of the user in the Hover system using the Hover API.
 * 
 * @author zgbjgg
 */
public class UserResource {

    // the resource of our versioning api
    private static String URI = "/v1/user";
    
    // Our data encode as json (in next releases maybe include xml format)
    private static String CTYPE = "application/json";

    /**
     * Create a user in the Hover system using Hover API, the next attributes
     * in the User class must be required, not null:
     * 
     *  - branch_id
     *  - user_id
     *  - profile_id
     *  - phase
     *  - coloruser
     * 
     * @param user the user class representing the data to post. The data could
     *              be encoded as json format by the SDK
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws ClassNotFoundException
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response create(User user) throws ClassNotFoundException, 
            MalformedURLException, IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(user);

        // Creates a new http client
        ClientPOST client = new ClientPOST(body, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;

    }
    
    /**
     * Get the user info on a specific phase using the Hover API.
     * 
     * @param branchid the branch id of the parent user. It's required, not null.
     * @param userid the user id for the desired user for getting info. It's required, not null.
     * @param phase the phase of the user for getting info, it could be: phase1,
     *              phase2, phase3, phase4 or all for retrieving all phases. It's required, not null.
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response fetch(String branchid, String userid, 
            String phase) throws MalformedURLException, IOException {
        
        // Build a query string data for [GET]
        String queryString = "branch_id="+branchid+"&user_id="+userid+"&phase="+
                phase;
        
        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);
        
        // Send request
        Response response = client.request();
        
        return response;
                
    }
}
