package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    @CPF
    @NotBlank
    @Size(max = 11)
    private String Cpf;

    @Email
    @NotBlank
    @Size(max = 50)
    private String email;

    // TODO : CLASSE DTO DENTRO DE DTO

    @NotBlank
    private String username;

    @NotBlank
    @Size(min = 8)
    private String password;

    @NotBlank
    private Date creationDate;
}