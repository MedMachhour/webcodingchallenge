package Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Builder
@Getter
@Setter
@ToString
@Document(collection = "user")
public class User {

    @Id
    private long id;
    private String email;
    private String name;
    private String passwordhash;
    private Role role;
    public static User build(long id,String email,String passwd,String name,Role role){
        return builder().id(id).email(email).name(name).role(role).passwordhash(new BCryptPasswordEncoder().encode(
                passwd)).build();
    }

}
