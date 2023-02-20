package com.siemens.training.bank;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

class CustomerTest {

    private Customer customer;

    public CustomerTest() {
        System.out.println("Create new CustomerTest");
    }

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("afterAll");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("beforeEach");
        this.customer = new Customer("osman",
                                     "yay",
                                     "osmany",
                                     "123456");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("afterEach");
    }

    @Test
    void testParseAccounts() {
        System.out.println("testParseAccounts");
        // fail("Not yet implemented");
    }

    @Test
    void testAddAccount() {
        System.out.println("testAddAccount");
        this.customer.addAccount(new Account("tlhesbi",
                                             EAccountType.TL,
                                             BigDecimal.TEN));
        List<Account> accountListLoc = this.customer.getAccountList();
        boolean findIt = false;
        for (Account accountLoc : accountListLoc) {
            if (accountLoc.getAccountName()
                          .equals("tlhesbi")
                && (accountLoc.getAccountType() == EAccountType.TL)
                && accountLoc.getBalance()
                             .equals(BigDecimal.TEN)) {
                findIt = true;
                break;
            }
        }

        if (!findIt) {
            throw new AssertionFailedError("Eklenenle alınan aynı değil");
        }
        this.customer.addAccount(null);
        List<Account> accountList2Loc = this.customer.getAccountList();
        if (accountList2Loc.size() != 1) {
            throw new AssertionFailedError("Null problemi");
        }

    }

    @Test
    void testFindAccount() {
        System.out.println("testFindAccount");
        //fail("Not yet implemented");
    }

}
