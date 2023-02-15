package com.siemens.training.java.oo;

import com.siemens.training.java.pkg.Car;

public class AniamalRunner {

    public static void main(String[] args) {
        //        Animal animal = new Animal("kuş",
        //                                   "cick");
        //        animal.hashCode();
        //        String voiceLoc = animal.voice();
        //        System.out.println(voiceLoc);
        //        System.out.println("animal type : " + animal.getAnimalType());
        //
        //        Dog dog = new Dog("kestane");
        //        String voice2Loc = dog.voice();
        //        System.out.println("Dog voice : " + voice2Loc);
        //        int eatLoc = dog.eat(100);
        //        System.out.println("Dog gained : " + eatLoc);
        //        dog.sit();
        //        System.out.println("animal type : " + dog.getAnimalType());
        //
        //        Animal bulldogLoc = new Bulldog("kara");
        //        System.out.println(bulldogLoc.voice());
        //        bulldogLoc.setAnimalType("deneme");
        //        System.out.println("animal type : " + bulldogLoc.getAnimalType());

        Bulldog bulldogLoc = new Bulldog("kara");
        doAllAnimalActions(bulldogLoc,
                           50);
        Kangroo kangrooLoc = new Kangroo("zıpzıp");
        doAllAnimalActions(kangrooLoc,
                           20);

        Car carLoc = new Car(100,
                             100,
                             20);
        doAllObjectActions(carLoc);
        doAllObjectActions(kangrooLoc);
        doAllObjectActions(bulldogLoc);

    }

    public static void doAllAnimalActions(Animal animalParam,
                                          int eatAmount) {
        System.out.println("Kalori : " + animalParam.eat(eatAmount));
        System.out.println("ses : " + animalParam.voice());
    }

    private static void doAllObjectActions(Object objectParam) {
        System.out.println("Hashcode : " + objectParam.hashCode() + " ToString : " + objectParam.toString());
        if (objectParam instanceof Animal) {
            Animal animalParam = (Animal) objectParam;
            System.out.println("Kalori : " + animalParam.eat(100));
            System.out.println("ses : " + animalParam.voice());
        } else if (objectParam instanceof Car) {
            Car carLoc = (Car) objectParam;
            System.out.println("Car : " + carLoc.effectiveness());
        }
    }
}
