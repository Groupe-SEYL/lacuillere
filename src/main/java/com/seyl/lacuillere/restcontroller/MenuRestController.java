package com.seyl.lacuillere.restcontroller;


import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuRestController {

    @Autowired
    private MenuService menuService;
    List<Menu> listMenu =new ArrayList<>();

@RequestMapping(value="/menus")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
    public List<Menu> listMenu(){
    return (List<Menu>) menuService.getListMenu();
    }
}
