package com.techelevator;

import org.junit.Assert;

import java.math.BigDecimal;

public class MakeSaleTests {

    public void should_return_true_for_B2() {
        // arrange
        VendingMachineCLI newMachine = new VendingMachineCLI();
        Inventory sellableItems = new Inventory();
        sellableItems.setInventory();
        BigDecimal chipPrice = new BigDecimal("1.45");
        Chips newChips = new Chips("Stackers", chipPrice, "A2");
        String a2 = "A2";
        // act
        Item actual = newMachine.lookup(a2);

//        boolean actual = sellableItems.getItems().contains(newChips);
//        boolean actual = testList.contains() ;
        // assert
//        Assert.assertEquals("Item is valid, should return true", (newChips.getName()), );
    }
}
