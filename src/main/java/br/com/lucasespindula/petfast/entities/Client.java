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
public class Client extends User {

    @Column(nullable = false, unique = true, length = 11) //EX DE TAMANHO -> 12345678900
    private String cpf; //CPF

    @Builder
    public Client(Long id, String cpf, String name, String password, LocalDateTime creationDate,
                  @Valid Contact contact, @Valid Address address) {
        super(id, address, contact, name, password, creationDate);
        cpf = cpf;
    }
}