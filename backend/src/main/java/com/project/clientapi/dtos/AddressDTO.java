package com.project.clientapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO implements Serializable {

    private Long id;
    private String street;
    private String streetName;
    private String buildingNumber;
    private String city;
    private String zipcode;
    private String country;
    private String countryCode;
    private Double latitude;
    private Double longitude;

}
