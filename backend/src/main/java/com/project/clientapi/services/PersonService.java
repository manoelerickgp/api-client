package com.project.clientapi.services;

import com.project.clientapi.dtos.PersonDTO;
import com.project.clientapi.models.Person;

import java.time.LocalDate;
import java.util.List;

public interface PersonService {

    List<PersonDTO> getPersonsByBirthdayRange(LocalDate startDate, LocalDate endDate);

    List<PersonDTO> findAllPersons();

    PersonDTO findPersonById(Long id);
}
