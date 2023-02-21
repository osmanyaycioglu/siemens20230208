package com.siemens.training.java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.siemens.training.java.classdesign.Person;

public class StreamRunner2 {

    public static void main(final String[] args) {

        List<String> listLoc = Arrays.asList("osman",
                                             "ali",
                                             "osman",
                                             "veli",
                                             "fatma",
                                             "mehmet",
                                             "neslihan",
                                             "nil",
                                             "fatma",
                                             "veli");
        List<Integer> collectLoc = listLoc.stream()
                                          .distinct()
                                          .map(s -> new Person(s,
                                                               null,
                                                               0,
                                                               0))
                                          .filter(p -> p.getFirstName()
                                                        .length() > 4)
                                          .map(p -> p.getFirstName()
                                                     .length())
                                          .filter(i -> i > 5)
                                          .collect(Collectors.toList());

    }
}
