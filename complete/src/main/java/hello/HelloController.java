package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "\nGreetings from Spring Boot!";
    }

    @RequestMapping("/test")
    public Test test(
        @RequestParam(value="name", defaultValue="a") String name,
        @RequestParam(value = "id", defaultValue = "1") String id) {
        return new Test(name, id);
    }
    
}
