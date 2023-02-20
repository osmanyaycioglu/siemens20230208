package com.siemens.training.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountOpTest {

    Account accountLoc;

    @BeforeEach
    public void xyz() {
        // Setup
        this.accountLoc = new Account();
        this.accountLoc.setBalance(new BigDecimal(100));
    }

    @Test
    public void test_withdraw_success_cases() {
        // Test
        this.accountLoc.withdraw(new BigDecimal(70));
        // Validate
        BigDecimal balanceLoc = this.accountLoc.getBalance();
        if (!balanceLoc.equals(new BigDecimal(30))) {
            throw new AssertionError("beklenen 30 gelen : " + balanceLoc);
        }
    }

    @Test
    public void test_withdraw_success_cases_better() {
        // Test
        this.accountLoc.withdraw(new BigDecimal(70));
        // Validate
        assertEquals(new BigDecimal(30),
                     this.accountLoc.getBalance());
    }

    @Test
    public void test_withdraw_fail_cases() {
        // Test
        boolean nullPointer = false;
        try {
            this.accountLoc.withdraw(null);
        } catch (NullPointerException eLoc) {
            nullPointer = true;
        }
        // Validate
        if (!nullPointer) {
            throw new AssertionError("NullPointer atmalıydı");
        }
        // Validate
        //        BigDecimal balanceLoc = this.accountLoc.getBalance();
        //        if (!balanceLoc.equals(new BigDecimal(100))) {
        //            throw new AssertionError("beklenen 100 gelen : " + balanceLoc);
        //        }
    }

    @Test
    public void test_withdraw_success_cases_2() {
        // Test
        this.accountLoc.withdraw(new BigDecimal(70));
        // Validate
        BigDecimal balanceLoc = this.accountLoc.getBalance();
        if (!balanceLoc.equals(new BigDecimal(30))) {
            throw new AssertionError("beklenen 30 gelen : " + balanceLoc);
        }
    }

}
