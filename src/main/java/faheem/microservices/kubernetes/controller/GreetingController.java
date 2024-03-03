package faheem.microservices.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping("/morning")
    public String greetings(){
        return "Good morning faheem jan";
    }

    @GetMapping("/faheem")
    public String helloFaheem(){
        return "hello world!";
    }

    @GetMapping("/check")
    public String check(){
        return "hello world! checking...";
    }
}
