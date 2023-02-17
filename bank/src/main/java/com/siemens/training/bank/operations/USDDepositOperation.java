package com.siemens.training.bank.operations;

import com.siemens.training.bank.EAccountType;

public class USDDepositOperation extends DepositOperation {

    public USDDepositOperation() {
        super("Dolar para yatırma",
              "DOLAR hesabınızdan para yatırma işlemi",
              EAccountType.DOLAR);
    }

}
