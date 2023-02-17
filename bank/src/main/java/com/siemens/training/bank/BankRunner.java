package com.siemens.training.bank;

public class BankRunner {

    public static void main(final String[] args) {
        CustomerManager customerManagerLoc = new CustomerManager();
        customerManagerLoc.fillCustomers();
        customerManagerLoc.writeCustomersToConsole();
    }
}
