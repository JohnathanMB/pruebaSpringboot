package co.com.devco.prueba.pruebaspringboot.service.impl;

import co.com.devco.prueba.pruebaspringboot.converter.ConverterRomanNumber;
import co.com.devco.prueba.pruebaspringboot.model.RomanNumber;
import co.com.devco.prueba.pruebaspringboot.repository.RepositoryRomanNumber;
import co.com.devco.prueba.pruebaspringboot.service.ServiceQueryRomanNumber;
import co.com.devco.prueba.pruebaspringboot.vo.AnswerQueryRomanNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceQueryRomanNumberImpl implements ServiceQueryRomanNumber {

    private final RepositoryRomanNumber repositoryRomanNumber;
    private final ConverterRomanNumber converterRomanNumber;

    @Autowired
    public ServiceQueryRomanNumberImpl(RepositoryRomanNumber repositoryRomanNumber,
                                       ConverterRomanNumber converterRomanNumber){
        this.repositoryRomanNumber = repositoryRomanNumber;
        this.converterRomanNumber = converterRomanNumber;
    }

    @Override
    public AnswerQueryRomanNumber query(int n) {
        return converterRomanNumber.convert(repositoryRomanNumber.findAll());
    }
}
