package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.objenesis.instantiator.android.Android10Instantiator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LookUpTests {
    //    @Test
//    public void testing_for_null_to_return_false() {
//        // arrange
//        Inventory sellableItems = new Inventory();
//        sellableItems.setInventory();
//        String x = "x";
////        BigDecimal chipPrice = new BigDecimal("3.00");
////        Chips newChips = new Chips("Sunchips", chipPrice, "F2");
//        // act
//        String result = "x";
////        boolean actual = testList.contains() ;
//        // assert
//        Assert.assertFalse("Not a valid location, should return null", result);
//    }
    @Test
    public void should_return_true_for_B2() {
        // arrange
        VendingMachineCLI newMachine = new VendingMachineCLI();
        Inventory sellableItems = new Inventory();
        sellableItems.setInventory();
        BigDecimal chipPrice = new BigDecimal("1.45");
        Chips newChips = new Chips("Stackers", chipPrice, "A2");
        String a2 = "A2";
        // act
        Item actual = newMachine.lookup("a2");

//        boolean actual = sellableItems.getItems().contains(newChips);
//        boolean actual = testList.contains() ;
        // assert
        Assert.assertEquals("Item is valid, should return true", newChips, actual);
    }
}


