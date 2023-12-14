package com.project.clientapi.services;

import com.project.clientapi.dtos.AddressDTO;
import com.project.clientapi.exceptions.NotFoundException;
import com.project.clientapi.models.Address;
import com.project.clientapi.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    @Transactional(readOnly = true)
    public List<AddressDTO> findAllAddress() {
        List<Address> listAddresses = addressRepository.findAll();
        return listAddresses.stream().map(this::mapToAddressDTO).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public AddressDTO findAddressById(Long id) {
        var address = addressRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Address Not Found"));
        return mapToAddressDTO(address);
    }

    private AddressDTO mapToAddressDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(address.getId());
        addressDTO.setStreet(address.getStreet());
        addressDTO.setStreetName(address.getStreetName());
        addressDTO.setBuildingNumber(address.getBuildingNumber());
        addressDTO.setCity(address.getCity());
        addressDTO.setZipcode(address.getZipcode());
        addressDTO.setCountry(address.getCountry());
        addressDTO.setCountryCode(address.getCountryCode());
        addressDTO.setLatitude(address.getLatitude());
        addressDTO.setLongitude(address.getLongitude());
        return addressDTO;
    }
}
