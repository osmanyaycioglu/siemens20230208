package com.siemens.training.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {

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
        Map<String, Integer> mapLoc = new HashMap<>();
        mapLoc.values()
              .stream()
              .distinct()
              .sorted()
              .filter(i -> i > 10)
              .forEach(i -> System.out.println("Gelen : " + i));
        mapLoc.keySet()
              .stream()
              .sorted()
              .filter(s -> s.contains("e"))
              .forEach(s -> System.out.println(s));

        List<String> collectLoc = listLoc.stream()
                                         .distinct()
                                         .filter(s -> s.length() > 3)
                                         .filter(s -> s.contains("a"))
                                         .collect(Collectors.toList());
        Stream<String> streamLoc = listLoc.stream();
        streamLoc.distinct()
                 .forEach(s -> System.out.println(s));

        long countLoc = listLoc.stream()
                               .sorted()
                               .distinct()
                               .count();
        System.out.println(collectLoc);

        System.out.println("----------------");
        List<String> resultList = new ArrayList<>();
        Set<String> setLoc = new TreeSet<>();
        setLoc.addAll(listLoc);
        for (String stringLoc : setLoc) {
            if (stringLoc.length() > 3) {
                resultList.add(stringLoc);
            }
        }
        System.out.println(resultList);

        //        try {
        //            File fileLoc = new File("./customer.txt");
        //            FileInputStream fileInputStreamLoc = new FileInputStream(fileLoc);
        //            byte[] bytes = new byte[100];
        //
        //            int readLoc = fileInputStreamLoc.read(bytes);
        //        } catch (Exception eLoc) {
        //            eLoc.printStackTrace();
        //        }
    }
}
