package com.siemens.training.java.operations;

import com.siemens.training.java.pkg.Car;

public class LoopOperations {

    public static void main(String[] args) {
        int index = 10;
        int abc = 0;
        Car carLoc = new Car(200,
                             130,
                             123);
        while (index > 0) {
            abc = index - 10;
            Car anotherRef = carLoc;
            System.out.println("While loop Index : " + index);
            index--;
        }

        index = 10;
        do {
            System.out.println("Do While loop Index : " + index);
            index--;
        } while (index > 0);

        for (int iLoc = 0; iLoc < 10; iLoc++) {
            System.out.println("for 1 loop Index : " + iLoc);
        }

        index = 10;
        for (; index > 0; index--) {
            System.out.println("for 2 loop Index : " + index);
        }

        for (int iLoc = 0; iLoc < 20; iLoc++) {
            if (iLoc > 12) {
                continue;
            }
            System.out.println("for 3 loop Index : " + iLoc);
        }

        for (int iLoc = 0; iLoc < 20; iLoc++) {
            if (iLoc > 8) {
                break;
            }
            System.out.println("for 5 loop Index : " + iLoc);
        }

        index = 0;
        loop1:
        for (;;) {
            loop2:
            for (;;) {
                loop3:
                for (;;) {
                    if (index % 5 == 0) {
                        System.out.println("for 4 loop Index : " + index);
                    }
                    index++;
                    if (index > 30) {
                        break loop1;
                    }
                    if (index > 20) {
                        break loop2;
                    }
                    if (index > 10) {
                        break loop3;
                    }
                    if (index < 5) {
                        continue loop1;
                    }
                }
                System.out.println("loop3 bitti");
            }
            System.out.println("loop2 bitti");
        }
        System.out.println("loop1 bitti");

    }

}
