package com.techelevator;

import java.math.BigDecimal;

public abstract class Inventory {
    private String name;
    private BigDecimal price;
    private String location;
    private int numberOfItems = 5;

    public Inventory (String name, BigDecimal price, String location, int numberOfItems){
        this.name = name;
        this.price = price;
        this.location = location;
        this.numberOfItems = numberOfItems;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public abstract String message();

    public void dispense(){
        System.out.printf("%s, %s, %s, %s remaining", name, price, message());
        numberOfItems--;
    }
}
