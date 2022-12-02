package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Client;
import br.com.lucasespindula.petfast.service.dto.ClientDTO;

import java.time.LocalDateTime;

import static br.com.lucasespindula.petfast.converter.AddressConverter.addressDtoToEntity;
import static br.com.lucasespindula.petfast.converter.ContactConverter.contactDtoToEntity;

public class ClientConverter {

    public static Client clientDtoToEntity(ClientDTO clientDTO) {
        return Client.builder()
                .cpf(clientDTO.getCpf())
                .name(clientDTO.getUsername())
                .password(clientDTO.getPassword())
                .creationDate(LocalDateTime.now())
                .contact(contactDtoToEntity(clientDTO.getContactDTO()))
                .address(addressDtoToEntity(clientDTO.getAddressDTO()))
                .build();
    }
}