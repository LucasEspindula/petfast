package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(mappedBy = "address")
    private User user; //usuario

    @Column(nullable = false)
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

    private String complement; //COMPLEMENTO
}