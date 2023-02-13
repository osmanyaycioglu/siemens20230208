package com.siemens.training.java.classdesign;

public class StaticsRunner {

    public static void main(String[] args) {
        StaticMethods.calculateStatic("osman");

        int parseIntLoc = Integer.parseInt("100");

        Integer int1 = 100;
        int1.intValue();
        int1.parseInt("120");
    }

}
