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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hova.hover.sdk.common.Logs;

/**
 * Creates a correct POST HTTP request with a json encoded as a body.
 * 
 * @author zgbjgg
 */
public class ClientPOST {

    // Endpoint
    String Endpoint = System.getProperty("http.endpoint");
    
    // HTTP parameters
    String timeout = System.getProperty("http.connection.timeout");
    String readtimeout = System.getProperty("http.connection.readtimeout");
    
    // body request
    public String body;
    
    // uri 
    public String uri;
    
    // Content-Type, xml or json
    public String ctype;
 

    /**
     * Build a instance of this class and set the default values to execute request
     * 
     * @param body the body of the request
     * @param uri the uri of the request. In RESTful is known as the resource
     * @param ctype the content-type for the body request
     */
    public ClientPOST(String body, String uri, String ctype) {
        this.body = body;
        this.uri = uri;
        this.ctype = ctype;
    }

    /**
     * Execute the POST HTTP request building previously with the attributes 
     * passed into this class constructor.
     * 
     * @return the response instance containing code and body response 
     * @throws MalformedURLException
     * @throws IOException 
     */
    public Response request() throws MalformedURLException, IOException,
            SocketTimeoutException{

        URL url = new URL(Endpoint + this.uri);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", ctype);
        
        // Set timeout
        conn.setConnectTimeout(new Integer(timeout));
        conn.setReadTimeout(new Integer(readtimeout));

        String input = body;

        // Log [INFO] Prepare http request 
        Logger.getLogger("rest-api-sdk-java").log(Level.INFO, Logs.LOG_REQUEST,
                new String[]{this.uri, this.body, this.ctype});   
        
        OutputStream os = conn.getOutputStream();
        os.write(input.getBytes());
        os.flush();
        
        // Now generate a Response instance to store results from server
        Response response = new Response();
        
        response.setHttpcode(conn.getResponseCode());

        // Buffer the output
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        while ((output = br.readLine()) != null) {
            response.setBody(output);
        }

        // Disconnect
        conn.disconnect();
        
        // Loggin our response!
        Logger.getLogger("rest-api-sdk-java").log(Level.INFO, Logs.LOG_RESPONSE, 
                    new String[]{String.valueOf(response.getHttpcode()), response.getBody(), 
                        "[Class<?>T]"});
        
        return response;
    }   
}