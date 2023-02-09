package com.siemens.training.java.types;

import com.siemens.training.java.pkg.Car;

public class ArrayType {

    public static void main(String[] args) {
        int int1 = 10;
        int int2 = 11;
        int int3 = 12;
        int int4 = 13;
        int int5 = 14;
        int int6 = 15;
        int int7 = 16;
        int int8 = 17;

        int[] intVals = new int[8];

        intVals[0] = 10;
        intVals[1] = 11;
        intVals[2] = 12;
        intVals[3] = 13;
        intVals[4] = 14;
        intVals[5] = 15;
        intVals[6] = 16;
        intVals[7] = 17;

        int[] intValsNew = new int[12];
        for (int iLoc = 0; iLoc < intVals.length; iLoc++) {
            intValsNew[iLoc] = intVals[iLoc];
        }
        intVals = intValsNew;
        intVals[8] = 18;
        intVals[9] = 19;

        int[] intVals2 = new int[24];
        System.arraycopy(intVals,
                         0,
                         intVals2,
                         0,
                         intVals.length);
        intVals = intVals2;
        intVals[23] = 462347;

        System.out.println("3. eleman : " + intVals[2]);

        Car[] carLoc = new Car[10];
        carLoc[0] = new Car(100,
                            100,
                            10);
        carLoc[1] = new Car(101,
                            200,
                            11);
        carLoc[2] = new Car(102,
                            300,
                            12);
        carLoc[3] = new Car(103,
                            400,
                            13);
        carLoc[4] = new Car(104,
                            500,
                            14);
        carLoc[5] = new Car(105,
                            600,
                            15);
        carLoc[6] = new Car(106,
                            700,
                            16);
        carLoc[7] = new Car(107,
                            800,
                            17);

        Integer integerLoc = new Integer(10);

        Integer[] iVals = new Integer[10];
        iVals[0] = 10;
        iVals[1] = 11;
        iVals[2] = 12;
        iVals[3] = 13;
        iVals[4] = 14;
        iVals[5] = 15;
        iVals[6] = 16;
        iVals[7] = 17;
        iVals[8] = 18;
        iVals[9] = 19;

    }
}
