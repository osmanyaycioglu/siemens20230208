package com.siemens.training.bank;

import java.math.BigDecimal;

import com.siemens.training.bank.error.BankException;

public class Account {

    private String       accountName;
    private EAccountType accountType;
    private BigDecimal   balance;

    public Account() {
    }

    public Account(final String accountNameParam,
                   final EAccountType accountTypeParam,
                   final BigDecimal balanceParam) {
        super();
        this.accountName = accountNameParam;
        this.accountType = accountTypeParam;
        this.balance = balanceParam;
    }

    public void deposit(final BigDecimal depositAmountParam) {
        this.balance = this.balance.add(depositAmountParam);
    }

    public void withdraw(final BigDecimal depositAmountParam) {
        this.balance = this.balance.add(depositAmountParam);
    }

    // xyz#DOLAR#540
    public void parseAccount(final String accStringParam) throws BankException {
        if (accStringParam == null) {
            throw new BankException("Error while parsing account");
        }
        String[] splitLoc = accStringParam.split("#");
        if (splitLoc.length != 3) {
            throw new BankException("Wrong size of parts : " + accStringParam);
        }
        this.accountName = splitLoc[0];
        this.accountType = EAccountType.valueOf(splitLoc[1]);
        this.balance = new BigDecimal(Double.parseDouble(splitLoc[2]));
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(final String accountNameParam) {
        this.accountName = accountNameParam;
    }

    public EAccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(final EAccountType accountTypeParam) {
        this.accountType = accountTypeParam;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(final BigDecimal balanceParam) {
        this.balance = balanceParam;
    }

    @Override
    public String toString() {
        return "Account [accountName="
               + this.accountName
               + ", accountType="
               + this.accountType
               + ", balance="
               + this.balance
               + "]";
    }

}
