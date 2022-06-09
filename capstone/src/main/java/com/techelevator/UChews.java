package com.techelevator;

import java.math.BigDecimal;

public class UChews extends Gum{
    public UChews(String name, BigDecimal price, String location, int numberOfItems){
        super("U-Chews", BigDecimal.valueOf(0.85), "D1", numberOfItems);
    }

}
