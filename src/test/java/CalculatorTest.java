import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Calculator.squareRoot(16), 0.001);
        assertEquals(3.0, Calculator.squareRoot(9), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(2.302, Calculator.naturalLog(10), 0.001);
        assertEquals(1.609, Calculator.naturalLog(5), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(2, 3), 0.001);
        assertEquals(27.0, Calculator.power(3, 3), 0.001);
        assertEquals(1.0, Calculator.power(5, 0), 0.001);
    }
}