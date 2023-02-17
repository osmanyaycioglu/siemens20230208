package com.siemens.training.bank;

import java.util.Scanner;

import com.siemens.training.bank.error.BankException;

public class BankRunner {

    public static void main(final String[] args) {
        BankOperationManager bankOperationManagerLoc = new BankOperationManager();
        CustomerManager customerManagerLoc = new CustomerManager();
        customerManagerLoc.fillCustomers();
        customerManagerLoc.writeCustomersToConsole();
        try (Scanner scannerLoc = new Scanner(System.in);) {
            System.out.println("username : ");
            String username = scannerLoc.nextLine();
            System.out.println("password : ");
            String password = scannerLoc.nextLine();
            Customer loginLoc = null;
            try {
                loginLoc = customerManagerLoc.login(username,
                                                    password);
            } catch (BankException eLoc) {
                System.err.println("Login problemi : " + eLoc.getMessage());
            }
            if (loginLoc != null) {
                while (true) {
                    bankOperationManagerLoc.showMenu();
                    System.out.println("seçiminiz : ");
                    int index = scannerLoc.nextInt();
                    bankOperationManagerLoc.executeOperation(index,
                                                             loginLoc,
                                                             scannerLoc);
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        //        Scanner scannerLoc = null;
        //        try {
        //            scannerLoc = new Scanner(System.in);
        //            // ... Exception
        //            return;
        //        } catch (Exception eLoc) {
        //            // TODO: handle exception
        //        } finally {
        //            if (scannerLoc != null) {
        //                scannerLoc.close();
        //            }
        //        }

    }
}
