package com.siemens.training.bank;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CustomerReader {

    // osman,yaycioglu,osmany,123456,tlhesabi#TL#1000;xyz#DOLAR#540
    public List<Customer> readCustomers(final String filenameParam) {
        try {
            List<String> readAllLinesLoc = Files.readAllLines(Paths.get(filenameParam),
                                                              Charset.forName("UTF-8"));
            for (String lineLoc : readAllLinesLoc) {
                String[] splitLoc = lineLoc.split(",");
                if (splitLoc.length != 5) {
                    continue;
                }
                Customer customerLoc = new Customer(splitLoc[0],
                                                    splitLoc[1],
                                                    splitLoc[2],
                                                    splitLoc[3]);
                customerLoc.parseAccounts(splitLoc[4]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
