package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    @CPF
    @NotBlank
    @Size(max = 11)
    private String cpf;

    @NotBlank
    private ContactDTO contact;

    @NotBlank
    private AddressDTO address;

    @NotBlank
    private String username;

    @NotBlank
    @Size(min = 8)
    private String password;
}