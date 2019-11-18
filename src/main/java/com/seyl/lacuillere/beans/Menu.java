package com.seyl.lacuillere.beans;

public class Menu {
    private Long id;
    private String name;
    private String description;
    private Dish entree;
    private Dish mainCourse;
    private Dish dessert;
    private float totalPrice;
    private Drink drink;

    public Menu() {
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

    public Dish getEntree() {
        return entree;
    }

    public void setEntree(Dish entree) {
        this.entree = entree;
    }

    public Dish getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(Dish mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Dish getDessert() {
        return dessert;
    }

    public void setDessert(Dish dessert) {
        this.dessert = dessert;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = entree.getPrice() + mainCourse.getPrice() + dessert.getPrice();
        this.totalPrice = totalPrice;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
