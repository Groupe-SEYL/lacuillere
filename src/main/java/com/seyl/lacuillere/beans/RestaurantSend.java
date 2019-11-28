package com.seyl.lacuillere.beans;

import java.io.Serializable;
import java.util.List;

public class RestaurantSend implements Serializable {

    private String name;
    private String description;
    private List<Long> menus;
    private String address;
    private int starsNumber;

    public RestaurantSend() {
    }

    public RestaurantSend(String name, String description, List<Long> menus, String address, int starsNumber) {
        this.name = name;
        this.description = description;
        this.menus = menus;
        this.address = address;
        this.starsNumber = starsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getMenus() {
        return menus;
    }

    public void setMenus(List<Long> menus) {
        this.menus = menus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStarsNumber() {
        return starsNumber;
    }

    public void setStarsNumber(int starsNumber) {
        this.starsNumber = starsNumber;
    }
}
