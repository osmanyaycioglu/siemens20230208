package com.siemens.training.java.oo;

public class Bulldog extends Dog {

    public Bulldog(String dogNameParam) {
        super(dogNameParam);
    }

    private String animalType;

    public String voice() {
        animalType = "bulldog";
        return "rrrr hhhhhaaaaaaaavvvv";
    }

    public void bite() {
        System.out.println("Isırıyorum");
    }
}
