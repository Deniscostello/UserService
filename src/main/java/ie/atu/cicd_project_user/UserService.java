package ie.atu.cicd_project_user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
        private final UserRepository userRepository;

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public void createUser(User user){
            System.out.println(user);
        }

        public List<User> getUser(){
            List<User> userFound =userRepository.findAll();
            return  userFound;
        }

}
