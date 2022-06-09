package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Inventory {
    public Candy(String name, BigDecimal price, String location, int numberOfItems){
        super(name, price, location, numberOfItems);
    }

    @Override
    public String message(){
        return "munch, munch, yum";
    }

}
