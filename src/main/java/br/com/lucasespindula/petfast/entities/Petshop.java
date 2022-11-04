package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Date;

@Entity
@Getter
public class Petshop extends User { //serviço e produto

    @CNPJ
    @Column(nullable = false, unique = true, length = 14) //EX DE TAMANHO -> 12345678900000
    private String Cnpj; //CNPJ

    @Builder
    public Petshop(Long id, @Valid Address address, @Valid Contact contact, String name, String password,
                   Date creationDate, String cnpj) {
        super(id, address, contact, name, password, creationDate);
        Cnpj = cnpj;
    }
}