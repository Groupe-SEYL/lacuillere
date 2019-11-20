package com.seyl.lacuillere.service;

import com.seyl.lacuillere.beans.Restaurant;
import com.seyl.lacuillere.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService{


    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public List getListRestaurant() {
        List<Restaurant> listRestaurant = new ArrayList<>();
        listRestaurant = (List<Restaurant>) restaurantRepository.findAll();
        return listRestaurant;
    }

    @Override
    public Object addRestaurant(Object o) {
        return null;
    }


    public Restaurant addRestaurant(Restaurant restaurant) {
        Restaurant newRestaurant = addRestaurant(restaurant);
        return (Restaurant) restaurantRepository.save(newRestaurant);
    }




    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
}
