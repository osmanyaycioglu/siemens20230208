package com.siemens.training.java.army.oo;

public class OOSoldierRunner {

    public static void main(final String[] args) {
        ISoldier soldierLoc = new BadSoldier();
        if (soldierLoc.shoot(200)) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }
    }
}
