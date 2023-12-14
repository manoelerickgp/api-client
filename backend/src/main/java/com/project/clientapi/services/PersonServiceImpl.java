package com.project.clientapi.services;

import com.project.clientapi.dtos.AddressDTO;
import com.project.clientapi.dtos.CreditCardDTO;
import com.project.clientapi.dtos.PersonDTO;
import com.project.clientapi.exceptions.NotFoundException;
import com.project.clientapi.models.CreditCard;
import com.project.clientapi.models.Person;
import com.project.clientapi.repositories.PersonRepository;
import com.project.clientapi.services.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public List<PersonDTO> getPersonsByBirthdayRange(LocalDate startDate, LocalDate endDate) {
        List<Person> persons = personRepository.findByBirthdayBetween(startDate, endDate);
        return persons.stream().map(this::mapToPersonDto).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonDTO> findAllPersons() {
        List<Person> persons = personRepository.findAll();
        return persons.stream().map(PersonDTO::new).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public PersonDTO findPersonById(Long id) {
        var person = personRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Person Not Found"));
        return mapper.map(person, PersonDTO.class);
    }

    private PersonDTO mapToPersonDto(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setFirstname(person.getFirstname());
        personDTO.setLastname(person.getLastname());
        personDTO.setEmail(person.getEmail());
        personDTO.setPhone(person.getPhone());
        personDTO.setBirthday(person.getBirthday());
        personDTO.setGender(person.getGender());
        personDTO.setAddress(mapper.map(person.getAddress(), AddressDTO.class));

        List<CreditCardDTO> creditCardDTOs = new ArrayList<>();
        for (CreditCard creditCard : person.getCreditCards()) {
            CreditCardDTO creditCardDTO = mapper.map(creditCard, CreditCardDTO.class);
            creditCardDTOs.add(creditCardDTO);
        }
        personDTO.setCreditCards(creditCardDTOs);
        return personDTO;
    }

}
