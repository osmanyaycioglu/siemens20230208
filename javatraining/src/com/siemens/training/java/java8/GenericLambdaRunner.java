package com.siemens.training.java.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.siemens.training.java.classdesign.Person;

public class GenericLambdaRunner {

    public static void main(final String[] args) {

        IProcess<String, Person, Person> processTLoc = (a,
                                                        b) -> a.getFirstName() + " " + b.getLastName();

        String process4Loc = processTLoc.process(new Person("osman",
                                                            "yay",
                                                            200,
                                                            90),
                                                 new Person("ali",
                                                            "alaz",
                                                            200,
                                                            90));
        System.out.println(process4Loc);

        IProcess<String, Person, Person> processTLoc2 = (a,
                                                         b) -> a + " ------ " + b;

        String process5Loc = processTLoc2.process(new Person("osman",
                                                             "yay",
                                                             200,
                                                             90),
                                                  new Person("ali",
                                                             "alaz",
                                                             200,
                                                             90));
        System.out.println(process5Loc);
        IProcess<String, String, String> processLoc = (a,
                                                       b) -> a + " " + b;

        IProcess<Integer, Double, String> process2Loc = (z,
                                                         w) -> z.intValue() + Integer.parseInt(w);

        Integer intVal = process2Loc.process(103.66,
                                             "1033");
        IProcess<Double, String, String> process3Loc = (z,
                                                        w) -> Double.parseDouble(z) + Double.parseDouble(w);
        Double doubleVal = process3Loc.process("103.44",
                                               "234.44");

        List<String> stringsLoc = new ArrayList<>();
        stringsLoc.add("deneme1");
        stringsLoc.add("deneme2");
        stringsLoc.forEach(s -> System.out.println(s));

        List<Person> personsLoc = new ArrayList<>();
        personsLoc.add(new Person("osman",
                                  "yay",
                                  200,
                                  90));
        personsLoc.add(new Person("Nil",
                                  "yay",
                                  177,
                                  60));
        personsLoc.forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
        Map<String, Person> mapLoc = new HashMap<>();

        Predicate<String> predicateLoc = s -> s.length() > 20;
        Consumer<String> consumerLoc = s -> System.out.println(s);
        Function<String, Integer> functionLoc = z -> Integer.parseInt(z);
        Supplier<String> supplierLoc = () -> "osman yaycıoğlu";
    }
}
