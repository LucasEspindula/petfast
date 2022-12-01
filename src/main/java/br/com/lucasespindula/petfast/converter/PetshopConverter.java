package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Address;
import br.com.lucasespindula.petfast.entities.Contact;
import br.com.lucasespindula.petfast.entities.Petshop;
import service.dto.PetshopDTO;

import java.time.LocalDateTime;

public class PetshopConverter {
    public static Petshop dtoToEntity(PetshopDTO petshopDTO) {
        return Petshop.builder()
                .cnpj(petshopDTO.getCnpj())
                .name(petshopDTO.getUsername())
                .password(petshopDTO.getPassword())
                .creationDate(LocalDateTime.now())
                .contact(new Contact(
                        petshopDTO.getContactDTO().getEmail(),
                        petshopDTO.getContactDTO().getTelephone()
                ))
                .address(new Address(
                        petshopDTO.getAddressDTO().getZipCode(),
                        petshopDTO.getAddressDTO().getRoad(),
                        petshopDTO.getAddressDTO().getDistrict(),
                        petshopDTO.getAddressDTO().getCity(),
                        petshopDTO.getAddressDTO().getState(),
                        petshopDTO.getAddressDTO().getNumber(),
                        petshopDTO.getAddressDTO().getComplement()
                ))
                .build();
    }
}