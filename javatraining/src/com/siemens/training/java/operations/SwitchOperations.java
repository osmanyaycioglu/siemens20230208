package com.siemens.training.java.operations;

import java.util.Scanner;

public class SwitchOperations {

    public static final int TOPLAMA_INDEXI = 1;
    public static final int CIKARMA_INDEXI = 2;
    public static final int BOLME_INDEXI   = 3;
    public static final int LOG_INDEXI     = 4;
    public static final int CARPMA_INDEXI  = 5;
    public static final int TEST_INDEXI    = 6;

    public static final int CALISMA_LIMITI = 20;
    public static final int ALT_SINIR      = 10;

    public static void main(String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        System.out.println("Seçiminiz : ");

        Integer nextIntLoc = scannerLoc.nextInt();
        loop:
        for (int iLoc = 0; iLoc < CALISMA_LIMITI; iLoc++) {
            int ortakVar = ALT_SINIR;
            switch (nextIntLoc) {
                case TOPLAMA_INDEXI: {
                    Integer b = CALISMA_LIMITI;
                    System.out.println("1 seçildi");
                    break loop;
                }
                case CIKARMA_INDEXI:
                    System.out.println("2 seçildi");
                    break;
                case BOLME_INDEXI:
                    System.out.println("3 seçildi");
                    break;
                case CARPMA_INDEXI:
                case LOG_INDEXI:
                case TEST_INDEXI: {
                    Integer b = CALISMA_LIMITI;
                    System.out.println("4 seçildi");
                    break;
                }
                default:
                    System.out.println("diğer seçildi");
                    break;
            }
            break;
        }

        //        if (nextIntLoc == 1) {
        //            System.out.println("1 seçildi");
        //        } else if (nextIntLoc == 2) {
        //            System.out.println("2 seçildi");
        //        } else if (nextIntLoc == 3) {
        //            System.out.println("3 seçildi");
        //        } else if (nextIntLoc == 4) {
        //            System.out.println("4 seçildi");
        //        } else {
        //            System.out.println("diğer seçildi");
        //        }
    }
}
