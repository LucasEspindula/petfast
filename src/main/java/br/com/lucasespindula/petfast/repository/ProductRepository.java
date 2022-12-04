package br.com.lucasespindula.petfast.repository;

import br.com.lucasespindula.petfast.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
