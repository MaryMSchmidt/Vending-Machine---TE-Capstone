package com.techelevator;

import java.math.BigDecimal;

public class MountainMelter extends Drinks{
    public MountainMelter(String name, BigDecimal price, String location, int numberOfItems){
        super("Mountain Melter", BigDecimal.valueOf(1.50), "C3", numberOfItems);
    }
}
