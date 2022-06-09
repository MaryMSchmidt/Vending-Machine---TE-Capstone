package com.techelevator;

import java.math.BigDecimal;

public class GrainWaves extends Chips{
    public GrainWaves(String name, BigDecimal price, String location, int numberOfItems){
        super("Grain Waves", BigDecimal.valueOf(2.75), "A3", numberOfItems);
    }
}
