package com.siemens.training.bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String        name;
    private String        surname;
    private String        username;
    private String        password;
    private List<Account> accountList;

    public Customer(final String nameParam,
                    final String surnameParam,
                    final String usernameParam,
                    final String passwordParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.username = usernameParam;
        this.password = passwordParam;
    }

    // tlhesabi#TL#1000;xyz#DOLAR#540
    public void parseAccounts(final String stringParam) {
        if ((stringParam == null) || stringParam.isEmpty()) {
            return;
        }
        String[] splitLoc = stringParam.split(";");
        for (String accountStr : splitLoc) {
            Account accountLoc = new Account();
            try {
                accountLoc.parseAccount(accountStr);
                this.addAccount(accountLoc);
            } catch (Exception e) {
                System.err.println("Parse error while parsing : " + accountStr + " error : " + e.getMessage());
            }
        }
    }

    public void addAccount(final Account accountParam) {
        if (this.accountList == null) {
            this.accountList = new ArrayList<>();
        }
        this.accountList.add(accountParam);
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public List<Account> getAccountList() {
        return this.accountList;
    }

    public void setAccountList(final List<Account> accountListParam) {
        this.accountList = accountListParam;
    }

    @Override
    public String toString() {
        return "Customer [name="
               + this.name
               + ", surname="
               + this.surname
               + ", username="
               + this.username
               + ", password="
               + this.password
               + ", accountList="
               + this.accountList
               + "]";
    }

    public Account findAccount(final EAccountType accountTypeParam) {
        for (Account accountLoc : this.accountList) {
            if (accountLoc.getAccountType() == accountTypeParam) {
                return accountLoc;
            }
        }
        return null;
    }

}
