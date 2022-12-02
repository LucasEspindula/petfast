package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Petshop;
import br.com.lucasespindula.petfast.service.dto.PetshopDTO;

import java.time.LocalDateTime;

import static br.com.lucasespindula.petfast.converter.AddressConverter.addressDtoToEntity;
import static br.com.lucasespindula.petfast.converter.ContactConverter.contactDtoToEntity;

public class PetshopConverter {
    public static Petshop petshopDtoToEntity(PetshopDTO petshopDTO) {
        return Petshop.builder()
                .cnpj(petshopDTO.getCnpj())
                .name(petshopDTO.getUsername())
                .password(petshopDTO.getPassword())
                .creationDate(LocalDateTime.now())
                .contact(contactDtoToEntity(petshopDTO.getContactDTO()))
                .address(addressDtoToEntity(petshopDTO.getAddressDTO()))
                .build();
    }
}