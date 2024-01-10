package ie.atu.cicd_project_user;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private final UserService userService;
    private final RegistrationClient registrationClient;

    public UserController(UserService userService, RegistrationClient registrationClient) {
        this.userService = userService;
        this.registrationClient = registrationClient;
    }

    @PostMapping("/createUser")
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@Valid @RequestBody User user){
        String confirmation =userService.createUser(user);
        return confirmation;
    }

    @GetMapping("/getUser")
    public ResponseEntity<Map<String, List<User>>> getUser(){
        List<User> userToSend= userService.getUser();
        Map<String, List<User>> response = new HashMap<>();
        response.put("user", userToSend);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }



//    @PostMapping("/getUser")
//    @ResponseStatus(HttpStatus.CREATED)
//    public ResponseEntity<Map<String, List<User>>> getUser(){
//        List<User> userToSend= userService.getUser();
//        Map<String, List<User>> response = new HashMap<>();
//        response.put("user", userToSend);
//        return new ResponseEntity<>(response,HttpStatus.OK);
//    }
}
