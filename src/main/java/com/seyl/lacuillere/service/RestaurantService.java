package com.seyl.lacuillere.service;

import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.beans.Restaurant;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface RestaurantService {


    List<Restaurant> getListRestaurant();

    Restaurant addRestaurant(String name, String description, List<Menu> menus, String address, int starsNumber, float averagePrice);

    void deleteRestaurant(Long id);



}
