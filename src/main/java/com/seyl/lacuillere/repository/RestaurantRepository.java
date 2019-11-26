package com.seyl.lacuillere.repository;

import com.seyl.lacuillere.beans.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository  extends CrudRepository<Restaurant, Long> {

    Restaurant getById(Long id);
    Restaurant getByName(String name);

    Restaurant findByName(String name);
}
