package com.techelevator;

import java.math.BigDecimal;

public class Drinks extends Inventory {
    public Drinks(String name, BigDecimal price, String location, int numberOfItems){
        super(name, price, location, numberOfItems);
    }

    @Override
    public String message(){
        return "glug, glug, yum";
    }
}
