package com.siemens.training.java.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.siemens.training.java.classdesign.Person;

public class LambdaRunner {

    public static void main(final String[] args) {
        final int localInt = 100;
        final Person personLoc = new Person("osman",
                                            "yay",
                                            200,
                                            90);
        personLoc.setBirthDate(LocalDate.now());
        personLoc.setFirstName("Nil");

        IExecute executeLoc = (aa,
                               bb) -> bb + " executed " + personLoc.getFirstName();
        String execute2Loc = executeLoc.execute(10,
                                                "denemeOp");
        System.out.println(execute2Loc);
        // ---------------
        IExecute executeLoc2 = new ExecuteImpl();
        String execute3Loc = executeLoc2.execute(10,
                                                 "denemeOp");
        System.out.println(execute3Loc);

        IExecute executeLoc3 = (aa,
                                bb) -> {
            System.out.println("execution " + aa);
            return bb + " executed";
        };

        List<String> listLoc = Arrays.asList("osman",
                                             "ali",
                                             "ayşe",
                                             "mehmet");
        listLoc.forEach(name -> System.out.println("name : " + name));
        listLoc.forEach(n -> System.out.println("isim : " + n));
        listLoc.forEach(n -> System.out.println(n + " isimli insan"));

        //        for (String stringLoc : listLoc) {
        //            System.out.println("name : " + stringLoc);
        //        }

        List<String> listLoc2 = new ArrayList<>();
        listLoc2.add("osman");
        listLoc2.add("ali");

        ITest test = () -> "test finished";

        ITest test2 = () -> {
            System.out.println("test başladı");
            return "test finished";
        };
    }
}
