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
package org.hova.hover.sdk.user.nfc;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.ClientPOST;
import org.hova.hover.sdk.http.ClientPUT;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.nfc.UserNfc;

/**
 * This class is responsible for using the resource nfc to create, update
 * or fetch nfc cards assigned to the user.
 * 
 * @author zgbjgg
 */
public class UserNfcResource {

    /**
     * The resource of our versioning api.
     */ 
    private static String URI = "/v1/user/nfc_card";
    
    /**
     * the resource of our versioning api (search mode).
     */ 
    private static String URI_SEARCH = "/v1/search/nfc";
    
    /**
     * Our data encode as json (in next releases maybe include xml format).
     */ 
    private static String CTYPE = "application/json";

    /**
     * Assign a nfc card to a single user with a based and/or customized parameters.
     * 
     * @param usernfc the nfc object representing the data to post. 
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws ClassNotFoundException
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response assign(UserNfc usernfc) throws ClassNotFoundException,
            MalformedURLException, IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(usernfc);

        // Creates a new http client
        ClientPOST client = new ClientPOST(body, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;
    }

    /**
     * Update data of nfc card already assigned to a single user.
     * 
     * @param usernfc the nfc object with the data to update.
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response update_assignment(UserNfc usernfc) throws MalformedURLException,
            IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(usernfc);

        // Creates a new http client
        ClientPUT client = new ClientPUT(body, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;
    }

    /**
     * Fetch all nfc cards assigned to the user, you must use 'UserNfc[]' to cast
     * the resulting data.
     * 
     * @param userid the user id owner of the nfc cards
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response fetch(String userid) throws MalformedURLException,
            IOException {

        // Build a query string data for [GET]
        String queryString = "user_id=" + userid;

        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;

    }

    // Use same search as base
    
    public Response find(String nfcid) throws MalformedURLException, 
            IOException {
        
        // Build a query string data for [GET]
        String queryString = "nfc_id="+nfcid;
        
        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI_SEARCH, CTYPE);

        // Send request
        Response response = client.request();

        return response;

    }
}
