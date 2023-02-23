package com.siemens.training.restproject;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/first")
public class MyFirstRestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping("/hello")
    public String hello2() {
        return "hello world post";
    }

    @GetMapping("/hello2")
    public String hello3(@RequestParam("isim") String name,
                         @RequestParam("soy") String surname) {
        return "hello world 2 " + name + " " + surname;
    }

    @GetMapping("/hello3/{xyz}/{abc}")
    public String hello4(@PathVariable("xyz") String name,
                         @PathVariable("abc") String surname) {
        return "hello world 3 " + name + " " + surname;
    }

    @GetMapping("/hello4/{xyz}")
    public String hello4a(@PathVariable("xyz") String name,
                          @RequestParam("soy") String surname) {
        return "hello world 4 " + name + " " + surname;
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable("id")  long personId) {
        return new Person("osman",
                          "yaycıoğlu",
                          200,
                          95,
                          LocalDate.of(1970, 9,11),
                          LocalDateTime.now());
    }


}
