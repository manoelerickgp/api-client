package com.project.clientapi.services;

import com.project.clientapi.dtos.AddressDTO;
import com.project.clientapi.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<AddressDTO> findAllAddress() {
        return null;
    }

    @Override
    public AddressDTO findAddressById(Long id) {
        return null;
    }
}
