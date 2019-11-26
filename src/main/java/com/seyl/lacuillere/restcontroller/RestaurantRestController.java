package com.seyl.lacuillere.restcontroller;

import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.beans.Restaurant;
import com.seyl.lacuillere.service.MenuService;
import com.seyl.lacuillere.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/restaurants")
@CrossOrigin(origins = "http://localhost:4242")
public class RestaurantRestController {


    @Autowired
    private RestaurantService restaurantService;

    private MenuService menuService;

    List<Restaurant> listRestaurant = new ArrayList<>();


    @GetMapping
    public List<Restaurant> displayListRestaurant() {
        return (List<Restaurant>) restaurantService.getListRestaurant();
    }


    @DeleteMapping(value = "/{id}")
    public void deleteRestaurant(@PathVariable("id") Long id) {
        restaurantService.deleteRestaurant(id);
    }

    @GetMapping(value = "/{id}")
    public Restaurant displayOneRestaurant(@PathVariable("id") Long id){
        return restaurantService.getRestaurant(id);
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        List<Menu> lm = new ArrayList<Menu>();
        Menu m1=new Menu("Ensemble de Pizza",
                "Pizza Partie",
                "Pizza Nutella",
                "Pizza vegi",
                "Pizza carnivor",
                "Cocacola",
                30);
        Menu m2=new Menu("Ensemble de plats japonais",
                "Délices Japonnais",
                "Dango",
                "Sushi",
                "Fugu",
                "Sake",
                50
        );
        lm.add(m1);
        lm.add(m2);


        // Calcul average price for current restaurant
        float SPrice = 0;
//        for (int i = 0; i < restaurant.getMenus().size(); i++) {
//            SPrice += restaurant.getMenus().get(i).getTotalPrice();
//        }
//        restaurant.setAveragePrice(SPrice / restaurant.getMenus().size());

        for (int i = 0; i < lm.size(); i++) {
            SPrice += lm.get(i).getTotalPrice();
        }
        restaurant.setAveragePrice(SPrice / lm.size());

        // Add and return new restaurant
        Restaurant r = restaurantService.addRestaurant(restaurant.getName(),
                restaurant.getDescription(),
                lm,
                //restaurant.getMenus(),
                restaurant.getAddress(),
                restaurant.getStarsNumber(),
                restaurant.getAveragePrice());
        //40);


        return r;
    }

   /* @PatchMapping("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addMenu(@RequestParam(value = "id_menu")  Long id){

        return Response.status(Response.Status.ACCEPTED).build();
    }*/


}
