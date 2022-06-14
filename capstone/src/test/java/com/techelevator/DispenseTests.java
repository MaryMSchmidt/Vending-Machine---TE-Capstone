package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class DispenseTests {

    @Test
    public void some_sort_of_item_test() {

        BigDecimal cost = new BigDecimal("1.80");
        Candy testItem = new Candy("Moonpie", cost, "D2");
        int numberOfItemsRemaining = 4;
        testItem.dispense(cost);
        Assert.assertEquals("Should have 4 remaining", numberOfItemsRemaining, testItem.getNumberOfItems());
    }
}
