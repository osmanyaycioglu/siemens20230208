package com.siemens.training.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaRunner {

    public static void main(final String[] args) {
        IExecute executeLoc = (aa,
                               bb) -> bb + " executed";
        String execute2Loc = executeLoc.execute(10,
                                                "denemeOp");
        System.out.println(execute2Loc);
        // ---------------
        IExecute executeLoc2 = new ExecuteImpl();
        String execute3Loc = executeLoc2.execute(10,
                                                 "denemeOp");
        System.out.println(execute3Loc);

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

    }
}
