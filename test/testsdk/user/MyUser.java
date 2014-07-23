package testsdk.user;

import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.User;
import org.hova.hover.sdk.pojo.UserC;
import org.hova.hover.sdk.pojo.login.UserLogin;
import org.hova.hover.sdk.user.UserAvailabilityResource;
import org.hova.hover.sdk.user.UserIsColorResource;
import org.hova.hover.sdk.user.UserResource;
import org.hova.hover.sdk.user.login.UserLoginResource;

/**
 *
 * @author zgbjgg
 */
public class MyUser {

    public String creatingBasicUser(String profileId) throws ClassNotFoundException,
            MalformedURLException, IOException {

        // Create a user object
        User user = new User();
        user.setBirthday("1992-11-11");
        user.setBranch_id("7603eece-9b65-4a9d-b681-6f6f49d9e600");
        user.setColoruser("black");
        user.setGender("MALE");
        user.setLanguage("es");
        user.setLastname("Doe");
        user.setLastname2("Doe");
        user.setName("John");
        user.setPhase("phase1");
        user.setProfile_id(profileId);
        user.setUser_id("3fe1e8ea-a8cd-490e-951c-8e7edcdc8628");

        // Resource
        UserResource resource = new UserResource();

        // Do magic
        Response response = resource.create(user);


        if (response.getHttpcode() == 201) {
            UserC myUser = (UserC) response.getBodyT(UserC.class);
            System.out.println("User registered succesfully");
            return myUser.getUser_id();
        } else {
            System.out.println("Couldn't register user");
            return null;
        }

    }

    public String creatingLoginUser(String profileId) throws ClassNotFoundException,
            MalformedURLException, IOException {

        // Create a user object
        User user = new User();
        user.setBirthday("1992-11-11");
        user.setBranch_id("7603eece-9b65-4a9d-b681-6f6f49d9e600");
        user.setColoruser("black");
        user.setGender("MALE");
        user.setLanguage("es");
        user.setLastname("Doe");
        user.setLastname2("Doe");
        user.setName("John");
        user.setPhase("phase1");
        user.setProfile_id(profileId);
        user.setUser_id("3fe1e8ea-a8cd-490e-951c-8e7edcdc8628");
        user.setPassword("123abc");
        user.setEmail("john.doe.06@mail.com");
        user.setUsername("john.doe.06");

        // Resource
        UserResource resource = new UserResource();

        // Do magic
        Response response = resource.create(user);


        if (response.getHttpcode() == 201) {
            UserC myUser = (UserC) response.getBodyT(UserC.class);
            System.out.println("User registered succesfully");
            return myUser.getUser_id();
        } else {
            System.out.println("Couldn't register user");
            return null;
        }

    }

    public void fetchingUserLoginInfo(String userId) throws MalformedURLException,
            IOException {

        // Resource
        UserResource resource = new UserResource();

        // Do magic
        Response response = resource.fetch("7603eece-9b65-4a9d-b681-6f6f49d9e600",
                userId, "all");

        if (response.getHttpcode() == 200) {
            User user = (User) response.getBodyT(User.class);

            System.out.println("Our registered user was: " + user.getName() + " "
                    + user.getLastname() + " " + user.getLastname2());

        } else {
            System.out.println("Error fetching user info");
        }
    }

    public void login(String username, String password) throws MalformedURLException,
            IOException {

        // Resource
        UserLoginResource resource = new UserLoginResource();

        // Do magic
        Response response = resource.login(username, password);

        if (response.getHttpcode() == 200) {
            UserLogin user = (UserLogin) response.getBodyT(UserLogin.class);
            System.out.println("Logged with user: " + username + " was successfully");
        } else {         
            System.out.println("Error login username " + username);
        }
    }
    
    public void checkingUserAvailability(String username) throws MalformedURLException, 
            IOException {
        
        // Resource
        UserAvailabilityResource resource = new UserAvailabilityResource();
        
        // Do magic
        Response response = resource.check(username);
        
        if (response.getHttpcode() == 200) {
            System.out.println("Username is already registered, use other");
        } else {
            System.out.println("Username is available, use it");
        }
    }
    
    public String checkingColorAndGettingBranchInfo(String email) throws 
            MalformedURLException, IOException {
        
        // Resource
        UserIsColorResource resource = new UserIsColorResource();
        
        // Do magic
        Response response = resource.check(email, "black");
        
        if (response.getHttpcode() == 200) {
            User user = (User) response.getBodyT(User.class); 
            System.out.println("Branch of your user found at " 
                    + user.getBranch_id()+ "!");
            return user.getBranch_id();
        } else {
            System.out.println("Error checking for color user");
            return null;
        }
    }
}
