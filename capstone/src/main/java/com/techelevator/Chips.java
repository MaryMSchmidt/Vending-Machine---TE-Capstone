package com.techelevator;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class Chips extends Item {

    public Chips(String name, BigDecimal price, String location) {
        super(name, price, location);
    }

    @Override
   public String message(){
        return "crunch, crunch, yum";
    }
}
