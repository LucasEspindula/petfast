package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.repository.PetshopRepository;
import br.com.lucasespindula.petfast.service.dto.PetshopDTO;
import org.springframework.stereotype.Service;

import static br.com.lucasespindula.petfast.converter.PetshopConverter.dtoToEntity;

@Service
public class PetshopService {

    private final PetshopRepository petshopRepository;

    public PetshopService(PetshopRepository petshopRepository) {
        this.petshopRepository = petshopRepository;
    }

    public void registerUser(PetshopDTO petshopDTO) {
        petshopRepository.save(dtoToEntity(petshopDTO));
    }
}
