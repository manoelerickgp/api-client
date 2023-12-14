package com.project.clientapi.services;

import com.project.clientapi.dtos.CreditCardDTO;

import java.util.List;

public interface CreditCardService {

    List<CreditCardDTO> getAllCreditCardsWithOwnerIds();

    CreditCardDTO findCreditCardById(Long id);
}
