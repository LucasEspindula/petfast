package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Address;
import br.com.lucasespindula.petfast.entities.Client;
import br.com.lucasespindula.petfast.entities.Contact;
import br.com.lucasespindula.petfast.service.dto.ClientDTO;

public class UserConverter {

    public static Client dtoToEntity(ClientDTO clientDTO) {
        Address clientAddress = new Address(
                clientDTO.getAddressDTO().getZipCode(),
                clientDTO.getAddressDTO().getRoad(),
                clientDTO.getAddressDTO().getDistrict(),
                clientDTO.getAddressDTO().getCity(),
                clientDTO.getAddressDTO().getState(),
                clientDTO.getAddressDTO().getNumber(),
                clientDTO.getAddressDTO().getComplement()
        );

        Contact clientContact = new Contact(
                clientDTO.getContactDTO().getEmail(),
                clientDTO.getContactDTO().getTelephone()
        );

        return new Client(
                null,
                new Address(
                        clientDTO.getAddressDTO().getZipCode(),
                        clientDTO.getAddressDTO().getRoad(),
                        clientDTO.getAddressDTO().getDistrict(),
                        clientDTO.getAddressDTO().getCity(),
                        clientDTO.getAddressDTO().getState(),
                        clientDTO.getAddressDTO().getNumber(),
                        clientDTO.getAddressDTO().getComplement()
                ),
                new Contact(
                        clientDTO.getContactDTO().getEmail(),
                        clientDTO.getContactDTO().getTelephone()
                ),
                clientDTO.getUsername(),
                clientDTO.getPassword(),
                clientDTO.getCreationDate(),
                clientDTO.getCpf()
        );
    }
}