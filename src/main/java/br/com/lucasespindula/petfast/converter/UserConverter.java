package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.User;
import br.com.lucasespindula.petfast.service.dto.UserDTO;

public class UserConverter {

    public static User dtoToEntity(UserDTO userDTO) {
        return new User(
                null,
                userDTO.getUsername(),
                userDTO.getEmail(),
                userDTO.getPassword()
//                userDTO.getRoles()
        );
    }
}
