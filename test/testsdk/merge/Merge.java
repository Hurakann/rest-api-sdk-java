package testsdk.merge;

import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.merge.UserMergeC;
import org.hova.hover.sdk.pojo.merge.UserMergeF;
import org.hova.hover.sdk.user.merge.UserMergeResource;

/**
 *
 * @author zgbjgg
 */
public class Merge {

    public void mergingUsers(String branchId, String[] usersid,
            String mainUserId) throws ClassNotFoundException, MalformedURLException,
            IOException {

        // Create a user merge object
        UserMergeC userMerge = new UserMergeC();
        userMerge.setBranch_id(branchId);
        userMerge.setMain_user_id(mainUserId);
        userMerge.setUsers_id(usersid);

        // Resource
        UserMergeResource resource = new UserMergeResource();

        // Do magic
        Response response = resource.create(userMerge);

        if (response.getHttpcode() == 201) {
            System.out.println("Merging users was succesfully");
        } else {
            System.out.println("Couldn't merge the users");
        }
    }

    public void fetchingMergedUsers(String userId) throws MalformedURLException,
            IOException {

        // Resource
        UserMergeResource resource = new UserMergeResource();

        // Do magic
        Response response = resource.fetch(userId);

        if (response.getHttpcode() == 200) {
            UserMergeF[] userMerged = (UserMergeF[]) response.getBodyT(UserMergeF[].class);
            for (int i = 0; i < userMerged.length; i++) {
                System.out.println("Id : " + userMerged[i].getUser_id()
                        + " Type : " + userMerged[i].getMerge() + " Name : " + 
                        userMerged[i].getName());
            }
        } else {
            System.out.println("Couldn't fetch merged info");
        }
    }
}
