package com.seyl.lacuillere.restcontroller;


import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.service.MenuService;
import com.seyl.lacuillere.service.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/Menu")
public class MenuRestController {

    @Autowired
    private MenuServiceImpl menuService;

    List<Menu> listMenu =new ArrayList<>();

//    @RequestMapping(value="/menus")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Menu> listMenu(){
//    return (List<Menu>) menuService.getListMenu();
//    }

    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @PostMapping("/add")
    public void registerUser(@ModelAttribute("Menu") Menu menu){
    menuService.addMenu(menu.getName(),
            menu.getDescription(),
            menu.getEntree(),
            menu.getMainCourse(),
            menu.getDessert(),
            menu.getDrink(),
            menu.getTotalPrice());
    }
}
