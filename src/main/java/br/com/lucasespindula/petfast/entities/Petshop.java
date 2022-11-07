package br.com.lucasespindula.petfast.entities;

import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Date;

@Entity
@Getter
public class Petshop extends User {

    @CNPJ
    @Column(nullable = false, unique = true, length = 14) //EX DE TAMANHO -> 12345678900000
    private final String Cnpj; //CNPJ

    @Builder
    public Petshop(Long id, @Valid Address address, @Valid Contact contact, String name, String password,
                   Date creationDate, String cnpj) {
        super(id, address, contact, name, password, creationDate);
        Cnpj = cnpj;
    }

    // TODO : IMPLEMENTAR SERVIÇOS E PRODUTOS
}