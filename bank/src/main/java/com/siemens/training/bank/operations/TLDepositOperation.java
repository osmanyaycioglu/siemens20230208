package com.siemens.training.bank.operations;

import com.siemens.training.bank.EAccountType;

public class TLDepositOperation extends DepositOperation {

    public TLDepositOperation() {
        super("TL para yatırma",
              "TL hesabınızdan para yatırma işlemi",
              EAccountType.TL);
    }

}
