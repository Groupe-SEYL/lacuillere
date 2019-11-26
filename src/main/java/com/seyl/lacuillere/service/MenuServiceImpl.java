package com.seyl.lacuillere.service;

import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public List getListMenu() {
        List<Menu> listMenu = new ArrayList<>();
        listMenu = (List<Menu>) menuRepository.findAll();
        return listMenu;
    }

    @Override
    public Menu addMenu(String name, String description, String entree, String mainCourse, String dessert, String drink, float totalPrice) {
        return menuRepository.save(new Menu(name, description, entree, mainCourse, dessert, drink, totalPrice));
    }

    @Override
    public Menu getMenuById(Long id) {
        Menu menu = menuRepository.getById(id);
        return menu;
    }
}
