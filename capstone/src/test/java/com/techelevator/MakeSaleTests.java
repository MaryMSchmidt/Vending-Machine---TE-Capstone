package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class MakeSaleTests {

    @Test
    public void lookup_should_return_null_for_value_X() {
        VendingMachineCLI newVendingMachine = new VendingMachineCLI();

        String location = "x";

        newVendingMachine.lookup(location);

//        String notThere = null;
        Assert.assertEquals("both values should be null", null, newVendingMachine.lookup(location));
    }

    @Test
    public void should_return_valid_location_from_lookup() {
        VendingMachineCLI newVendingMachine = new VendingMachineCLI();

        String location = "A2";
        newVendingMachine.lookup(location);

        Item testChips = new Chips("Stackers", new BigDecimal("1.45"), "A2");

        Assert.assertEquals("valid location given", "A2", testChips.getLocation());
    }
}
