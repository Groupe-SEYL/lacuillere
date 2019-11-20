package com.seyl.lacuillere.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface RestaurantService <Restaurant> {


    List<Restaurant> getListRestaurant();

    void addRestaurant();

    void deleteRestaurant();

}
