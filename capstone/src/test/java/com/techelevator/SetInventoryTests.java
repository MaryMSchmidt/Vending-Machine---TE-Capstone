package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SetInventoryTests {

    @Test
    public void line_should_return_true_for_identical_info() {
        Inventory testInventory = new Inventory();
        testInventory.setInventory();


        Item testItem = new Chips("Stackers", new BigDecimal("1.45"), "A2");

        Assert.assertTrue("The forSale list should contain the testItem", testInventory.forSale.contains(testItem));
    }
}
