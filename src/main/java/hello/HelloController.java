package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.joda.time.LocalTime;

@RestController
public class HelloController {

    @RequestMapping("/data")
    public String index() {
		LocalTime currentTime = new LocalTime();
        return "Greetings from Spring Boot!" + currentTime; //"<html><body>Greetings from <i>Spring Boot!</i></body></html>";
    }

}