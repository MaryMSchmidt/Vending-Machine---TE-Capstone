package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {



    public Inventory(){

    }
    List<Item> forSale = new ArrayList<>();
    File inventoryFile = new File("vendingmachine.csv");
    public void setInventory() {


        try (Scanner fileScanner = new Scanner(inventoryFile)) {
            while (fileScanner.hasNextLine()) {
                String[] vendingItem = fileScanner.nextLine().split("\\|");
                if (vendingItem[3].contains("Chip")) {
                    Item item = new Chips(vendingItem[1], new BigDecimal(vendingItem[2]), vendingItem[0]);
                    forSale.add(item);
                } else if (vendingItem[3].contains("Candy")) {
                    Item item = new Candy(vendingItem[1], new BigDecimal(vendingItem[2]), vendingItem[0]);
                    forSale.add(item);
                } else if (vendingItem[3].contains("Drink")) {
                    Item item = new Drinks(vendingItem[1], new BigDecimal(vendingItem[2]), vendingItem[0]);
                    forSale.add(item);
                } else {
                    Item item = new Gum(vendingItem[1], new BigDecimal(vendingItem[2]), vendingItem[0]);
                    forSale.add(item);
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("file not found");
        }

    }

    public List<Item> getItems() {
        return forSale;
    }
}



