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

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility methods related to reflection class
 * 
 * @author zgbjgg
 */
public class ClassReflect {
    
    /**
     * Get reflect fields stored on a map object as key.value
     * 
     * @param clazz the class to be casted
     * @param obj the new instance of the class (object)
     * @return A map object that stores {name,value}
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException 
     */
    public Map<String, String> reflectFields(Class<?> clazz, Object obj) throws 
            IllegalAccessException, IllegalArgumentException, 
            InvocationTargetException {
        
        // Store mapping values
        Map<String, String> map = new HashMap<String, String>();
        
        // Get super class, because our classes must be the super class
        Field fieldsSuper[] = clazz.getSuperclass().getDeclaredFields();
        
        // Now base class
        Field fieldsThis[] = clazz.getDeclaredFields();
        
        // Build into one array fields
        Field fields[]  = new Field[fieldsSuper.length + fieldsThis.length];       
        System.arraycopy(fieldsSuper, 0, fields, 0, fieldsSuper.length);
        System.arraycopy(fieldsThis, 0, fields, fieldsSuper.length, fieldsThis.length);
        
        // Iterate over all fields and save name and value
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            String name = fields[i].getName();
            Object value = fields[i].get(obj);
            
            // No null values
            if (value != null) {
                map.put(name, value.toString());
            } else {
                map.put(name, null);
            }
                       
        }
        
        return map;
    }
}
