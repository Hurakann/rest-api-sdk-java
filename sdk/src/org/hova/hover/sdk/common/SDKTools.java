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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * SDK tools as initialize, etc..
 * 
 * @author zgbjgg
 */
public class SDKTools {
    
    public static void initialize(String file) throws FileNotFoundException, 
            IOException {
        // New config
        Config config = new Config();
        
        // Load configuration 
        config.load(file);
        
        if (config.configurationStatus) {
           
            // Log [INFO] Prepare http request 
            Logger.getLogger("rest-api-sdk-java").log(Level.INFO, Logs.LOG_CONFIG_SUCCESS,
                new String[]{String.valueOf(config.configurationStatus)}); 
        } else {
            
            // Log [INFO] Prepare http request 
            Logger.getLogger("rest-api-sdk-java").log(Level.SEVERE, Logs.LOG_CONFIG_ERR,
                new String[]{String.valueOf(config.configurationStatus)}); 
        }
    }
    
}
