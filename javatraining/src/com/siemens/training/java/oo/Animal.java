package com.siemens.training.java.oo;

import java.io.IOException;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Animal [animalType=" + this.animalType + ", name=" + this.name + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.animalType,
                            this.name);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Animal other = (Animal) obj;
        return Objects.equals(this.animalType,
                              other.animalType)
               && Objects.equals(this.name,
                                 other.name);
    }

}
