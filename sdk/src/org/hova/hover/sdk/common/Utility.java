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
package org.hova.hover.sdk.common;

import java.util.Map;

/**
 * Utility methods for library
 * 
 * @author zgbjgg
 */
public class Utility {

    /**
     * Build a query string using reflection values of a desired class
     * 
     * @param map the map containing reflection values
     * @return  the query string well-formed
     */
    public String buildQueryString(Map<String, String> map) {

        // query string
        String queryString = "";
        
        for (Map.Entry mapEntry : map.entrySet()) {
            if (mapEntry.getValue() != null) {
                
                // Get key of the map (name of parameter)
                String name = (String) mapEntry.getKey();
                
                // Get value of the map (value of parameter)
                String value = (String) mapEntry.getValue();              
                
                queryString = queryString + name + "=" + value + "&";
            }
        }
        
        // Return without the last char '&'
        return queryString.substring(0, queryString.length() - 1);
    }
}
