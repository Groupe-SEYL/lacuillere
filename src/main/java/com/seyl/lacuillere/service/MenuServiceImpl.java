package com.seyl.lacuillere.service;

import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public List getListMenu() {
        List<Menu> listMenu = new ArrayList<>();
        listMenu = (List<Menu>) menuRepository.getAll();
        return listMenu;
    }

    @Override
    public void addMenu() {

    }

    @Override
    public void deleteMenu() {

    }
}
