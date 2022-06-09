package com.techelevator;

import java.math.BigDecimal;

public class Cola extends Drinks{
    public Cola(String name, BigDecimal price, String location, int numberOfItems){
        super("Cola", BigDecimal.valueOf(1.25), "C1", numberOfItems);
    }
}
