package com.seyl.lacuillere;

import com.seyl.lacuillere.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LacuillereApplication {

    public static void main(String[] args) {
        SpringApplication.run(LacuillereApplication.class, args);
    }

//    @Autowired
//    RestaurantService service;

    public void run(String... args){
//        try {
//            service.register("Geward", "Louis", "DURANDY", "ld@", "LD");
//        } catch (UserAlreadyExistException e){
//            System.out.println(e.getMessage());
//        }
    }

}
