package co.com.devco.prueba.pruebaspringboot.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class RomanNumber {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "symbol", updatable = false, nullable = false)
    private String symbol;

    @Column(name = "value", updatable = false, nullable = false)
    private int value;
}
