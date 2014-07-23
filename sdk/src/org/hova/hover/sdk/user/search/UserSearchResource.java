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
package org.hova.hover.sdk.user.search;

// import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hova.hover.sdk.common.ClassReflect;
import org.hova.hover.sdk.common.Utility;
import org.hova.hover.sdk.http.ClientGET;
import org.hova.hover.sdk.http.Response;
// import org.hova.hover.sdk.pojo.UserSearch;

/**
 * The class is responsible for getting data of the user in the Hover system
 * using the Hover API via riak search.
 *
 * @author zgbjgg
 */
public class UserSearchResource {

    // the resource of our versioning api
    private static String URI = "/v1/user/search";
    // Our data encode as json (in next releases maybe include xml format)
    private static String CTYPE = "application/json";

    /**
     * Find all users matching the incoming data set
     *
     * @param userSearch
     *
     * @return a response instance with the http status code and the body
     * decoded as json and in a class translation
     */
    public Response find(Object userSearch, int pagination) throws 
            MalformedURLException, IOException {

        // Reflection
        ClassReflect reflect = new ClassReflect();
        
        try {
            Map<String, String> fields = reflect.reflectFields(userSearch.getClass(),
                    userSearch);

            // Now build a query string
            Utility util = new Utility();

            String queryString = util.buildQueryString(fields) + 
                    "&pagination=" + pagination;

            // Creates a new http client
            ClientGET client = new ClientGET(queryString, URI, CTYPE);

            // Send request
            Response response = client.request();

            return response;

        } catch (IllegalAccessException ex) {
            Logger.getLogger(UserSearchResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(UserSearchResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(UserSearchResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
