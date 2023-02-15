package com.siemens.training.java.oo;

public class Animal {

    protected String animalType;
    protected String name;

    public Animal(String animalTypeParam,
                  String nameParam) {
        animalType = animalTypeParam;
        name = nameParam;
    }

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
