package com.project.clientapi.dtos;

import com.project.clientapi.models.CreditCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data

@NoArgsConstructor
public class CreditCardDTO implements Serializable {

    private Long id;
    private String type;
    private String number;
    private String expiration;

    private Long personId;

    public CreditCardDTO(CreditCard creditCard) {
        this.id = creditCard.getId();
        this.type = creditCard.getType();
        this.number = creditCard.getNumber();
        this.expiration = creditCard.getExpiration();
        this.personId = creditCard.getPerson().getId();
    }
}
