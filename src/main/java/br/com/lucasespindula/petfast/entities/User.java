package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id", nullable = false)
    private Address address; //ENDEREÇO

    @Column(nullable = false)
    private String username; //NOME

    @Column(nullable = false)git a
    private String email; //EMAIL

    @Column(nullable = false)
    private String password; //SENHA

    @Column(nullable = false)
    private TypeUser typeUser; //TIPO DE USUARIO

    @Column(nullable = false)
    private Date creationDate; //DATA DE CRIAÇÃO DA CONTA
}
