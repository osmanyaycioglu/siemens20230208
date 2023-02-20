package com.siemens.training.java.operations;

import com.siemens.training.java.oo.Animal;

public class EqualsOperations {

    public static void main(final String[] args) {
        int int1 = 100;
        int int2 = 100;
        if (int1 == int2) {
            System.out.println("İki int eşit");
        }
        Animal animalLoc = new Animal("kirpi",
                                      "kirkir");
        System.out.println("sonuç : " + animalLoc);
        Animal anotherAnimalLoc = new Animal("kirpi",
                                             "kirkir");
        if (animalLoc.equals(anotherAnimalLoc)) {
            System.out.println("bunlar eşit");
        }

    }
}
