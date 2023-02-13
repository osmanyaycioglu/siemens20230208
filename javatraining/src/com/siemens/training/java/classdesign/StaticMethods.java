package com.siemens.training.java.classdesign;

public class StaticMethods {

    private int    myValue;
    private String myStr;

    public String calculate(String str) {
        return "Toplam string uzunuluğu : " + (str.length() + myStr.length());
    }

    public static String calculateStatic(String str) {
        return "Toplam string uzunuluğu : " + (str.length());
    }

    public static void main(String[] args) {
        //        StaticMethods staticMethodsLoc = new StaticMethods();
        //        staticMethodsLoc.calculate("osman");
        calculateStatic("osman");
    }
}
