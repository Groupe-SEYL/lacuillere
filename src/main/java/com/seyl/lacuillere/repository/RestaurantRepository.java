package com.seyl.lacuillere.repository;

import com.seyl.lacuillere.beans.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository  extends CrudRepository<Restaurant, Long> {

    Restaurant getById(Long id);
    Restaurant getByName(String name);

    List<Restaurant> findAllByName(String name);
}
