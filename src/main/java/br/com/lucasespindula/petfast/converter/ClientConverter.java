package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Address;
import br.com.lucasespindula.petfast.entities.Client;
import br.com.lucasespindula.petfast.entities.Contact;
import br.com.lucasespindula.petfast.service.dto.ClientDTO;

public class ClientConverter {

    public static Client dtoToEntity(ClientDTO clientDTO) {
        return new Client(
                null,
                clientDTO.getCpf(),
                clientDTO.getUsername(),
                clientDTO.getPassword(),
                clientDTO.getCreationDate(),
                new Contact(
                        clientDTO.getContactDTO().getEmail(),
                        clientDTO.getContactDTO().getTelephone()
                ),
                new Address(
                        clientDTO.getAddressDTO().getZipCode(),
                        clientDTO.getAddressDTO().getRoad(),
                        clientDTO.getAddressDTO().getDistrict(),
                        clientDTO.getAddressDTO().getCity(),
                        clientDTO.getAddressDTO().getState(),
                        clientDTO.getAddressDTO().getNumber(),
                        clientDTO.getAddressDTO().getComplement()
                )
        );
    }
}