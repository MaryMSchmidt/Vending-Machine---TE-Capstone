package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetInventoryTests {

    @Test
    public void line_should_return_true_for_identical_info() {
        VendingMachineCLI testMachine = new VendingMachineCLI();
        Inventory sellableItems = new Inventory();
        sellableItems.setInventory();
        Item sampleItem = testMachine.lookup("A2");

        List<Item> testList = new ArrayList<>();
        Item testItem = new Chips("Stacker", new BigDecimal("1.45"), "A2");
        testList.add(testItem);

       boolean trueIfEquals = sellableItems.forSale.get(1).equals(testItem);

        Assert.assertEquals("The forSale list has a match with a line on the testList", testItem, sampleItem);
    }

    @Test
    public void inventory_is_set_into_list() {
        //ARRANGE
        Inventory inventory = new Inventory();
        inventory.setInventory();
        BigDecimal price = new BigDecimal("3.05");
        Item item = new Chips("Potato Crisps", price, "A1");
        List<Item> list = new ArrayList<>();
        list.add(item);
        //ACT

        //ASSERT
        Assert.assertEquals("Item is added into the List", "A1 | Potato Crisps | 3.05 | items remaining: 5");
    }
    }




