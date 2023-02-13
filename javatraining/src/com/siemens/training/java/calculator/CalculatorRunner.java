package com.siemens.training.java.calculator;

public class CalculatorRunner {

    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        double addResult = Calculator.add(10,
                                          20,
                                          cal1);
        addResult = Calculator.sub(addResult,
                                   15,
                                   cal2);
        addResult = Calculator.sub(100,
                                   15,
                                   cal2);
        addResult = Calculator.add(100,
                                   25,
                                   cal1);

        System.out.println("Result 1 : " + cal1.getLastResult());
        System.out.println("Result 2 : " + cal2.getLastResult());
        System.out.println("Result static 1 : " + cal1.lastResultStatic);
        System.out.println("Result static 2 : " + cal2.lastResultStatic);
        System.out.println("Result static : " + Calculator.lastResultStatic);

    }
}
