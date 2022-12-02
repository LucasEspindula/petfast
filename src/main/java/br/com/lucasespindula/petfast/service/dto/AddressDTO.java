package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

    @NotBlank
    @Size(max = 8) //EX DE TAMANHO -> 12345-678
    private String zipCode; //CEP

    @NotBlank
    private String road; //RUA

    @NotBlank
    private String district; //BAIRRO

    @NotBlank
    private String city; //CIDADE

    @NotBlank
    private String state; //ESTADO

    @NotBlank
    private String number; //NUMERO

    @Size(max = 100)
    private String complement; //COMPLEMENTO
}