package ie.atu.cicd_project_user;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
        private final UserRepository userRepository;
        private final RegistrationClient registrationClient;

        public UserService(UserRepository userRepository, RegistrationClient registrationClient) {
            this.userRepository = userRepository;
            this.registrationClient = registrationClient;
        }

        public String createUser(User user){
            userRepository.save(user);
            String confirm=registrationClient.SomeDetails(user);
            return confirm;
        }

        public List<User> getUser(){
            List<User> userFound =userRepository.findAll();
            return  userFound;
        }

}
