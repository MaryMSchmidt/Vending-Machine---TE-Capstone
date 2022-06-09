package com.techelevator;

import java.math.BigDecimal;

public class Drinks extends Item {
    public Drinks(String name, BigDecimal price, String location){
        super(name, price, location);
    }

    @Override
    public String message(){
        return "glug, glug, yum";
    }
}
