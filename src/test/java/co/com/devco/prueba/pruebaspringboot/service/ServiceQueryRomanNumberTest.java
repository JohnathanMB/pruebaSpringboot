package co.com.devco.prueba.pruebaspringboot.service;

import co.com.devco.prueba.pruebaspringboot.builder.RomanNumberBuilder;
import co.com.devco.prueba.pruebaspringboot.model.RomanNumber;
import co.com.devco.prueba.pruebaspringboot.repository.RepositoryRomanNumber;
import co.com.devco.prueba.pruebaspringboot.vo.AnswerQueryRomanNumber;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

        RomanNumber romanNumberI = new RomanNumberBuilder()
                .withId("1")
                .withSymbol("I")
                .withValue(1).build();
        RomanNumber romanNumberV = new RomanNumberBuilder()
                .withId("5")
                .withSymbol("V")
                .withValue(5).build();
        RomanNumber romanNumberX = new RomanNumberBuilder()
                .withId("10")
                .withSymbol("X")
                .withValue(10).build();
        RomanNumber romanNumberL = new RomanNumberBuilder()
                .withId("50")
                .withSymbol("L")
                .withValue(50).build();
        RomanNumber romanNumberC = new RomanNumberBuilder()
                .withId("100")
                .withSymbol("C")
                .withValue(100).build();
        RomanNumber romanNumberD = new RomanNumberBuilder()
                .withId("500")
                .withSymbol("D")
                .withValue(500).build();
        RomanNumber romanNumberM = new RomanNumberBuilder()
                .withId("1000")
                .withSymbol("M")
                .withValue(1000).build();

        romanNumberList = new ArrayList<RomanNumber>();
        romanNumberList.add(romanNumberI);
        romanNumberList.add(romanNumberV);
        romanNumberList.add(romanNumberX);
        romanNumberList.add(romanNumberL);
        romanNumberList.add(romanNumberC);
        romanNumberList.add(romanNumberD);
        romanNumberList.add(romanNumberM);

    }

    @Test
    public void dadoEnteroArabigoRetornarNumeroRomano(){
        //Given
        int arabicNumber = 235;

        doReturn(romanNumberList).when(repositoryRomanNumber).takeCodesRomanNumber();

        //When
        AnswerQueryRomanNumber result = serviceQueryRomanNumber.query(arabicNumber);

        //Then
        assertThat(result, is(not(nullValue())));
        assertThat(result.getRomanNumber(), is("CCXXXV"));

        ArgumentCaptor<RomanNumber> idCaptor = ArgumentCaptor.forClass(RomanNumber.class);
        verify(repositoryRomanNumber).takeCodesRomanNumber();
        assertThat(idCaptor.getValue(), is(null));
    }

}