package pers.niaonao.crudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudprojectApplication {

    public static void main(String[] args) {
            SpringApplication.run(CrudprojectApplication.class, args);
            HelloWeb hello = new HelloWeb();
            hello.setName("SpringBoot");
            hello.sayhello();


    }

}
