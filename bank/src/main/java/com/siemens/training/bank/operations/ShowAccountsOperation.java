package com.siemens.training.bank.operations;

import java.util.List;
import java.util.Scanner;

import com.siemens.training.bank.Account;
import com.siemens.training.bank.Customer;

public class ShowAccountsOperation extends Operation {

    public ShowAccountsOperation() {
        super("Hesapları göster",
              "Bütün hesaplarınızı gösterir");
    }

    @Override
    public void execute(final Scanner scannerParam,
                        final Customer customerParam) {
        List<Account> accountListLoc = customerParam.getAccountList();
        for (Account accountLoc : accountListLoc) {
            System.out.println(accountLoc);
        }
    }

}
