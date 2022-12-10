package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDateTime;

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
    protected Address address;

    @Valid
    @Column(nullable = false)
    protected Contact contact;

    @Column(nullable = false)
    protected String name;

    @Column(nullable = false)
    protected String password;

    @Column(nullable = false)
    protected LocalDateTime creationDate;
}