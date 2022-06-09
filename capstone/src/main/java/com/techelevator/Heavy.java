package com.techelevator;

import java.math.BigDecimal;

public class Heavy extends Drinks{
    public Heavy(String name, BigDecimal price, String location, int numberOfItems){
        super("Heavy", BigDecimal.valueOf(1.50), "C4", numberOfItems);
    }
}
