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

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Common logs format and base file logging 
 * 
 * @author zgbjgg
 */
public class Logs {

    /**
     * Log size
     */
    private static int LOG_SIZE = 1024*1000;
    
    /**
     * Log rotation
     */
    private static int LOG_NUMFILES = 5;
    
    /**
     * Log for request data
     */
    public static String LOG_REQUEST = "Sending Request URI: {0}\n\tBody: {1}\n\t"
            + "Content-Type: {2}\n";
    
    /**
     * User already assigned to service
     */
    public static String LOG_USER_ALREADY_IN_SERVICE = "User {0} is already assigned"
            + " to service {1}\n";
    
    /**
     * Log for response data
     */ 
    public static String LOG_RESPONSE = "Getting Response HTTP Status Code: {0}\n\t"
            + "Body: {1}\n\tSerialization class: {2}\n";
    
    /**
     * Log for configuration success
     */
    public static String LOG_CONFIG_SUCCESS = "SDK-Load configuration file: {0}\n";
    
    /**
     * Log for configuration error
     */
    public static String LOG_CONFIG_ERR = "SDK-Load configuration file error: {0}\n";
    
    /**
     * 
     */
    public static String LOG_CONFIG = "SDK properties configuration: {0}\n";
    
    /**
     * Determinate which one is the path to our log file and initialize them
     * 
     * @param logPath the path to our logs file
     */   
    public static void initialize(String logPath) {
        
        String file = File.separator+ "hover_sdk.log";
        
        try {
            FileHandler fileHandler = new FileHandler(logPath + file, LOG_SIZE,
                    LOG_NUMFILES, true);
            Logger logger = Logger.getLogger("rest-api-sdk-java");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();  
            fileHandler.setFormatter(formatter);
        } catch (IOException ex) {
            Logger.getLogger(Logs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Logs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
