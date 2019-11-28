package com.seyl.lacuillere;

import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.service.MenuServiceImpl;
import com.seyl.lacuillere.service.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LacuillereApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LacuillereApplication.class, args);
    }

    @Autowired
    MenuServiceImpl menuService;

    @Autowired
    RestaurantServiceImpl restaurantService;

    @Override
    public void run(String... args) throws Exception {
        menuService.addMenu("Burger","Un menu tout en légèreté","Salade","Burger", "Sunday", "Coca",12);
        Menu Burger = menuService.getMenuById(1L);
        List<Menu> LMB=new ArrayList<>();
        LMB.add(Burger);
        LMB.add(Burger);
        restaurantService.addRestaurant("Mc Speed King", "Venez gouter nos délicieux burggers",
                LMB,"1990 Route de Grasse, 06600 Antibes", 0, 12);


        menuService.addMenu("M16", "menu Asiatique complet", "Sushi", "Fugu","Dango" ,"Sake", 15);
        Menu M16 = menuService.getMenuById(2L);
        List<Menu> LM16 =new ArrayList<>();
        LM16.add(M16);
        LM16.add(M16);
        restaurantService.addRestaurant("Le palais Asiatique", "Changez de continent le temps d'un repas",
                LM16,"120 Prom. de la Plage, 06800 Cagnes-sur-Mer", 2, 15);



        menuService.addMenu("Le Niçois", "Menu à base de spécialité niçoise", "Beignets de fleurs de courgettes"
                , "Petits farci nicois","Tourte de blette", "Château de Bellet", 50);
        Menu menuNicois = menuService.getMenuById(3L);
        List<Menu> LMN =new ArrayList<>();
        LMN.add(menuNicois);
        LMN.add(menuNicois);
        restaurantService.addRestaurant("La Mama", "Les meilleures spécialités niçoises à vil prix !!",
                LMN,"17 Rue Pairolière, 06000 Nice", 3, 50);


    }
}
