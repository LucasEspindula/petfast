package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PetshopDTO {

    @CNPJ
    @NotBlank
    @Size(max = 14)
    private String cnpj;

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