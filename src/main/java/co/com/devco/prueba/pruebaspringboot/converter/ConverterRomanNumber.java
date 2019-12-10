package co.com.devco.prueba.pruebaspringboot.converter;

import co.com.devco.prueba.pruebaspringboot.model.RomanNumber;
import co.com.devco.prueba.pruebaspringboot.vo.AnswerQueryRomanNumber;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConverterRomanNumber implements Converter<List<RomanNumber>, AnswerQueryRomanNumber> {


    @Override
    public AnswerQueryRomanNumber convert(List<RomanNumber> source) {
        //TODO Falta loogica para generar numero romano
        return new AnswerQueryRomanNumber(1000);
    }
}
