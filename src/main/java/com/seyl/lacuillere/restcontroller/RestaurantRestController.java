package com.seyl.lacuillere.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantRestController {

    @GetMapping("/displayRestaurant")
    public void displayOneRestaurant(){

    }
}
