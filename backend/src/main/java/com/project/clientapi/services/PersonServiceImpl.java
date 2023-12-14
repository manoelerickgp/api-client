package com.project.clientapi.services;

import com.project.clientapi.models.Person;
import com.project.clientapi.repositories.PersonRepository;
import com.project.clientapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getPersonsByBirthdayRange(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public List<Person> findAllPersons() {
        return null;
    }

    @Override
    public Person findPersonById(Long id) {
        return null;
    }
}
