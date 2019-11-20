package com.seyl.lacuillere.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService <Menu> {
    List<Menu> getListMenu();

    void addMenu(String name, String description, String entree, String mainCourse, String dessert, String drink, float totalPrice);

}
