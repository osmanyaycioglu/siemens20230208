package com.siemens.training.java.classdesign;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PersonRunner {

    private static final int LINE_PART_COUNT = 4;

    public static void main(String[] args) {
        PersonList personListLoc = new PersonList();
        for (int iLoc = 0; iLoc < args.length; iLoc++) {
            Path pathLoc = Paths.get(args[iLoc]);
            try {
                List<String> readAllLinesLoc = Files.readAllLines(pathLoc,
                                                                  Charset.forName("UTF-8"));
                System.out.println("File okundu");
                for (String line : readAllLinesLoc) {
                    String[] splitLoc = line.split(",");
                    if (splitLoc.length == LINE_PART_COUNT) {
                        Person personLoc = new Person(splitLoc[0].trim(),
                                                      splitLoc[1].trim(),
                                                      StringUtils.convertToInt(splitLoc[2]),
                                                      StringUtils.convertToInt(splitLoc[3]));
                        personListLoc.addPerson(personLoc);
                    }
                }

            } catch (Exception eLoc) {
                System.err.println("Error oluştu");
            }
        }
        System.out.println(personListLoc);
    }

}
