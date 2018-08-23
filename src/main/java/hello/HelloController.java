package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/data")
    public String index() {
        return "Greetings from Spring Boot!"; //"<html><body>Greetings from <i>Spring Boot!</i></body></html>";
    }

}