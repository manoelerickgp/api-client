package com.project.clientapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "tb_credit_card")
public class CreditCard implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type;

    @Column
    private String number;

    @Column
    private String expiration;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private Person person;

}

