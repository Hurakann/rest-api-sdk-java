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
package org.hova.hover.sdk.exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.hova.hover.sdk.common.Logs;

/**
 * Is user already assigned to service? throw me!!
 * 
 * @author zgbjgg
 */
public class UserAlreadyAssignedInServiceException extends Exception {
    
    /**
     * The constructor receives the user id and service id for printing logs
     * 
     * @param user_id the user_id to assign
     * @param service_id the service_id for assign in to the user
     */
    public UserAlreadyAssignedInServiceException(String user_id, String service_id) {
        Logger.getLogger("rest-api-sdk-java").log(Level.SEVERE, Logs.LOG_USER_ALREADY_IN_SERVICE, 
                    new String[]{user_id, service_id});
    }
    
}
