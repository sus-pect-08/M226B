package ch.samt;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(9, calc.addition(3, 6));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(3, 0));
    }
}
