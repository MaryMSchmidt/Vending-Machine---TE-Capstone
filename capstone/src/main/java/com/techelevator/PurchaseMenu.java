package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class PurchaseMenu {

    BigDecimal moneyFeed = new BigDecimal("0.00");

    public void returnToPurchaseMenu() {
    System.out.printf("Current Money Provided: $%s\n",moneyFeed);
    System.out.println("(1) Feed Money\n(2) Select Product\n(3) Finish Transaction");
    Scanner userInput = new Scanner(System.in);
    String userChoice = userInput.nextLine();
    }

    public static void main(String[] args) {

        if (userChoice.equals("1")) {
            System.out.println("Enter a whole dollar amount.");
            String userAmountEntered = userInput.nextLine();
            BigDecimal moneyEntered = new BigDecimal(userAmountEntered);
            moneyFeed.add(moneyEntered);

            
        }


    }
}
