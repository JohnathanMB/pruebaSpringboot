package co.com.devco.prueba.pruebaspringboot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RomanNumber {
    private String id;
    private String symbol;
    private int value;
}
