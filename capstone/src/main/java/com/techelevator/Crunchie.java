package com.techelevator;

import java.math.BigDecimal;

public class Crunchie extends Candy{
    public Crunchie(String name, BigDecimal price, String location, int numberOfItems){
        super("Crunchie", BigDecimal.valueOf(1.75), "B4", numberOfItems);
    }
}
