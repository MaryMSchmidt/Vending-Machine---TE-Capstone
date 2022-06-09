package com.techelevator;

import java.math.BigDecimal;

public class WonkaBar extends Candy{
    public WonkaBar(String name, BigDecimal price, String location, int numberOfItems){
        super("Wonka Bar", BigDecimal.valueOf(1.50), "B3", numberOfItems);
    }
}
