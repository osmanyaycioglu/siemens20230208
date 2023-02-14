package com.siemens.training.java.exceptions;

public class MyOtherCalculate {

    public Integer calculateAgain(Integer speed,
                                  Integer gasAmount) throws Exception {
        Integer integerLoc = MyFinalCalculate.calculateOnceMore(speed,
                                                                40,
                                                                null);
        return integerLoc;
    }

}
