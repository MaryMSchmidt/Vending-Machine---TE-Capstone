package com.techelevator;

import java.math.BigDecimal;

public class PotatoCrisps extends Chips{

    public PotatoCrisps(String name, BigDecimal price, String location, int numberOfItems){
        super("Potato Crisps", BigDecimal.valueOf(3.05), "A1", numberOfItems);
    }


}
