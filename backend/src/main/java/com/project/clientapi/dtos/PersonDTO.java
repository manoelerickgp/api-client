package com.project.clientapi.dtos;

import com.project.clientapi.models.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO implements Serializable {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private LocalDate birthday;
    private String gender;

    private AddressDTO address;

    private List<CreditCardDTO> creditCards;

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.firstname = person.getFirstname();
        this.lastname = person.getLastname();
        this.email = person.getEmail();
        this.phone = person.getPhone();
        this.birthday = person.getBirthday();
        this.gender = person.getGender();
    }

}
