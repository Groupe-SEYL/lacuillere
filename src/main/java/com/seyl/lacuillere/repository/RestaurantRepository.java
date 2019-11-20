package com.seyl.lacuillere.repository;

import com.seyl.lacuillere.beans.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface RestaurantRepository extends CrudRepository {

    List<Restaurant> getListRestaurant();

    List<Restaurant> saveAll();
}
