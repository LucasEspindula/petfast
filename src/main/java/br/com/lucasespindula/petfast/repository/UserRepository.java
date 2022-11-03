package br.com.lucasespindula.petfast.repository;

import br.com.lucasespindula.petfast.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findByUsername(String username);
//
//    Boolean existsByUsername(String username);
//
//    Boolean existsByEmail(String email);
}
