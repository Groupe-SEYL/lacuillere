package com.seyl.lacuillere.service;

import com.seyl.lacuillere.beans.Menu;
import com.seyl.lacuillere.beans.Restaurant;
import com.seyl.lacuillere.repository.MenuRepository;
import com.seyl.lacuillere.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {


    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List getListRestaurant() {
        List<Restaurant> listRestaurant = (List<Restaurant>) restaurantRepository.findAll();
        return listRestaurant;
    }

    @Override
    public Restaurant addRestaurant(String name, String description, List<Menu> menus, String address, int starsNumber, float avgprice) {
        List<Menu> savedMenus = (List<Menu>) menuRepository.saveAll(menus);
        return restaurantRepository.save(new Restaurant(name, description, savedMenus, address, starsNumber, avgprice));
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }


}
