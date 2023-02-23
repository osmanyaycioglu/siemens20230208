package com.siemens.training.restproject;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/person/provision")
public class PersonProvisionController {
    private Map<Long, Person> personMap = new HashMap<>();
    private long              id        = 1000;

    @PostMapping("/add")
    public CreatePersonResponse createPerson(@Valid  @RequestBody Person personParam) {
        personParam.setCreatedDateTime(LocalDateTime.now());
        personMap.put(id,
                      personParam);
        id++;
        return new CreatePersonResponse(100,
                                        id - 1,
                                        personParam);
    }

    @GetMapping("/get/{id}")
    public Person getPerson(@PathVariable("id")  long personId) {
        Person person = personMap.get(personId);
        if (person == null){
            throw new IllegalArgumentException("personId yok");
        }
        return person;
    }

}
