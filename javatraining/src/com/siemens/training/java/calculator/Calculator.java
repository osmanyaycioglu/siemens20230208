package com.siemens.training.java.calculator;

public class Calculator {

    public static double lastResultStatic;
    private double       lastResult;

    public double getLastResult() {
        return lastResult;
    }

    public void setLastResult(double lastResultParam) {
        lastResult = lastResultParam;
    }

    public static double add(double val1,
                             double val2,
                             Calculator calculator) {
        double result = val1 + val2;
        calculator.lastResult = result;
        lastResultStatic = result;
        return result;
    }

    public static double sub(double val1,
                             double val2,
                             Calculator calculator) {
        double result = val1 - val2;
        calculator.lastResult = result;
        lastResultStatic = result;
        return result;
    }

}
