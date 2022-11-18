package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Order_")
@Getter
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "idClient")
    private Client client;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    @OneToMany(cascade = {CascadeType.ALL},  mappedBy = "order")
    private List<Item> items;
}