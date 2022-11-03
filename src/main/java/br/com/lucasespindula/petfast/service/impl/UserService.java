package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.repository.UserRepository;
import br.com.lucasespindula.petfast.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import static br.com.lucasespindula.petfast.converter.UserConverter.dtoToEntity;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(UserDTO userDTO) {
        userRepository.save(dtoToEntity(userDTO));
    }
}