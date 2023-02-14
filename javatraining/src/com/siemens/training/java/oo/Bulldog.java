package com.siemens.training.java.oo;

public class Bulldog extends Dog {

    private String animalType;

    @Override
    public String voice() {
        animalType = "bulldog";
        return "rrrr hhhhhaaaaaaaavvvv";
    }
}
