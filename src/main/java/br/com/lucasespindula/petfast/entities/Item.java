package br.com.lucasespindula.petfast.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Integer amount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idProduct", nullable = false)
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPetshop", nullable = false)
    private Petshop petshop;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idOrder", nullable = false)
    private Order order;

    @Builder
    public Item(Integer amount, Product product, Petshop petshop) {
        this.amount = amount;
        this.product = product;
        this.petshop = petshop;
    }
}