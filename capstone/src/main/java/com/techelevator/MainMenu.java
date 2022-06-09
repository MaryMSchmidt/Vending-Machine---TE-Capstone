package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainMenu {

    public static void displayInventoryList() {
        File inventoryFile = new File("vendingmachine.csv");
        try (Scanner fileScanner = new Scanner(inventoryFile)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        }
        catch (FileNotFoundException fnf) {
            System.out.println("file not found");
        }
    }

    public static void main(String[] args) {
        System.out.println("(1) Display Vending Machine Items\n(2) Purchase\n(3) Exit");
        Scanner userScanner = new Scanner(System.in);
        String userChoice = userScanner.nextLine();

        if (userChoice.equals("1")){
            displayInventoryList();
        }






    }



}
