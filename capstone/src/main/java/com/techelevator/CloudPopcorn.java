package com.techelevator;

import java.math.BigDecimal;

public class CloudPopcorn extends Chips{
    public CloudPopcorn(String name, BigDecimal price, String location, int numberOfItems){
        super("Cloud Popcorn", BigDecimal.valueOf(3.65), "A4", numberOfItems);
    }
}
