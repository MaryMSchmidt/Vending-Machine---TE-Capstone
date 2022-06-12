package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VendingMachineCLI {

    Inventory sellableItems = new Inventory();
    HandleMoney takeMoney = new HandleMoney();

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
                        logFeedMoney(bDUserAmountEntered);
                        System.out.printf("Current Money Provided: %s\n", takeMoney.getBalance());
                    } else if (userSelection.equals("2")) {
                        displayItems();
                        System.out.println("Please select item location. ex: A1 ");
                        String itemChosen = userScanner.nextLine();
                        makeSale(itemChosen);
                    } else if (userSelection.equals("3")){
                        logMakeChange();
                        break;
                    } else {
                        System.out.println("Please make a valid selection");
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
            logPurchase(item);
            item.dispense(takeMoney.sale(item.getPrice()));

        } else {
            System.out.println("Insufficient funds. Please add more money.");
        }
    }

        public void logMakeChange(){

            try {
                File transactionLog = new File("C:\\Users\\Student\\workspace\\capstone-1-team-06\\capstone\\src\\main\\java\\com\\techelevator\\Log.txt");
                FileOutputStream file = new FileOutputStream(transactionLog, true);
                PrintWriter fileWriter = new PrintWriter(file);
                fileWriter.printf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss")) + " GIVE CHANGE: $" + takeMoney.getBalance() +  " $0.00\n");
                takeMoney.makeChange();
                fileWriter.close();
            } catch (FileNotFoundException fnf){
                System.out.println("No file to write in");
            }
        }

    public void logFeedMoney(BigDecimal bDUserAmountEntered){

        try {
            File transactionLog = new File("C:\\Users\\Student\\workspace\\capstone-1-team-06\\capstone\\src\\main\\java\\com\\techelevator\\Log.txt");
            FileOutputStream file = new FileOutputStream(transactionLog, true);
            PrintWriter fileWriter = new PrintWriter(file);
            fileWriter.printf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"))+ " FEED MONEY: $" + takeMoney.getBalance() +  " $" + (takeMoney.getBalance().add(bDUserAmountEntered)) + "\n");
            takeMoney.deposit(bDUserAmountEntered);
            fileWriter.close();
        } catch (FileNotFoundException fnf){
            System.out.println("No file to write in");
        }
    }

    public void logPurchase(Item item){

        try {
            File transactionLog = new File("C:\\Users\\Student\\workspace\\capstone-1-team-06\\capstone\\src\\main\\java\\com\\techelevator\\Log.txt");
            FileOutputStream file = new FileOutputStream(transactionLog, true);
            PrintWriter fileWriter = new PrintWriter(file);
            fileWriter.printf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss")) + " " + item.getName() +  " " + item.getLocation() + " $" + takeMoney.getBalance() + " $" + (takeMoney.getBalance().subtract(item.getPrice())) + "\n");
            fileWriter.close();
        } catch (FileNotFoundException fnf){
            System.out.println("No file to write in");
        }
    }
    }






