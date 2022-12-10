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
public class Contact {

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 13)
    private String telephone;
}