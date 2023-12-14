package com.project.clientapi.services;

import com.project.clientapi.dtos.AddressDTO;

import java.util.List;

public interface AddressService {

    List<AddressDTO> findAllAddress();

    AddressDTO findAddressById(Long id);
}
