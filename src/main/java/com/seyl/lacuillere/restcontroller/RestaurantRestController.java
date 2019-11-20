package com.seyl.lacuillere.restcontroller;

import com.seyl.lacuillere.beans.Restaurant;
import com.seyl.lacuillere.service.RestaurantService;
import com.seyl.lacuillere.service.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantRestController {


    @Autowired
    private RestaurantService restaurantService;

    List<Restaurant> listRestaurant = new ArrayList<>();

    @RequestMapping(value = "/displayRestaurant")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Restaurant> displayListRestaurant(){
        return (List<Restaurant>) restaurantService.getListRestaurant();
    }


//    @RequestMapping(value = "/restaurant/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Restaurant> delete(PathVariable("id") String id){
//        listRestaurant.remove(id);
//        return new ResponseEntity<>("Restaurant is deleted successfully", HttpStatus.OK);
//    }

}
