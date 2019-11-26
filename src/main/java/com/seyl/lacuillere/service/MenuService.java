package com.seyl.lacuillere.service;

import com.seyl.lacuillere.beans.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {
    List<Menu> getListMenu();

    Menu addMenu(String name, String description, String entree, String mainCourse, String dessert, String drink, float totalPrice);

    Menu getMenu(Long id);

}
