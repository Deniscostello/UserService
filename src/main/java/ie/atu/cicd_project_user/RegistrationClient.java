package ie.atu.cicd_project_user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="registration-service", url ="http://springboot-registrationservice:8082")
public interface RegistrationClient {
    @PostMapping("/confirm")
    String SomeDetails(@RequestBody User user);
}
