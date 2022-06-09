package com.techelevator;

import java.math.BigDecimal;

public class Chiclets extends Gum{
    public Chiclets(String name, BigDecimal price, String location, int numberOfItems){
        super("Chiclets", BigDecimal.valueOf(0.75), "D3", numberOfItems);
    }
}
