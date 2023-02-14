package com.siemens.training.java.oo;

public class AniamalRunner {

    public static void main(String[] args) {
        Animal animal = new Animal();
        String voiceLoc = animal.voice();
        System.out.println(voiceLoc);
        System.out.println("animal type : " + animal.getAnimalType());

        Dog dog = new Dog();
        String voice2Loc = dog.voice();
        System.out.println("Dog voice : " + voice2Loc);
        int eatLoc = dog.eat(100);
        System.out.println("Dog gained : " + eatLoc);
        dog.sit();
        System.out.println("animal type : " + dog.getAnimalType());

        Bulldog bulldogLoc = new Bulldog();
        System.out.println(bulldogLoc.voice());
        bulldogLoc.setAnimalType("deneme");
        System.out.println("animal type : " + bulldogLoc.getAnimalType());

    }
}
