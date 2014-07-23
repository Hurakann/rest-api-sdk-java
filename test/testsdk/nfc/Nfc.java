/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsdk.nfc;

import java.io.IOException;
import java.net.MalformedURLException;
import org.hova.hover.sdk.http.Response;
import org.hova.hover.sdk.pojo.nfc.UserNfc;
import org.hova.hover.sdk.user.nfc.UserNfcResource;

/**
 *
 * @author zgbjgg
 */
public class Nfc {

    public void assignNfcToUser(String userId) throws ClassNotFoundException,
            MalformedURLException, IOException {

        // Create a nfc object
        UserNfc nfc = new UserNfc();
        nfc.setCost("100 usd");
        nfc.setDelivery_date("2014-06-15");
        nfc.setNfc_id("MyNFC-000004");
        nfc.setRenewal("2014-12-31");
        nfc.setStatus(true);
        nfc.setUser_id(userId);
        nfc.setValidity("yearly");

        // Resource
        UserNfcResource resource = new UserNfcResource();

        // Do magic
        Response response = resource.assign(nfc);

        if (response.getHttpcode() == 201) {
            System.out.println("Nfc card assigned to user successfully");
        } else {
            System.out.println("Couldn't assign nfc card to user");
        }

    }

    public void fetchingNfcCardsAssignedToUser(String userId) throws
            MalformedURLException, IOException {

        // Resource
        UserNfcResource resource = new UserNfcResource();

        // Do magic
        Response response = resource.fetch(userId);

        if (response.getHttpcode() == 200) {
            UserNfc[] nfcs = (UserNfc[]) response.getBodyT(UserNfc[].class);
            for (int i = 0; i < nfcs.length; i++) {
                System.out.println("Id : " + nfcs[i].getNfc_id()
                        + " Status : " + nfcs[i].isStatus());
            }
        } else {
            System.out.println("Couldn't fetch nfc cards");
        }
    }

    public void updatingNfcInformation(String userId) throws 
            MalformedURLException, IOException {
        
        // Create a nfc object
        UserNfc nfc = new UserNfc();
        nfc.setCost("1000 usd");
        nfc.setNfc_id("MyNFC-000004");
        nfc.setStatus(false);
        nfc.setUser_id(userId);
        nfc.setValidity("Weekly");

        // Resource
        UserNfcResource resource = new UserNfcResource();

        // Do magic
        Response response = resource.update_assignment(nfc);

        if (response.getHttpcode() == 200) {
            System.out.println("Nfc card updated assignment to user successfully");
        } else {
            System.out.println("Couldn't update assignment nfc card to user");
        }
    }
}
