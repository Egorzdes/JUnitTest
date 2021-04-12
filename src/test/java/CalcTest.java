import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void add() {
        Calc calc = new Calc();
        double expected = 15;
        double result = calc.add(10, 5);
        assertEquals(expected,result, 0.001);
        double expected2 = 150;
        double result2 = calc.add(100, 50);
        assertEquals(expected2,result2, 0.001);
    }

    @Test
    public void divide() {
        Calc calc2 = new Calc();
        double expected = 10;
        double result = calc2.divide(100,10);
        assertEquals(expected, result, 0.001);
        double expected2 = 3;
        double result2 = calc2.divide(9,3);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void multiple() {
        Calc calc3 = new Calc();
        double expected = 50;
        double result = calc3.multiple(5,10);
        assertEquals(expected, result, 0.001);
        double expected2 = 9;
        double result2 = calc3.multiple(3,3);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void square() {
        Calc calc4 = new Calc();
        double expected = 100;
        double result = calc4.square(10);
        assertEquals(expected, result, 0.001);
        double expected2 = 36;
        double result2 = calc4.square(6);
        assertEquals(expected2, result2, 0.001);
    }
}
