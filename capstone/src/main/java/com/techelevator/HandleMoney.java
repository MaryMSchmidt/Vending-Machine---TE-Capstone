package com.techelevator;

import java.math.BigDecimal;

public class HandleMoney {

    private BigDecimal balance = new BigDecimal("0.00");
    private int dimes = 0;
    private int quarters = 0;
    private int nickels = 0;

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal deposit(BigDecimal moneyEntered){
         balance = balance.add(moneyEntered);
         return balance;
    }

    public BigDecimal sale(BigDecimal price){
        balance = balance.subtract(price);
        return balance;
    }

//    public BigDecimal makeChange(BigDecimal balance){
//        if(balance.)
//    }
}
