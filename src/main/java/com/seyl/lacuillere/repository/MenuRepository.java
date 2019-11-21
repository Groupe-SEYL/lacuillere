package com.seyl.lacuillere.repository;

import com.seyl.lacuillere.beans.Menu;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuRepository extends CrudRepository<Menu, Long> {

        Menu getById(Long id);


}