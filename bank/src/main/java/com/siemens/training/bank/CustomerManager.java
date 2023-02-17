package com.siemens.training.bank;

import java.util.HashMap;
import java.util.Map;

import com.siemens.training.bank.error.BankException;

public class CustomerManager {

    private final Map<String, Customer> customerMap = new HashMap<>();

    public void addCustomer(final Customer customerParam) throws BankException {
        if (this.customerMap.containsKey(customerParam.getUsername())) {
            throw new BankException("Böyle bir username var");
        }
        this.customerMap.put(customerParam.getUsername(),
                             customerParam);
    }

    public Customer login(final String username,
                          final String password) throws BankException {
        Customer customerLoc = this.customerMap.get(username);
        if (customerLoc == null) {
            throw new BankException("username,password yanlış");
        }
        if (!customerLoc.getPassword()
                        .equals(password)) {
            throw new BankException("username,password yanlış");
        }
        return customerLoc;
    }
}
