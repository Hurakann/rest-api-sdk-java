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
package org.hova.hover.sdk.user.notification;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.ClientPOST;
import org.hova.hover.sdk.http.ClientPUT;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.notifications.UserNotificationsU;
import org.hova.hover.sdk.pojo.notifications.UserNotificationsC;

/**
 * This class is responsible for using the resource notifications to create, update
 * or fetch notifications of the user.
 * 
 * @author zgbjgg
 */
public class UserNotificationResource {
    
    /**
     * the resource of our versioning api.
     */
    private static String URI = "/v1/user/notifications";
    
    /**
     * Our data encode as json (in next releases maybe include xml format).
     */
    private static String CTYPE = "application/json"; 
    
    /**
     * Create a new notification for the user.
     * 
     * @param userNotifications the notifications object representing the data to post
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws ClassNotFoundException
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response create(UserNotificationsC userNotifications) throws 
            ClassNotFoundException, MalformedURLException, IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(userNotifications);

        // Creates a new http client
        ClientPOST client = new ClientPOST(body, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;

    }
    
    /**
     * Fetch all notifications assigned to a single user, you must use 'UserNotificationsF[]'
     * to cast resulting data.
     * 
     * @param branchid the branch id of the user that notifications was assigned
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response fetch(String branchid) throws MalformedURLException, IOException {
        
        // Build a query string data for [GET]
        String queryString = "branch_id="+branchid;
        
        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);
        
        // Send request
        Response response = client.request();
        
        return response;
                
    }
    
   
    /**
     * Fetch specific notification assigned to a single user, you must use 'UserNotificationsF'
     * to cast resulting data.
     * 
     * @param branchid the branch id of the user that notifications was assigned
     * @param notification_id the id of the notification already created
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response fetchById(String branchid, String notification_id) throws
            MalformedURLException, IOException {
        
        // Build a query string data for [GET]
        String queryString = "branch_id="+branchid+"&notification_id="
                +notification_id;
        
        // Creates a new http client
        ClientGET client = new ClientGET(queryString, URI, CTYPE);
        
        // Send request
        Response response = client.request();
        
        return response;
                
    }
    
    /**
     * Update the notification if it was read: true or false.
     * 
     * @param userNotifications the notifications object representing data to update
     * @return a response instance with the http status code and the body decoded
     *          as json and in a class translation
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response update(UserNotificationsU userNotifications) throws MalformedURLException,
            IOException {

        // Translates class to json :)
        Gson gson = new Gson();
        String body = gson.toJson(userNotifications);

        // Creates a new http client
        ClientPUT client = new ClientPUT(body, URI, CTYPE);

        // Send request
        Response response = client.request();

        return response;
    }
    
    
}
