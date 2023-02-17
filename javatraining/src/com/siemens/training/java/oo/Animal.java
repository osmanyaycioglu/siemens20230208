package com.siemens.training.java.oo;

import java.io.IOException;

public class Animal implements IAnimal {

    protected String animalType;
    protected String name;

    public Animal(final String animalTypeParam,
                  final String nameParam) {
        this.animalType = animalTypeParam;
        this.name = nameParam;
    }

    @Override
    public String voice() {
        return "Ses çıkarıyorum";
    }

    @Override
    public int eat(final int amount) {
        return amount * 500;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public void setAnimalType(final String animalTypeParam) {
        this.animalType = animalTypeParam;
    }

    @Override
    public String move(final int xyz) {
        return "Yürüyorum : " + xyz;
    }

    @Override
    public String sleep(final int abc) {
        return "uyuyorum : " + abc;
    }

    @Override
    public void close() throws IOException {
        System.out.println("closing animal");
    }

}
