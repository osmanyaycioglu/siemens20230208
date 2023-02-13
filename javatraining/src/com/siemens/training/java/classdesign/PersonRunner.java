package com.siemens.training.java.classdesign;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) throws Exception {
        Path pathLoc = Paths.get("./person.txt");
        List<String> readAllLinesLoc = Files.readAllLines(pathLoc,
                                                          Charset.forName("UTF-8"));
        PersonList personListLoc = new PersonList();
        for (String line : readAllLinesLoc) {
            String[] splitLoc = line.split(",");
            if (splitLoc.length == 4) {
                Person personLoc = new Person();
                personLoc.setFirstName(splitLoc[0].trim());
                personLoc.setLastName(splitLoc[1].trim());
                personLoc.setHeight(Integer.parseInt(splitLoc[2].trim()));
                personLoc.setWeight(Integer.parseInt(splitLoc[3].trim()));
                personListLoc.addPerson(personLoc);
            }
        }
        System.out.println(personListLoc);
    }
}
