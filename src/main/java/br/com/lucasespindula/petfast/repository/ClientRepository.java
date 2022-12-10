package br.com.lucasespindula.petfast.repository;

import br.com.lucasespindula.petfast.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
