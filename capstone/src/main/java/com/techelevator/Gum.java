package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Item {
    public Gum(String name, BigDecimal price, String location){
        super(name, price, location);
    }

    @Override
    public String message(){
        return "chew, chew, yum";
    }
}
