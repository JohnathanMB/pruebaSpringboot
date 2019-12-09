package co.com.devco.prueba.pruebaspringboot.builder;

import co.com.devco.prueba.pruebaspringboot.model.RomanNumber;

public class RomanNumberBuilder {
    private String id;
    private String symbol;
    private int value;

    public RomanNumberBuilder() {
    }

    public static RomanNumberBuilder aRomanNumber() {
        return new RomanNumberBuilder();
    }

    public RomanNumberBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public RomanNumberBuilder withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public RomanNumberBuilder withValue(int value) {
        this.value = value;
        return this;
    }

    public RomanNumber build() {
        RomanNumber romanNumber = new RomanNumber();
        romanNumber.setId(this.id);
        romanNumber.setSymbol(this.symbol);
        romanNumber.setValue(this.value);
        return romanNumber;
    }
}
