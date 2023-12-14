package com.project.clientapi.controllers;

import com.project.clientapi.dtos.CreditCardDTO;
import com.project.clientapi.services.CreditCardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/credit_cards")
public class CreditCardController {

    @Autowired
    private CreditCardServiceImpl creditCardService;


    @GetMapping
    public ResponseEntity<List<CreditCardDTO>> findAllCreditCards(){
        return new ResponseEntity<>(creditCardService.getAllCreditCardsWithOwnerIds(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CreditCardDTO> findCreditCardById(@PathVariable Long id) {
        var creditCard = creditCardService.findCreditCardById(id);
        return new ResponseEntity<>(creditCard, HttpStatus.OK);
    }
}

