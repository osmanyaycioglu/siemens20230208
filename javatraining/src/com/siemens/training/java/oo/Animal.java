package com.siemens.training.java.oo;

public class Animal {

    protected String animalType;

    public String voice() {
        return "Ses çıkarıyorum";
    }

    public int eat(int amount) {
        return amount * 500;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalTypeParam) {
        animalType = animalTypeParam;
    }

}
