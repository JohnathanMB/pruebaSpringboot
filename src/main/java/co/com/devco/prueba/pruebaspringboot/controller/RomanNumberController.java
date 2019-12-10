package co.com.devco.prueba.pruebaspringboot.controller;

import co.com.devco.prueba.pruebaspringboot.service.ServiceQueryRomanNumber;
import co.com.devco.prueba.pruebaspringboot.vo.AnswerQueryRomanNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumberController {

    private final ServiceQueryRomanNumber serviceQueryRomanNumber;

    @Autowired
    public  RomanNumberController(ServiceQueryRomanNumber serviceQueryRomanNumber){
        this.serviceQueryRomanNumber = serviceQueryRomanNumber;
    }

    @GetMapping("/romanNumber/{romanNumber}")
    public AnswerQueryRomanNumber get(@PathVariable int romanNumber){
        return  serviceQueryRomanNumber.query(romanNumber);
    }
}
