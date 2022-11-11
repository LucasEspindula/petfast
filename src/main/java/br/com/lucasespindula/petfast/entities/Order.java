package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Client client;

    @Column(nullable = false)
    private Petshop petshop;

    @Column(nullable = false)
    private Product product;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    @OneToMany(cascade = {CascadeType.ALL},  mappedBy = "order")
    private List<Item> items;
}