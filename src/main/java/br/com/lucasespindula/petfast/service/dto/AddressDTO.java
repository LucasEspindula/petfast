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
    @Size(max = 8)
    private String zipCode;

    @NotBlank
    private String road;

    @NotBlank
    private String district;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    private String number;
    @Size(max = 100)
    private String complement;
}