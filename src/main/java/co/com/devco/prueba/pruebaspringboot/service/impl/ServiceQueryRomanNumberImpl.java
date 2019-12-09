package co.com.devco.prueba.pruebaspringboot.service.impl;

import co.com.devco.prueba.pruebaspringboot.service.ServiceQueryRomanNumber;
import co.com.devco.prueba.pruebaspringboot.vo.AnswerQueryRomanNumber;

public class ServiceQueryRomanNumberImpl implements ServiceQueryRomanNumber {
    @Override
    public AnswerQueryRomanNumber query(int n) {
        return new AnswerQueryRomanNumber();
    }
}
