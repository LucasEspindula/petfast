package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    @CPF
    @NotBlank
    @Size(max = 11) //EX DE TAMANHO -> 12345678900
    private String Cpf;

    @NotBlank
    private ContactDTO contactDTO;

    @NotBlank
    private AddressDTO addressDTO;

    @NotBlank
    private String username;

    @NotBlank
    @Size(min = 8)
    private String password;
}