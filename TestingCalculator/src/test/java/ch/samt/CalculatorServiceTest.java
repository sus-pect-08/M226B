package ch.samt;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class CalculatorServiceTest {

    Calculator calculatorMock = Mockito.mock(Calculator.class);
    CalculatorService cs = new CalculatorService(calculatorMock);

    @Test
    public void testAddAndMultiplyByTwo() {
        when(calculatorMock.addition(1, 2)).thenReturn(3);
        int calcolo = cs.addAndMultiplyByTwo(1, 2);
        assertEquals(6, calcolo);
    }
}
