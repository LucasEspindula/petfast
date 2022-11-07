package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    @Column(nullable = false, unique = true)
    private String email; //E-MAIL

    @Column(nullable = false, length = 13) //EX DE TAMANHO -> +5551 9 12345678
    private String telephone; //TELEFONE
}