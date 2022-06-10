package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachineCLI {

    Inventory sellableItems = new Inventory();
//            sellableItems.setInventory();
    HandleMoney takeMoney = new HandleMoney();

    public VendingMachineCLI() {
    }

    public static void main(String[] args) {
        VendingMachineCLI cli = new VendingMachineCLI();
        cli.run();


    }

    public void run() {

        sellableItems.setInventory();
//        Item product = new Item();

        System.out.println("(1) Display Vending Machine Item\n(2) Purchase\n(3) Exit");

        Scanner userScanner = new Scanner(System.in);
        String userChoice = userScanner.nextLine();

        if (userChoice.equals("1")) {
            displayItems();
        } else if (userChoice.equals("2")) {

            takeMoney.getBalance();
            System.out.printf("Current Money Provided: $%s\n", takeMoney.getBalance());
            while (true) {
                System.out.println("(1) Feed Money\n(2) Select Product\n(3) Finish Transaction");
                String userSelection = userScanner.nextLine();

                BigDecimal newBalance = new BigDecimal("0.00");
                if (userSelection.equals("1")) {
                    System.out.println("Enter a whole dollar amount.");
                    String userAmountEntered = userScanner.nextLine();
                    BigDecimal bDUserAmountEntered = new BigDecimal(userAmountEntered);
                    takeMoney.deposit(bDUserAmountEntered);
                    System.out.printf("Current Money Provided: %s\n", takeMoney.getBalance());
                } else if (userSelection.equals("2")) {
                    displayItems();
                    System.out.println("Please select item location. ex: A1 ");
                    String itemChosen = userScanner.nextLine();
                    makeSale(itemChosen);
                } else if (userSelection.equals("3")) {
                    break;
                }
            }
        }

    }

    public void displayItems() {
        for (Item item : sellableItems.forSale) {
            System.out.printf("%s | %s | %s | items remaining: %s\n", item.getLocation(), item.getName(), item.getPrice(), item.getNumberOfItems());
        }
    }

    public Item lookup(String itemChosen) {
        for(Item item : sellableItems.getItems()) {
            if (item.getLocation().equalsIgnoreCase(itemChosen)) {
                return item;
            }
        }
        return null;
    }

    public void makeSale(String itemChosen) {
        Item item = lookup(itemChosen);
        if (item == null) {
            System.out.println("This item does not exist");
            return;
        }

        if (item.getNumberOfItems() == 0) {
            System.out.println("That item is sold out.");
            return;
        }

        item.dispense(takeMoney.sale(item.getPrice()));

    }
}


