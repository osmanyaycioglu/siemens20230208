package com.siemens.training.bank.operations;

import java.math.BigDecimal;
import java.util.Scanner;

import com.siemens.training.bank.Account;
import com.siemens.training.bank.Customer;
import com.siemens.training.bank.EAccountType;

public abstract class WithdrawOperation extends Operation {

    private final EAccountType accountType;

    public WithdrawOperation(final String operationNameParam,
                             final String operationDescParam,
                             final EAccountType accountTypeParam) {
        super(operationNameParam,
              operationDescParam);
        this.accountType = accountTypeParam;
    }

    @Override
    public void execute(final Scanner scannerParam,
                        final Customer customerParam) {
        Account accountLoc = customerParam.findAccount(this.accountType);
        if (accountLoc == null) {
            accountLoc = this.createAccount(scannerParam,
                                            customerParam,
                                            this.accountType);
        }
        System.out.println("Çekeceğiniz " + this.accountType + " miktarını girin : ");
        BigDecimal withdrawAmountLoc = scannerParam.nextBigDecimal();
        accountLoc.withdraw(withdrawAmountLoc);
    }

}
