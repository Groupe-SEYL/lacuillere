package com.seyl.lacuillere.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Restaurant")
public class Restaurant implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(name = "Restaurant_Menu",
    joinColumns = @JoinColumn(name = "Restaurant_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "Menu_id", referencedColumnName = "id"))
    private List<Menu> menus;
    private String address;
    private int starsNumber;
    private float averagePrice;

    public Restaurant() {
    }

    public Restaurant(String name, String description, List<Menu> menus, String address, int starsNumber, float averagePrice) {
        this.name = name;
        this.description = description;
        this.menus = menus;
        this.address = address;
        this.starsNumber = starsNumber;
        this.averagePrice = averagePrice;
    }

    public void addmenu(Menu menu){
        this.menus.add(menu);
        this.averagePrice+=menu.getTotalPrice();
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Menu> getMenu() {
        return menus;
    }

    public void setMenu(List<Menu> menu) {
        this.menus = menu;
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
