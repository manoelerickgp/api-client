package com.project.clientapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardDTO implements Serializable {

    private Long id;
    private String type;
    private String number;
    private String expiration;

    private Long personId;

}
