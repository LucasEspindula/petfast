package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Order_")
@Getter
@Builder
@NoArgsConstructor
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

//    @Column(nullable = false)
//    private Double finalValue;

    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "order")
    private List<Item> items = new ArrayList<>();
}