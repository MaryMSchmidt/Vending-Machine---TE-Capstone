package com.techelevator;

import java.math.BigDecimal;

public class DrSalt extends Drinks{
    public DrSalt(String name, BigDecimal price, String location, int numberOfItems){
        super("Dr. Salt", BigDecimal.valueOf(1.50), "C2", numberOfItems);
    }
}
