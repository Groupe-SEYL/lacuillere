package com.seyl.lacuillere.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService <Menu> {
    List<Menu> getListMenu();

    void addMenu();

    void deleteMenu();
}
