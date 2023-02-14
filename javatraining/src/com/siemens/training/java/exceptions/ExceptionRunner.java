package com.siemens.training.java.exceptions;

import java.io.IOException;
import java.util.zip.DataFormatException;

public class ExceptionRunner {

    public static void main(String[] args) {
        CalculateRange calculateRangeLoc = new CalculateRange(50);
        try {
            int calculateLoc = calculateRangeLoc.calculate(100);
            System.out.println(calculateLoc);
        } catch (IOException eLoc) {
            System.out.println("IOException : " + eLoc.getMessage());
        } catch (DataFormatException eLoc) {
            System.out.println("DataFormatException : " + eLoc.getMessage());
        } catch (Exception eLoc) {
            System.out.println("Error oluştu : " + eLoc.getMessage());
            // eLoc.printStackTrace();
        }
    }
}
