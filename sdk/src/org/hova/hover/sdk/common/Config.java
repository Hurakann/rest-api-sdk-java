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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Configuration for SDK
 * 
 * @author zgbjgg
 */
public class Config {
    
    /**
     * Status of configuration in SDK
     */
    public boolean configurationStatus = false;
    
    /**
     * Load all SDK configuration into System
     * 
     * @param file the file path where .properties file is placed
     * @throws FileNotFoundException
     * @throws IOException 
     */   
    public void load(String file) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        InputStream stream = new FileInputStream(file);
        
        properties.load(stream);
        
        Properties sys = System.getProperties();
        
        // All configuration to System
        sys.setProperty("http.endpoint", properties.getProperty("http.endpoint"));
        sys.setProperty("http.connection.timeout", properties.getProperty("http.connection.timeout"));
        sys.setProperty("http.connection.readtimeout", properties.getProperty("http.connection.readtimeout"));
        
        // Log [INFO] Prepare http request 
        Logger.getLogger("rest-api-sdk-java").log(Level.INFO, Logs.LOG_CONFIG,
                new String[]{properties.toString()}); 
        
        this.configurationStatus = true;
    }
    
}
