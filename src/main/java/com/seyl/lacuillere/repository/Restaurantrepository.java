package com.seyl.lacuillere.repository;

import com.seyl.lacuillere.beans.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface Restaurantrepository  extends CrudRepository<Restaurant, Long> {
}
