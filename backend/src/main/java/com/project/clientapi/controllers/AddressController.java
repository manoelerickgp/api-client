package com.project.clientapi.controllers;

import com.project.clientapi.dtos.AddressDTO;
import com.project.clientapi.services.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/addresses")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressService;

    @GetMapping
    public ResponseEntity<List<AddressDTO>> findAllAddress(){
        return new ResponseEntity<>(addressService.findAllAddress(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AddressDTO> findAddressById(@PathVariable Long id){
        return new ResponseEntity<>(addressService.findAddressById(id), HttpStatus.OK);
    }
}
