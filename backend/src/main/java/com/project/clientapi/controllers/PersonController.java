package com.project.clientapi.controllers;

import com.project.clientapi.dtos.PersonDTO;
import com.project.clientapi.models.Person;
import com.project.clientapi.services.PersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
@RestController
@RequestMapping(value = "/api/v1/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/findByPeriod")
    public ResponseEntity<List<PersonDTO>> getPersonsByBirthdayRange(
            @RequestParam("birthdayStart") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birthdayStart,
            @RequestParam("birthdayEnd") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birthdayEnd) {
        List<PersonDTO> persons = personService.getPersonsByBirthdayRange(birthdayStart, birthdayEnd);

        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<PersonDTO>> findAllPersons() {
        List<PersonDTO> listPerson = personService.findAllPersons();
        return new ResponseEntity<>(listPerson, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonDTO> findById(@PathVariable Long id) {
        var person = personService.findPersonById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

}
