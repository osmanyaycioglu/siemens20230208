package com.siemens.training.java.methods;

import java.util.ArrayList;

public class AnimalRun {

    public static void main(String[] args) {
        AnimalShelter animalShelterLoc = new AnimalShelter();

        ArrayList<Animal> benimListem = new ArrayList<>();

        Animal animal1 = new Animal("Bobo",
                                    "yilmaz",
                                    5,
                                    "MALE",
                                    "DOG");
        benimListem.add(animal1);
        benimListem.add(new Animal("Kara",
                                   "Baş",
                                   7,
                                   "MALE",
                                   "DOG"));
        benimListem.add(new Animal("Maviş",
                                   "",
                                   7,
                                   "FEMALE",
                                   "CAT"));

        for (Animal item : benimListem) {
            if (item.getSpecies()
                    .equals("DOG")) {
                System.out.println(animal1);
            }
        }

        for (int iLoc = 0; iLoc < benimListem.size(); iLoc++) {
            Animal animalLoc = benimListem.get(iLoc);
            if (animalLoc.getSpecies()
                         .equals("DOG")) {
                System.out.println(animal1);
            }
        }

        //        Animal animal2 = new Animal();
        //
        //        Animal animal3 = new Animal();

    }
}
