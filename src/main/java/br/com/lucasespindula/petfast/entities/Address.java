package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Column(nullable = false, length = 8) //EX DE TAMANHO -> 12345-678
    private String zipCode; //CEP

    @Column(nullable = false)
    private String road; //RUA

    @Column(nullable = false)
    private String district; //BAIRRO

    @Column(nullable = false)
    private String city; //CIDADE

    @Column(nullable = false)
    private String state; //ESTADO

    @Column(nullable = false)
    private String number; //NUMERO

    @Column(length = 100)
    private String complement; //COMPLEMENTO
}