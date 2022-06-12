package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DisplayItemsTests {
    @Test
    public void true_when_full_list_is_displayed() {
        // arrange
        Inventory sellableItems = new Inventory();
        sellableItems.setInventory();
        List<String> testList = new ArrayList<>();

        testList.add("Crunchie");
        testList.add("Moonpie");
        // act
        boolean actual = sellableItems.forSale.containsAll(testList);
//        boolean actual = testList.contains() ;
                // assert
                Assert.assertTrue("If the list prints, it should contain the testList items.", actual);
    }
}
