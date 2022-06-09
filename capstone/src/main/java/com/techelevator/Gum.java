package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Inventory{
    public Gum(String name, BigDecimal price, String location, int numberOfItems){
        super(name, price, location, numberOfItems);
    }

    @Override
    public String message(){
        return "chew, chew, yum";
    }
}
