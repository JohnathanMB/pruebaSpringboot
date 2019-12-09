package co.com.devco.prueba.pruebaspringboot.service;

import co.com.devco.prueba.pruebaspringboot.service.impl.ServiceQueryRomanNumberImpl;
import co.com.devco.prueba.pruebaspringboot.vo.AnswerQueryRomanNumber;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

class ServiceQueryRomanNumberTest {

    private final ServiceQueryRomanNumber serviceQueryRomanNumber = new ServiceQueryRomanNumberImpl();

    @Test
    public void dadoEnteroArabigoRetornarNumeroRomano(){
        //Given
        int enteroArabigo = 235;

        //When
        AnswerQueryRomanNumber result = serviceQueryRomanNumber.query(enteroArabigo);

        //Then
        assertThat(result, is(not(nullValue())));

    }

}