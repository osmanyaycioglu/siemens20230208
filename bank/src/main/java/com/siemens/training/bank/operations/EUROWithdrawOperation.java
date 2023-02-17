package com.siemens.training.bank.operations;

import com.siemens.training.bank.EAccountType;

public class EUROWithdrawOperation extends WithdrawOperation {

    public EUROWithdrawOperation() {
        super("Euro para çekme",
              "Euro hesabından para çekme işlemi",
              EAccountType.EURO);
    }

}
