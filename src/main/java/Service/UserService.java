package Service;


import Model.Role;
import Model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserService {

    public static final String COLLECTION_SQ="user_seq";
    public User createUser(User e){
        User user = User.build(e.getId(),e.getEmail(),e.getName(),e.getPasswordhash(), Role.USER);
        return null;
    }
}
