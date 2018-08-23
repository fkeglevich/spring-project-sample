package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.joda.time.*;
import org.joda.time.format.*;

@RestController
public class HelloController {

    @RequestMapping("/data")
    public String index() {
		
		DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH'h'mm");
		
		DateTime currentTime = new DateTime();
		
        return "Greetings from Spring Boot! " + formatter.print(currentTime); //"<html><body>Greetings from <i>Spring Boot!</i></body></html>";
    }

}