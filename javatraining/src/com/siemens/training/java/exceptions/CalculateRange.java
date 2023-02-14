package com.siemens.training.java.exceptions;

public class CalculateRange {

    private int maxGas;

    public CalculateRange(int maxGasParam) {
        super();
        maxGas = maxGasParam;
    }

    public int calculate(Integer speed) throws Exception {
        MyOtherCalculate calculateLoc = new MyOtherCalculate();
        Integer calculateAgainLoc = calculateLoc.calculateAgain(speed,
                                                                maxGas);
        return calculateAgainLoc * 10;
    }

}
