package com.seyl.lacuillere.service;

import com.seyl.lacuillere.beans.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface RestaurantService <Restaurant> {


    List<Restaurant> getListRestaurant();

    void addRestaurant(String name, String description, String address, int starsNumber);

    void deleteRestaurant(Long id);

    void addMenuToRestaurant(Menu menu);

    void editStar(int nbstar);



}
