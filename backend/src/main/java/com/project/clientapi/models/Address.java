package com.project.clientapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "tb_addresses")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String street;

    @Column
    private String streetName;

    @Column
    private String buildingNumber;

    @Column
    private String city;

    @Column
    private String zipcode;

    @Column
    private String country;

    @Column
    private String countryCode;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

}

