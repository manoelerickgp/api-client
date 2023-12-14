package com.project.clientapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "tb_persons")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private LocalDate birthday;

    @Column
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "tb_person_address", joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    private Address address;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<CreditCard> creditCards;

}

