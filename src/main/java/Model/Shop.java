package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "shops")
public class Shop {

    @Id
    private String id;
    private String picture;
    private String name;
    private String email;



}
