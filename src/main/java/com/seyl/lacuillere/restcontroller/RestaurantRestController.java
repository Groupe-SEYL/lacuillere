package com.seyl.lacuillere.restcontroller;

import com.seyl.lacuillere.beans.Restaurant;
import com.seyl.lacuillere.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @DELETE
    @RequestMapping(value = "/restaurant/{id}")
    public Response deleteRestaurant (@PathVariable("id") Long id){
        restaurantService.deleteRestaurant(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }


    @PostMapping("/listRestaurant")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addRestaurant(){
        restaurantService.addRestaurant(addRestaurant());
        return Response.status(Response.Status.CREATED).build();
    }


}
