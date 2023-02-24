package com.siemens.training.restproject;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/person/db")
public class PersonProvisionDBController {

    @Autowired
    private IPersonDao personDao;

    @PostMapping("/add")
    public CreatePersonResponse createPerson(@Valid  @RequestBody Person personParam) {
        personParam.setCreatedDateTime(LocalDateTime.now());
        Person savedPerson = personDao.save(personParam);
        return new CreatePersonResponse(100,
                                        savedPerson.getPersonId(),
                                        personParam);
    }

    @GetMapping("/get/{id}")
    public Person getPerson(@PathVariable("id")  long personId) {
        return personDao.findById(personId).orElse(null);
    }

}
