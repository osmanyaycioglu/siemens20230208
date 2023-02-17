package com.siemens.training.calori.calculator;

public class Running implements ISport {

    @Override
    public double caloriBurn(final int durationParam,
                             final IHuman humanParam) {
        double bmiLoc = humanParam.getBMI();
        return ((durationParam * bmiLoc) / 10) * 1.2D;
    }

}
