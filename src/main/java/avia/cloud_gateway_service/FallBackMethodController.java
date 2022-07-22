package avia.cloud_gateway_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later.";
    }

    @GetMapping("/adminServiceFallBack")
    public String adminServiceFallBackMethod() {
        return "Admin Service is taking longer than Expected." +
                " Please try again later.";
    }
}
