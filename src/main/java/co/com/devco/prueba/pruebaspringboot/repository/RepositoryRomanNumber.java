package co.com.devco.prueba.pruebaspringboot.repository;

import co.com.devco.prueba.pruebaspringboot.model.RomanNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryRomanNumber extends JpaRepository<RomanNumber, String> {
}
