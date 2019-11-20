package com.seyl.lacuillere.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Menu")
public class Menu implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String entree;
    private String mainCourse;
    private String dessert;
    private String drink;
    private float totalPrice;



    public Menu() {
    }

    public Menu(String name, String description, String entree, String mainCourse, String dessert, String drink, float totalPrice) {
        this.name = name;
        this.description = description;
        this.entree = entree;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drink = drink;
        this.totalPrice = totalPrice;
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

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;

    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
