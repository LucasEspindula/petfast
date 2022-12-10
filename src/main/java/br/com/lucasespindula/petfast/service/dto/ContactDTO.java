package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(max = 13)
    private String telephone;
}