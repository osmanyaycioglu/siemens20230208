package com.siemens.training.calori.calculator;

public class Pasta extends Food {

    public Pasta() {
        super(1,
              80,
              19);
    }

    @Override
    public String getFoodName() {
        return "Pasta";
    }

}
