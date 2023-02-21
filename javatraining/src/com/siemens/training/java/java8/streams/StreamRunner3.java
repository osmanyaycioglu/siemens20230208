package com.siemens.training.java.java8.streams;

import com.siemens.training.java.classdesign.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner3 {

    public static void main(final String[] args) {
        try {
            List<String> readAllLines = Files.readAllLines(Paths.get("./person.txt"));
            List<Person> collect = readAllLines
                    .stream()
                    .peek(System.out::println)
                    .map(sl -> sl.split(","))
                    .filter(sa -> sa.length == 4)
                    .peek(x -> System.out.println(Arrays.toString(x)))
                    .map(sa -> new Person(sa[0].trim(),
                                          sa[1].trim(),
                                          Integer.parseInt(sa[2].trim()),
                                          Integer.parseInt(sa[3].trim())))
                    .peek(personParam -> personParam.setBirthDate(LocalDate.now()))
                    .collect(Collectors.toList());
            Map<String, Person> collect1 = readAllLines.stream()
                                                       .map(sl -> sl.split(","))
                                                       .filter(sa -> sa.length == 4)
                                                       .map(sa -> new Person(sa[0].trim(),
                                                                             sa[1].trim(),
                                                                             Integer.parseInt(sa[2].trim()),
                                                                             Integer.parseInt(sa[3].trim())))
                                                       .collect(Collectors.toMap(p -> p.getFirstName(),
                                                                                 p -> p));

        } catch (IOException eParam) {
            eParam.printStackTrace();
        }

    }
}
