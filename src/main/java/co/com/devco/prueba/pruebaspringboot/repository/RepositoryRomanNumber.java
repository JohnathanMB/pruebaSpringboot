package co.com.devco.prueba.pruebaspringboot.repository;

import co.com.devco.prueba.pruebaspringboot.model.RomanNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryRomanNumber extends JpaRepository {
    List<RomanNumber> takeCodesRomanNumber();
}
