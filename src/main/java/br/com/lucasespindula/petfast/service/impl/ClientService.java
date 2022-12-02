package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.repository.ClientRepository;
import br.com.lucasespindula.petfast.service.dto.ClientDTO;
import org.springframework.stereotype.Service;

import static br.com.lucasespindula.petfast.converter.ClientConverter.clientDtoToEntity;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void registerUser(ClientDTO clientDTO) {
        clientRepository.save(clientDtoToEntity(clientDTO));
    }
}