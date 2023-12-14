package com.project.clientapi.services;

import com.project.clientapi.dtos.CreditCardDTO;
import com.project.clientapi.repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public List<CreditCardDTO> getAllCreditCardsWithOwnerIds() {
        return null;
    }

    @Override
    public CreditCardDTO findCreditCardById(Long id) {
        return null;
    }
}
