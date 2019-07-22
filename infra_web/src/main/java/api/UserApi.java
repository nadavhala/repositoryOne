package api;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class UserApi extends CommonApi{


    public User getUser(int userId) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(getRequest("https://jsonplaceholder.typicode.com/posts/"+userId), User.class);
        return user;

    }


    public Collection<User> getAllUsers() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<User> allUsers = mapper.readValue(getRequest("https://jsonplaceholder.typicode.com/posts/"), mapper.getTypeFactory().constructCollectionType(List.class, User.class));
        return allUsers;
        }

}


