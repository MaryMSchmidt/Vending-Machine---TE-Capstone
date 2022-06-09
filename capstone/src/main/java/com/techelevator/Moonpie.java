package com.techelevator;

import java.math.BigDecimal;

public class Moonpie extends Candy{
    public Moonpie(String name, BigDecimal price, String location, int numberOfItems){
        super("Moonpie", BigDecimal.valueOf(1.80), "B1", numberOfItems);
    }
}
