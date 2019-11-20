package com.seyl.lacuillere.repository;

import com.seyl.lacuillere.beans.Food;
import org.springframework.data.repository.CrudRepository;

public interface Foodrepository  extends CrudRepository<Food, Long> {
}
