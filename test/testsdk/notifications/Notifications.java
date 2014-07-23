package testsdk.notifications;

import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.notifications.UserNotificationsC;
import org.hova.hover.sdk.pojo.notifications.UserNotificationsF;
import org.hova.hover.sdk.pojo.notifications.UserNotificationsU;
import org.hova.hover.sdk.user.notification.UserNotificationResource;

/**
 *
 * @author zgbjgg
 */
public class Notifications {

    public void creatingUserNotification(String branchId) throws
            ClassNotFoundException, MalformedURLException, IOException {

        // Create notifications object
        UserNotificationsC notification = new UserNotificationsC();
        notification.setBranch_id(branchId);
        notification.setMessage("This is a test message from SDK in java");
        notification.setTitle("SDK Java Notification");

        // Resource
        UserNotificationResource resource = new UserNotificationResource();

        // Do magic
        Response response = resource.create(notification);

        if (response.getHttpcode() == 201) {
            System.out.println("User notification created successfully");
        } else {
            System.out.println("Couldn't create notification");
        }

    }

    public UserNotificationsF[] fetchingAllUserNotifications(String branchId) throws
            MalformedURLException, IOException {

        // Resource
        UserNotificationResource resource = new UserNotificationResource();

        // Do magic
        Response response = resource.fetch(branchId);

        if (response.getHttpcode() == 200) {
            UserNotificationsF[] notifications = (UserNotificationsF[]) response.getBodyT(UserNotificationsF[].class);
            for (int i = 0; i < notifications.length; i++) {
                System.out.println("Id : " + notifications[i].getNotification_id()
                        + " Title : " + notifications[i].getTitle());
            }
            return notifications;
        } else {
            System.out.println("Couldn't fetch all notifications");
            return null;
        }
    }

    public void fetchingSpecificUserNotifications(String branchId,
            String notificationId) throws MalformedURLException, IOException {

        // Resource
        UserNotificationResource resource = new UserNotificationResource();

        // Do magic
        Response response = resource.fetchById(branchId, notificationId);

        if (response.getHttpcode() == 200) {
            UserNotificationsF notification = (UserNotificationsF) 
                    response.getBodyT(UserNotificationsF.class);

            System.out.println("Id : " + notification.getNotification_id()
                    + " Title : " + notification.getTitle());

        } else {
            System.out.println("Couldn't fetch the specific notification");
        }
    }
    
    public void updateNotificationRead(String notificationId) throws 
            MalformedURLException, IOException {
        
        // Create notifications object
        UserNotificationsU notification = new UserNotificationsU();
        notification.setRead(true);
        notification.setNotification_id(notificationId);
        
        // Resource
        UserNotificationResource resource = new UserNotificationResource();

        // Do magic
        Response response = resource.update(notification);

        if (response.getHttpcode() == 200) {
            System.out.println("User notification updated successfully");
        } else {
            System.out.println("Couldn't update notification");
        }
    }
}
