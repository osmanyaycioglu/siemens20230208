package com.siemens.training.bank.operations;

import com.siemens.training.bank.EAccountType;

public class USDWithdrawOperation extends WithdrawOperation {

    public USDWithdrawOperation() {
        super("Dolar para çekme",
              "Dolar hesabından para çekme işlemi",
              EAccountType.DOLAR);
    }

}
