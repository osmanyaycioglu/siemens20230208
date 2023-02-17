package com.siemens.training.bank.operations;

import com.siemens.training.bank.EAccountType;

public class TLWithdrawOperation extends WithdrawOperation {

    public TLWithdrawOperation() {
        super("TL para çekme",
              "TL hesabından para çekme işlemi",
              EAccountType.TL);
    }

}
