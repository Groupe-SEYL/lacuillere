package com.seyl.lacuillere.repository;

import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.beans.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuRepository extends CrudRepository<Menu, Long> {

        List<Menu> getAll();
        Menu getById(Long id);


}
