package com.siemens.training.bank.operations;

import com.siemens.training.bank.EAccountType;

public class EURODepositOperation extends DepositOperation {

    public EURODepositOperation() {
        super("Euro para yatırma",
              "Euro hesabınızdan para yatırma işlemi",
              EAccountType.EURO);
    }

}
