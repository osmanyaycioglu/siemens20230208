package com.siemens.training.bank;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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

    public void fillCustomers() {
        CustomerReader customerReaderLoc = new CustomerReader();
        List<Customer> readCustomersLoc = customerReaderLoc.readCustomers("./customer.txt");
        for (Customer customerLoc : readCustomersLoc) {
            try {
                this.addCustomer(customerLoc);
            } catch (Exception e) {
                System.err.println("Error while adding customer : " + e.getMessage());
            }
        }
    }

    public void writeCustomersToConsole() {
        Collection<Customer> valuesLoc = this.customerMap.values();
        for (Customer customerLoc : valuesLoc) {
            System.out.println(customerLoc);
        }
    }
}
