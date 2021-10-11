package pers.niaonao.crudproject.test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/hello")
    public String TestController(){
        return "\"Helloworld Spring Boot!";
    }

}

