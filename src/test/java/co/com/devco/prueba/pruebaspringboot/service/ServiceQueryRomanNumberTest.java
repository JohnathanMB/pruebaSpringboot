package co.com.devco.prueba.pruebaspringboot.service;

import co.com.devco.prueba.pruebaspringboot.builder.RomanNumber;
import co.com.devco.prueba.pruebaspringboot.repository.RepositoryRomanNumber;
import co.com.devco.prueba.pruebaspringboot.vo.AnswerQueryRomanNumber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doReturn;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
class ServiceQueryRomanNumberTest {

    @Autowired
    private ServiceQueryRomanNumber serviceQueryRomanNumber;

    @MockBean
    private RepositoryRomanNumber repositoryRomanNumber;

    List<RomanNumber> romanNumberList;

    @Before
    private void init(){
        romanNumberList = new ArrayList<>();
        romanNumberList.add(RomanNumber.builder().id("1").symbol("I").value(1).build());
        romanNumberList.add(RomanNumber.builder().id("5").symbol("V").value(5).build());
        romanNumberList.add(RomanNumber.builder().id("10").symbol("X").value(10).build());
        romanNumberList.add(RomanNumber.builder().id("50").symbol("L").value(50).build());
        romanNumberList.add(RomanNumber.builder().id("100").symbol("C").value(100).build());
        romanNumberList.add(RomanNumber.builder().id("500").symbol("D").value(500).build());
        romanNumberList.add(RomanNumber.builder().id("1000").symbol("M").value(1000).build());
    }

    @Test
    public void dadoEnteroArabigoRetornarNumeroRomano(){
        //Given
        int arabicNumber = 235;

        doReturn(romanNumberList).when(repositoryRomanNumber).findAll();

        //When
        AnswerQueryRomanNumber result = serviceQueryRomanNumber.query(arabicNumber);

        //Then
        assertThat(result, is(not(nullValue())));
        assertThat(result.getRomanNumber(), is("CCXXXV"));

        ArgumentCaptor<RomanNumber> idCaptor = ArgumentCaptor.forClass(RomanNumber.class);
        verify(repositoryRomanNumber).findAll();
        assertThat(idCaptor.getValue(), is(""));
    }

}