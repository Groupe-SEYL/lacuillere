package com.seyl.lacuillere.restcontroller;


import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.service.MenuService;
import com.seyl.lacuillere.service.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController

@RequestMapping("/menu")
public class MenuRestController {

    @Autowired
    private MenuServiceImpl menuService;

    List<Menu> listMenu =new ArrayList<>();

    @CrossOrigin(origins = "http://localhost:4242")
    @GetMapping
    public List<Menu> listMenu(){
    return (List<Menu>) menuService.getListMenu();
    }

    @CrossOrigin(origins = "http://localhost:4242")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Menu registerUser(@RequestBody Menu menu){
    Menu m = menuService.addMenu(menu.getName(),
            menu.getDescription(),
            menu.getEntree(),
            menu.getMainCourse(),
            menu.getDessert(),
            menu.getDrink(),
            menu.getTotalPrice());
    return m;
    }
}
