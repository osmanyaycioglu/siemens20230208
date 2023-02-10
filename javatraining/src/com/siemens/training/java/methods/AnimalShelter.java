package com.siemens.training.java.methods;

import java.util.ArrayList;

public class AnimalShelter {
    // yaratmanın 1.yolu
    // private ArrayList<Animal> animals = new ArrayList<>();

    private ArrayList<Animal> animals;

    public AnimalShelter() {
        // yaratmanın 2.yolu
        animals = new ArrayList<>();
    }

    public void refuge(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> findSpecies(String animalType) {
        ArrayList<Animal> tempList = new ArrayList<>();
        for (Animal item : animals) {
            if (item.getSpecies()
                    .equals(animalType)) {
                tempList.add(item);
            }
        }
        return tempList;
    }
}
