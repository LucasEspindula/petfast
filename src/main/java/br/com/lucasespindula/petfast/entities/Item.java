package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Integer amount;

    @ManyToOne
    @JoinColumn(nullable = false, name = "idProduct")
    private Product product;

    @ManyToOne
    @JoinColumn(nullable = false, name = "idPetshop")
    private Petshop petshop;

    @ManyToOne
    @JoinColumn(nullable = false, name = "idOrder")
    private Order order;
}