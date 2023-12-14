package com.project.clientapi.services;

import com.project.clientapi.models.Person;

import java.time.LocalDate;
import java.util.List;

public interface PersonService {

    List<Person> getPersonsByBirthdayRange(LocalDate startDate, LocalDate endDate);

    List<Person> findAllPersons();

    Person findPersonById(Long id);
}
