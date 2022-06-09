package com.techelevator;

import java.math.BigDecimal;

public class Stackers extends Chips{
    public Stackers(String name, BigDecimal price, String location, int numberOfItems){
        super("Stackers", BigDecimal.valueOf(1.45), "A2", numberOfItems);
    }
}
