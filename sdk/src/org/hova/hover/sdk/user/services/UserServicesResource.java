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
package org.hova.hover.sdk.user.services;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.exception.UserAlreadyAssignedInServiceException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.ClientPOST;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.services.UserService;

/**
 * The class is responsible for posting, getting, updating and deleting data of
 * the user services in the Hover system using the Hover API.
 *
 * @author zgbjgg
 */
public class UserServicesResource {

    // the resource of our versioning api
    private static String URI = "/v1/user/services";
    
    // Our data encode as json (in next releases maybe include xml format)
    private static String CTYPE = "application/json";
    

    /**
     * Add a user into a service in the Hover system using Hover API or thrown 
     * an exception if user is already assigned to it.
     *
     * @param userService the user services class representing the data to
     *                      post. The data could be encoded as json format by the SDK
     *
     * @return a response instance with the http status code and the body
     *         decoded as json and in a class translation
     * @throws ClassNotFoundException
     * @throws MalformedURLException
     * @throws IOException
     */
    public Response assign(UserService userService) throws ClassNotFoundException,
            MalformedURLException, IOException, Exception {

        // Check if service is already assigned to the user usgin a get interface
        Response assignment = get(userService.getService_id(),
                userService.getUser_id(), null);

        if (assignment.getHttpcode() == 200) {            
            throw new UserAlreadyAssignedInServiceException(userService.getUser_id(),
                    userService.getService_id());
        } else {
            // Translates class to json :)
            Gson gson = new Gson();
            String body = gson.toJson(userService);

            // Creates a new http client
            ClientPOST client = new ClientPOST(body, URI, CTYPE);

            // Send request
            Response response = client.request();
           

            return response;
        }
    }

    /**
     * Get the user info on a specific phase using the Hover API.
     *
     * @param serviceid the service id assigned to the user. It could be a valid
     *                  id or the string all for requesting all assigned services.
     * @param userid the user id for which one get the service(s). It's
     *               required, not null.
     * @param owner if it is true, then retrieve services as owner, to retieve
     *              services assign just send this as 'null'.
     * @return a response instance with the http status code and the body
     *         decoded as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException
     */
    public Response get(String serviceid, String userid, String owner)
            throws MalformedURLException, IOException {

        // Build a query string data for [GET]
        String queryString;

        if ((serviceid.equals("all")) && (owner == null)) {
            queryString = "user_id=" + userid;
        } else if (owner != null) {
            queryString = "user_id=" + userid + "&owner=" + owner;
        } else {
            queryString = "user_id=" + userid + "&service_id=" + serviceid;
        }

        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);

        // Send request
        Response response = client.request();
        
        return response;

    }
}
