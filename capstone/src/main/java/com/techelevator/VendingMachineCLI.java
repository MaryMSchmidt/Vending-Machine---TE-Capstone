package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class VendingMachineCLI {

    Inventory sellableItems = new Inventory();
//            sellableItems.setInventory();
    HandleMoney takeMoney = new HandleMoney();

//    try
//
//    {
//        FileOutputStream file = new FileOutputStream(transactionLog);
//        PrintWriter fileWriter = new PrintWriter(file);
//    } catch (FileNotFoundException fnf){
//        System.out.println("No file to write in");
//    }

    public VendingMachineCLI() {
    }

    public static void main(String[] args) {
        VendingMachineCLI cli = new VendingMachineCLI();
        cli.run();


    }

    public void run() {


        sellableItems.setInventory();
        while (true) {
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
                        // enter the writer code line here
                        takeMoney.deposit(bDUserAmountEntered);
                        System.out.printf("Current Money Provided: %s\n", takeMoney.getBalance());
                    } else if (userSelection.equals("2")) {
                        displayItems();
                        System.out.println("Please select item location. ex: A1 ");
                        String itemChosen = userScanner.nextLine();
                        makeSale(itemChosen);
                    } else {
                        takeMoney.makeChange();
                        break;
                    }
                }
            }
            else {
                break;
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

        if(item.getPrice().compareTo(takeMoney.getBalance()) == 0 || item.getPrice().compareTo(takeMoney.getBalance()) == -1) {
            item.dispense(takeMoney.sale(item.getPrice()));

        } else {
            System.out.println("Insufficient funds. Please add more money.");
        }
    }
    




}


