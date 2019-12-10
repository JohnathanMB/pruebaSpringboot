package co.com.devco.prueba.pruebaspringboot.builder;

import lombok.Builder;

@Builder
public class RomanNumber {
    private String id;
    private String symbol;
    private int value;
}
