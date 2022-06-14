package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class HandleMoneyTests {
    @Test
    public void deposit_should_add_testDecimal_to_total() {
        HandleMoney testDeposit = new HandleMoney();
        BigDecimal testDecimal = new BigDecimal("4.33");
        testDeposit.deposit(testDecimal);


        Assert.assertEquals("After depositing $4.33, that should be the total", testDecimal, testDeposit.getBalance());
    }

    @Test
    public void two_deposits_should_lead_to_cumulative_total() {
        HandleMoney testDeposit = new HandleMoney();
        BigDecimal testDecimal = new BigDecimal("4.33");
        testDeposit.deposit(testDecimal);
        testDeposit.deposit(testDecimal);

        BigDecimal totalAfterRunningTwice = new BigDecimal("8.66");

        Assert.assertEquals("After depositing $4.33 twice, $8.66 should be the total", totalAfterRunningTwice, testDeposit.getBalance());
    }

    @Test
    public void testing_the_sale_option() {
        HandleMoney testDeposit = new HandleMoney();
        BigDecimal testDepositAmount = new BigDecimal("1.00");
        BigDecimal testDecimal = new BigDecimal("0.37");
        testDeposit.deposit(testDepositAmount);
        testDeposit.sale(testDecimal);

        BigDecimal postSaleBalance = new BigDecimal("0.63");
        Assert.assertEquals("After depositing $1, then selling an item for $.37, the new balance should be $.63", postSaleBalance, testDeposit.getBalance());
    }

    @Test
    public void testing_sale_method_should_prevent_transaction_because_too_little_deposited() {
        HandleMoney testDeposit = new HandleMoney();
        BigDecimal testDepositAmount = new BigDecimal("1.00");
        BigDecimal testDecimal = new BigDecimal("1.01");
        testDeposit.deposit(testDepositAmount);
        testDeposit.sale(testDecimal);

        BigDecimal postSaleBalance = new BigDecimal("1.00");
        Assert.assertEquals("Sale should not be permitted if it is higher than the balance", postSaleBalance, testDeposit.getBalance());
    }

    @Test
    public void deposit_should_not_go_through_amount_is_too_small() {
        HandleMoney testDeposit = new HandleMoney();
        BigDecimal testDepositAmount = new BigDecimal("0.99");
        testDeposit.deposit(testDepositAmount);

        BigDecimal postDepositBalance = new BigDecimal("0.00");
        Assert.assertEquals("Sale should not be permitted if it is higher than the balance", postDepositBalance, testDeposit.getBalance());
    }

    @Test
    public void testing_makeChange_balance_after_called() {
        HandleMoney testDeposit = new HandleMoney();
        BigDecimal testDepositAmount = new BigDecimal("1.15");
        testDeposit.deposit(testDepositAmount);
        testDeposit.makeChange();

        BigDecimal postSaleBalance = new BigDecimal("0.00");
        Assert.assertEquals("If change is made, balance should return to 0.00", postSaleBalance, testDeposit.getBalance());
    }



}
