package sn.ads.democicd.Test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String testEndpoint() {
        return "Hello from the test endpoint! Application is running successfully.";
    }

    @GetMapping("/")
    public String testEndpoin() {
        return "Hello bin from the test endpoint! Application is running successfully.";
    }
}
