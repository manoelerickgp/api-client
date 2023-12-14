package com.project.clientapi.services;

import com.project.clientapi.dtos.CreditCardDTO;
import com.project.clientapi.exceptions.NotFoundException;
import com.project.clientapi.models.CreditCard;
import com.project.clientapi.repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    @Transactional(readOnly = true)
    public List<CreditCardDTO> getAllCreditCardsWithOwnerIds() {
        List<CreditCard> list = creditCardRepository.findAll();
        return list.stream().map(this::mapToCreditCardDto).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public CreditCardDTO findCreditCardById(Long id) {
        var creditCard = creditCardRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Credit Card Not Found"));
        return mapToCreditCardDto(creditCard);
    }

    private CreditCardDTO mapToCreditCardDto(CreditCard creditCard) {
        CreditCardDTO creditCardDto = new CreditCardDTO();
        creditCardDto.setId(creditCard.getId());
        creditCardDto.setType(creditCard.getType());
        creditCardDto.setNumber(creditCard.getNumber());
        creditCardDto.setExpiration(creditCard.getExpiration());
        creditCardDto.setPersonId(creditCard.getPerson().getId());
        return creditCardDto;
    }
}
