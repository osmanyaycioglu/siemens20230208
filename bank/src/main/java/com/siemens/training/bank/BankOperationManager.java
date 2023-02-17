package com.siemens.training.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.siemens.training.bank.operations.EURODepositOperation;
import com.siemens.training.bank.operations.EUROWithdrawOperation;
import com.siemens.training.bank.operations.IExecuteOperation;
import com.siemens.training.bank.operations.ShowAccountsOperation;
import com.siemens.training.bank.operations.TLDepositOperation;
import com.siemens.training.bank.operations.TLWithdrawOperation;
import com.siemens.training.bank.operations.USDDepositOperation;
import com.siemens.training.bank.operations.USDWithdrawOperation;

public class BankOperationManager {

    private final List<IExecuteOperation> operations = new ArrayList<>();

    public BankOperationManager() {
        this.operations.add(new TLDepositOperation());
        this.operations.add(new TLWithdrawOperation());
        this.operations.add(new USDDepositOperation());
        this.operations.add(new USDWithdrawOperation());
        this.operations.add(new EURODepositOperation());
        this.operations.add(new EUROWithdrawOperation());
        this.operations.add(new ShowAccountsOperation());
    }

    public void showMenu() {
        int index = 1;
        for (IExecuteOperation iExecuteOperationLoc : this.operations) {
            System.out.println(index + "-" + iExecuteOperationLoc.getOperationName());
            index++;
        }
    }

    public void executeOperation(final int index,
                                 final Customer customer,
                                 final Scanner scannerParam) {
        IExecuteOperation iExecuteOperationLoc = this.operations.get(index - 1);
        iExecuteOperationLoc.execute(scannerParam,
                                     customer);
    }
}
