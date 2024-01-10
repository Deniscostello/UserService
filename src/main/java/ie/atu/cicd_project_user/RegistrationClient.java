package ie.atu.cicd_project_user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="registration-service", url = "${feign.url}")
public interface RegistrationClient {
    @PostMapping("/confirm")
    String SomeDetails(@RequestBody User user);
}
