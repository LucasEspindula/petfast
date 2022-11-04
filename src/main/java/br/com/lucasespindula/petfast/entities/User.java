package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Date;

@Getter
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Valid
    @Column(nullable = false)
    protected Address address; //ENDEREÇO

    @Valid
    @Column(nullable = false)
    protected Contact contact; //CONTATO

    @Column(nullable = false)
    protected String name; //NOME

    @Column(nullable = false)
    protected String password; //SENHA

    @Column(nullable = false)
    protected Date creationDate; //DATA DE CRIAÇÃO DA CONTA
}