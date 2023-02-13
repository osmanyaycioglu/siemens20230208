package com.siemens.training.java.types;

public class StringBuilderType {

    public static void main(String[] args) {
        int a = 100;
        StringBuilder stringBuilderLoc = new StringBuilder(1000);
        stringBuilderLoc.append("osman yaycıoğlu");
        stringBuilderLoc.append(a);
        stringBuilderLoc.append(" ")
                        .append("test")
                        .append(a)
                        .append(" ");
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            stringBuilderLoc.append(" index")
                            .append(iLoc);
        }
        String stringLoc = stringBuilderLoc.toString();
        System.out.println(stringLoc);
    }
}
