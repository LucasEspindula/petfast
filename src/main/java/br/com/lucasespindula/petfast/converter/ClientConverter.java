package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Address;
import br.com.lucasespindula.petfast.entities.Client;
import br.com.lucasespindula.petfast.entities.Contact;
import br.com.lucasespindula.petfast.service.dto.ClientDTO;

import java.time.LocalDateTime;

public class ClientConverter {

    public static Client dtoToEntity(ClientDTO clientDTO) {
        return Client.builder()
                .cpf(clientDTO.getCpf())
                .name(clientDTO.getUsername())
                .password(clientDTO.getPassword())
                .creationDate(LocalDateTime.now())
                .contact(new Contact(
                        clientDTO.getContactDTO().getEmail(),
                        clientDTO.getContactDTO().getTelephone()
                ))
                .address(new Address(
                        clientDTO.getAddressDTO().getZipCode(),
                        clientDTO.getAddressDTO().getRoad(),
                        clientDTO.getAddressDTO().getDistrict(),
                        clientDTO.getAddressDTO().getCity(),
                        clientDTO.getAddressDTO().getState(),
                        clientDTO.getAddressDTO().getNumber(),
                        clientDTO.getAddressDTO().getComplement()
                ))
                .build();
    }
}