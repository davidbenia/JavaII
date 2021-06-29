package edu.btu.david.benia.davaleba5;

import edu.btu.david.benia.davaleba5.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest(){
        int expected = 25;
        int actual;

        actual = calculatorService.multiplication(5, 5);

        assertEquals(expected, actual);
    }
}
