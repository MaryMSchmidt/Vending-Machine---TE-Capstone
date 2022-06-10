package com.techelevator;

import java.math.BigDecimal;

public abstract class Item {
    private String name;
    private BigDecimal price;
    private String location;
    private int numberOfItems = 5;



    public Item(String name, BigDecimal price, String location) {
        this.name = name;
        this.price = price;
        this.location = location;

    }
    public Item(String name, BigDecimal price, String location, int numberOfItems) {
        this.name = name;
        this.price = price;
        this.location = location;
        this.numberOfItems = numberOfItems;
    }


        public void dispense(BigDecimal newBalance) {
            numberOfItems--;
            System.out.printf("%s, %s, %s remaining, %s\n", name, price, newBalance, message());
        }


    public int getNumberOfItems() {
        return numberOfItems;
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



    public abstract String message();
}
