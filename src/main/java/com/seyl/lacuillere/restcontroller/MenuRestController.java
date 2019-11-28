package com.seyl.lacuillere.restcontroller;


import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.service.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/menu")
public class MenuRestController {

    @Autowired
    private MenuServiceImpl menuService;

    @GetMapping
    public List<Menu> listMenu() {
        return (List<Menu>) menuService.getListMenu();
    }

    @GetMapping(value = "/{id}")
    public Menu displayOneRestaurant(@PathVariable("id") Long id) {
        return menuService.getMenuById(id);
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Menu registerUser(@RequestBody Menu menu) {
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
