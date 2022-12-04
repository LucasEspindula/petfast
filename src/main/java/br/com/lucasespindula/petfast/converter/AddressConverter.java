package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Address;
import br.com.lucasespindula.petfast.service.dto.AddressDTO;

public class AddressConverter {

    public static Address addressDtoToEntity(AddressDTO addressDTO) {
        return Address.builder()
                .city(addressDTO.getCity())
                .road(addressDTO.getRoad())
                .state(addressDTO.getState())
                .number(addressDTO.getNumber())
                .zipCode(addressDTO.getZipCode())
                .district(addressDTO.getDistrict())
                .complement(addressDTO.getComplement())
                .build();
    }
}