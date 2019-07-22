package tests.apitests;
;
import api.User;
import api.UserApi;
import org.testng.annotations.Test;

import java.io.IOException;

public class ApiTest {

    @Test
    public void apiTest() throws IOException {
        UserApi userApi = new UserApi();
        for (User user : userApi.getAllUsers()) {
            System.out.println(user.getId());
            System.out.println(user.getTitle());
            System.out.println(user.toString());

        }
    }
}