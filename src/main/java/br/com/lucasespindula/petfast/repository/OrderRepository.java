package br.com.lucasespindula.petfast.repository;

import br.com.lucasespindula.petfast.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
