package com.siemens.training.java.army;

public class SoldierRunner {

    public static void main(final String[] args) {
        Soldier ozgur = new Soldier(ESoldierType.NORMAL);
        if (ozgur.shoot(200)) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
        if (ozgur.duck(100)) {
            System.out.println("vuruldum");
        } else {
            System.out.println("kaçtım");
        }
    }
}
