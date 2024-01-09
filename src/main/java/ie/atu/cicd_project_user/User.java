package ie.atu.cicd_project_user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "users")
@NoArgsConstructor
public class User {
    @Id
    private int id;


}
