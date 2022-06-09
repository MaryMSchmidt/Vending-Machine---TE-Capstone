package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Inventory{

    public Chips(String name, BigDecimal price, String location, int numberOfItems){
        super(name, price, location, numberOfItems);
    }

    @Override
   public String message(){
        return "crunch, crunch, yum";
    }
}
