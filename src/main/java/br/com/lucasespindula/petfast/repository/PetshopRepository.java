package br.com.lucasespindula.petfast.repository;

import br.com.lucasespindula.petfast.entities.Petshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetshopRepository extends JpaRepository<Petshop, Long> {
}
