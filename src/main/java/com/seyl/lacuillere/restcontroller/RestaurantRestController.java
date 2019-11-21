package com.seyl.lacuillere.restcontroller;

import com.seyl.lacuillere.beans.Restaurant;
import com.seyl.lacuillere.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4242")
public class RestaurantRestController {


    @Autowired
    private RestaurantService restaurantService;

    List<Restaurant> listRestaurant = new ArrayList<>();



    @GetMapping("/restaurants")
    public List<Restaurant> displayListRestaurant(){
        return (List<Restaurant>) restaurantService.getListRestaurant();
    }



    @DeleteMapping(value = "/{id}")
    public void deleteRestaurant (@PathVariable("id") Long id){
        restaurantService.deleteRestaurant(id);
    }


    @PostMapping("/newrestaurant")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant){
        float SPrice=0;
        Restaurant r = restaurantService.addRestaurant(restaurant.getName(),
                restaurant.getDescription(),
                restaurant.getMenu(),
                restaurant.getAddress(),
                restaurant.getStarsNumber());
        for(int i = 0; i<restaurant.getMenu().size();i++){
            SPrice+=restaurant.getMenu().get(i).getTotalPrice();
        }
        r.setAveragePrice(SPrice/restaurant.getMenu().size());
        return r;
    }

   /* @PatchMapping("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addMenu(@RequestParam(value = "id_menu")  Long id){

        return Response.status(Response.Status.ACCEPTED).build();
    }*/


}
