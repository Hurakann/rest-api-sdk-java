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
package testsdk;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.hova.hover.sdk.common.Logs;
import org.hova.hover.sdk.common.SDKTools;
import org.hova.hover.sdk.pojo.notifications.UserNotificationsF;
import testsdk.merge.Merge;
import testsdk.nfc.Nfc;
import testsdk.notifications.Notifications;
import testsdk.profiles.Profiles;
import testsdk.user.MyUser;

/**
 *
 * This test for the HOVER SDK shows how register, get a single user and assign
 * a service and get it from the user.
 *
 * @author zgbjgg
 */
public class Main {
    
    private static String userId = "3fe1e8ea-a8cd-490e-951c-8e7edcdc8628";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, 
            IOException, URISyntaxException, ClassNotFoundException {
        // Customize out logging
        Logs.initialize("/Users/zgbjgg/Desktop");
        
        // SDK initializaton
        SDKTools.initialize("/Users/zgbjgg/sdk_config.properties");
        
        // profiles
        String profileId = profiles();
        
        // user
        String[] users = user(profileId);
        
        // merge
        merge(users[0], users[1], users[2]);
        
        // nfc
        nfc(users[1]);
        
        // notifications
        notifications(users[0]);
        
    }
    
    public static String profiles() throws MalformedURLException, 
            IOException {
        Profiles action = new Profiles();
        
        // magic
        String profileId = action.creatingProfile();
        
        action.fetchingProfiles(userId);
        
        action.updatingProfile(profileId);
        
        return profileId;
        
    }
    
    public static String[] user(String profileId) throws ClassNotFoundException, 
            MalformedURLException, IOException {
        MyUser user = new MyUser();
        
        // magic
        String userIdBasic = user.creatingBasicUser(profileId);
        
        String userIdLogin = user.creatingLoginUser(profileId);
        
        user.fetchingUserLoginInfo(userIdLogin);
        
        user.login("john.doe.06", "123abc");
        
        user.checkingUserAvailability("john.doe.06");
        
        String branchId = user.checkingColorAndGettingBranchInfo("john.doe.06@mail.com");
        
        return new String[]{branchId, userIdLogin, userIdBasic};
    }
    
    public static void merge(String branchId, String mainUserId, String userId) 
            throws ClassNotFoundException, MalformedURLException, IOException {
        Merge merge = new Merge();
        
        // magic
        merge.mergingUsers(branchId, new String[]{userId}, mainUserId);
        
        merge.fetchingMergedUsers(mainUserId);
    } 
    
    public static void nfc(String userId) throws ClassNotFoundException, 
            MalformedURLException, IOException {
        Nfc nfc = new Nfc();
        
        // magic
        nfc.assignNfcToUser(userId);
        
        nfc.fetchingNfcCardsAssignedToUser(userId);
        
        nfc.updatingNfcInformation(userId);
        
        nfc.fetchingNfcCardsAssignedToUser(userId);
    }
    
    public static void notifications(String branchId) throws 
            ClassNotFoundException, MalformedURLException, IOException {
        Notifications notifications = new Notifications();
        
        notifications.creatingUserNotification(branchId);
        
        UserNotificationsF[] userNotifications = notifications.fetchingAllUserNotifications(branchId);
        
        notifications.fetchingSpecificUserNotifications(branchId,
                userNotifications[0].getNotification_id());
        
        notifications.updateNotificationRead(userNotifications[0].getNotification_id());
        
        notifications.fetchingAllUserNotifications(branchId);
        
    }

}
