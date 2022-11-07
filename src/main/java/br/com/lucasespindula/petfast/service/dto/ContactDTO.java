package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {

    @Email
    @NotBlank
    private String email; //E-MAIL

    @NotBlank
    @Size(max = 13) //EX DE TAMANHO -> +5551 9 12345678
    private String telephone; //TELEFONE
}