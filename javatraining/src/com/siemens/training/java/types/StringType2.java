package com.siemens.training.java.types;

public class StringType2 {

    public static void main(String[] args) {
        int a = 100;
        String otherStringLoc = "deneme";
        // Doğru
        String str = "osman,ali " + a + " " + otherStringLoc;
        // Yanlış
        str = str + " test";
        // Yanlış
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            str += " index" + iLoc;
        }
        System.out.println(str);
    }
}
