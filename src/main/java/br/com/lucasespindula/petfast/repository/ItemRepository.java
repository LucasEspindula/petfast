package br.com.lucasespindula.petfast.repository;

import br.com.lucasespindula.petfast.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
