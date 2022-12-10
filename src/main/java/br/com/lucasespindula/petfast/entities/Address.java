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

    @Column(nullable = false, length = 8)
    private String zipCode;

    @Column(nullable = false)
    private String road;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String number;

    @Column(length = 100)
    private String complement;
}