
package testsdk.profiles;

import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.pojo.profiles.ProfileC;
import org.hova.hover.sdk.profile.ProfilesResource;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.profiles.ProfileF;
import org.hova.hover.sdk.pojo.profiles.ProfileU;

/**
 *
 * @author zgbjgg
 */
public class Profiles {
    
    // Creating a profile and return id
    public String creatingProfile() throws MalformedURLException, 
            IOException {
        
        // Create a profile object
        ProfileC profile = new ProfileC();
        profile.setBased_on_id(null);
        profile.setName("My Java Profile");
        profile.setUser_id("3fe1e8ea-a8cd-490e-951c-8e7edcdc8628");
        
        // Resource
        ProfilesResource resource = new ProfilesResource();
        
        
        // Do magic
        Response response = resource.create(profile);
        
        if (response.getHttpcode() == 201) {
            ProfileF myJavaProfile = (ProfileF) response.getBodyT(ProfileF.class);
            System.out.println("Profile created succesfully");
            return myJavaProfile.getProfile_id();
        } else {
            System.out.println("Could not create profile");
            return null;
        }
        
    }
    
    public void fetchingProfiles(String userId) throws MalformedURLException, 
            IOException {
        
        // Resource
        ProfilesResource resource = new ProfilesResource();
        
        // Do magic
        Response response = resource.fetch(userId);
        
        ProfileU[] myProfiles = (ProfileU[]) response.getBodyT(ProfileU[].class);
        
        // Print profiles 
        for(int i = 0; i < myProfiles.length; i ++) {
            System.out.println("Id : " + myProfiles[i].getProfile_id() + 
                    " Name : " + myProfiles[i].getName());
        }                       
    }
    
    public void updatingProfile(String profileId) throws MalformedURLException, 
            IOException {
        
        // Create a profile object
        ProfileU newProfile = new ProfileU();
        newProfile.setName("My Java Updated Profile");
        newProfile.setProfile_id(profileId);

        // Resource
        ProfilesResource resource = new ProfilesResource();
        
        
        // Do magic
        Response response = resource.update(newProfile);
        
        if (response.getHttpcode() == 200) {
            System.out.println("Updated profile succesfully");
        } else {
            System.out.println("Couldn't update profile");
        }
        
    }
    
}
