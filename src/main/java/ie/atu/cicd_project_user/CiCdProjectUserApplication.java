package ie.atu.cicd_project_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CiCdProjectUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdProjectUserApplication.class, args);
    }

}
