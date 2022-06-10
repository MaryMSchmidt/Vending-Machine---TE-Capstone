package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HandleMoney {


    private BigDecimal balance = new BigDecimal("0.00");
    private int dimes = 0;
    private int quarters = 0;
    private int nickels = 0;
    BigDecimal quarter = new BigDecimal(".25");
    BigDecimal dime = new BigDecimal(".10");
    BigDecimal nickel  = new BigDecimal(".05");
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

   public void makeChange(){

        while (true){
            if(balance.compareTo(quarter) == 0 || balance.compareTo(quarter) == 1){
                balance = balance.subtract(quarter);
                quarters++;
            } else if (balance.compareTo(dime) == 0 || balance.compareTo(dime) == 1){
                balance = balance.subtract(dime);
                dimes++;
            } else if (balance.compareTo(nickel) == 0 || balance.compareTo(nickel) == 1){
                balance = balance.subtract(nickel);
                nickels++;
            } else {
                break;
            }
        }
       System.out.printf("Your change is %s quarter, %s dimes, %s nickels\n", quarters, dimes, nickels);
    }
}
