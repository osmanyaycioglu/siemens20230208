package com.siemens.training.java.types;

public class StringType {

    public static void main(String[] args) {
        String str = "osman,ali";
        String[] splitLoc = str.split(",");
        String concatLoc = str.concat(",veli")
                              .concat(",deneme")
                              .concat(",ayşe");
        System.out.println(concatLoc);
        String substringLoc = str.substring(3,
                                            5);
        System.out.println(substringLoc);
        char charAtLoc = str.charAt(3);
        char[] charArrayLoc = str.toCharArray();
        boolean containsLoc = str.contains("ali");
        boolean equalsLoc = str.equals("Osman,ali");
        boolean equalsIgnoreCaseLoc = str.equalsIgnoreCase("OSMAN,ALİ");
        System.out.println("EQUALS : " + equalsIgnoreCaseLoc + " without ignore case : " + equalsLoc);
        boolean startsWithLoc = str.startsWith("osman");
        boolean endsWithLoc = str.endsWith("ali");

        String lowerCaseLoc = str.toLowerCase();
        String upperCaseLoc = str.toUpperCase();
        System.out.println(upperCaseLoc);

        int indexOfLoc = str.indexOf("n,a");
        int indexOfLoc2 = str.indexOf("n,a",
                                      5);

        String replaceLoc = str.replace("ali",
                                        "veli");
        System.out.println("Replaced string : " + replaceLoc);

        String strEmpty = "";
        boolean emptyLoc = strEmpty.isEmpty();

        int lengthLoc = str.length();
        boolean matchesLoc = str.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");

        String stringLoc = " osman yaycıoğlu  ";
        String trimLoc = stringLoc.trim();
        System.out.println(trimLoc);

    }
}
