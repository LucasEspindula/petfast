package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Date;

@Entity
@Getter
public class Client extends User {

    @Column(nullable = false, unique = true, length = 11) //EX DE TAMANHO -> 12345678900
    private String Cpf; //CPF

    @Builder
    public Client(Long id, @Valid Address address, @Valid Contact contact,
                  String name, String password, Date creationDate, String cpf) {
        super(id, address, contact, name, password, creationDate);
        Cpf = cpf;
    }
}