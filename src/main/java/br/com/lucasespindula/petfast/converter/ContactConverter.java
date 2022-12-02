package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Contact;
import br.com.lucasespindula.petfast.service.dto.ContactDTO;

public class ContactConverter {

    public static Contact contactDtoToEntity(ContactDTO contactDTO) {
        return Contact.builder()
                .email(contactDTO.getEmail())
                .telephone(contactDTO.getTelephone())
                .build();
    }
}
