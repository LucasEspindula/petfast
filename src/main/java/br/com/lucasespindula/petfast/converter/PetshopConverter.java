package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Address;
import br.com.lucasespindula.petfast.entities.Contact;
import br.com.lucasespindula.petfast.entities.Petshop;
import br.com.lucasespindula.petfast.service.dto.PetshopDTO;

public class PetshopConverter {
    public static Petshop dtoToEntity(PetshopDTO petshopDTO) {
        return new Petshop(
                null,
                petshopDTO.getCnpj(),
                petshopDTO.getUsername(),
                petshopDTO.getPassword(),
                petshopDTO.getCreationDate(),
                new Contact(
                        petshopDTO.getContactDTO().getEmail(),
                        petshopDTO.getContactDTO().getTelephone()
                ),
                new Address(
                        petshopDTO.getAddressDTO().getZipCode(),
                        petshopDTO.getAddressDTO().getRoad(),
                        petshopDTO.getAddressDTO().getDistrict(),
                        petshopDTO.getAddressDTO().getCity(),
                        petshopDTO.getAddressDTO().getState(),
                        petshopDTO.getAddressDTO().getNumber(),
                        petshopDTO.getAddressDTO().getComplement()
                )
        );
    }
}