package com.techelevator;

import java.math.BigDecimal;

public class HandleMoney {
    private BigDecimal balance;
    private int dimes = 0;
    private int quarters = 0;
    private int nickels = 0;

    public BigDecimal deposit(BigDecimal moneyFeed){
        return balance.add(moneyFeed);
    }

    public BigDecimal sale(BigDecimal price){
        return balance.subtract(price);
    }

//    public BigDecimal makeChange(BigDecimal balance){
//        if(balance.)
//    }
}
