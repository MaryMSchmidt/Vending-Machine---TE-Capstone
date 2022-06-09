package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Item {
    public Candy(String name, BigDecimal price, String location){
        super(name, price, location);
    }

    @Override
    public String message(){
        return "munch, munch, yum";
    }

}
