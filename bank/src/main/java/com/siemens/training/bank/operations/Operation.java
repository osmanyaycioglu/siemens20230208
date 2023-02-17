package com.siemens.training.bank.operations;

import java.math.BigDecimal;
import java.util.Scanner;

import com.siemens.training.bank.Account;
import com.siemens.training.bank.Customer;
import com.siemens.training.bank.EAccountType;

public abstract class Operation implements IExecuteOperation {

    protected String operationName;
    protected String operationDesc;

    public Operation(final String operationNameParam,
                     final String operationDescParam) {
        super();
        this.operationName = operationNameParam;
        this.operationDesc = operationDescParam;
    }

    @Override
    public String getOperationName() {
        return this.operationName;
    }

    @Override
    public String getOperationDesc() {
        return this.operationDesc;
    }

    protected Account createAccount(final Scanner scannerParam,
                                    final Customer customerParam,
                                    final EAccountType accountTypeParam) {
        System.out.println(accountTypeParam + " için hesap ismi giriniz : ");
        String accountName = scannerParam.next();

        Account newAccountLoc = new Account(accountName,
                                            accountTypeParam,
                                            BigDecimal.ZERO);
        customerParam.addAccount(newAccountLoc);
        return newAccountLoc;
    }

}
