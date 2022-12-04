package br.com.lucasespindula.petfast.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Petshop extends User {

    @Column(nullable = false, unique = true, length = 14) //EX DE TAMANHO -> 12345678900000
    private String cnpj; //CNPJ

    @Builder
    public Petshop(Long id, String cnpj, String name, String password, LocalDateTime creationDate,
                   @Valid Contact contact, @Valid Address address) {
        super(id, address, contact, name, password, creationDate);
        this.cnpj = cnpj;
    }
}