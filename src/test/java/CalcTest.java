import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalcTest {

    private Calc calc;

    @Before
    public void setUp() {
        calc = new Calc();
    }

    @Test
    public void whenAddTenToFiveThenResultFifteen() {
        double expected = 15;
        double result = calc.add(10, 5);
        assertEquals(expected, result, 0.001);
    }


    @Test
    public void add() {

        double expected2 = 150;
        double result2 = calc.add(100, 50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void whenFiveAddToTenAssStringThenResultFifteen() {
        double expected = 15;
        double result = calc.add("10", "5");
        assertEquals(expected, result, 0.001);

    }

    @Test
    public void whenInputIncorrectValueThenThrowException() {
        boolean wasException = false;
        try {
            calc.add("sdsd", "5");
        } catch (Exception e) {
            wasException = true;
        }
        assertTrue(wasException);
    }

    @Test(expected = NumberFormatException.class) // указываем конкретное исключение, которое ожидаем или любое общее
    public void whenInputIncorrectValueThenThrowExceptionV2() {
        calc.add("sdsd", "5");
    }

    @Test
    public void whenDivideOneHundreadToTenThenResultTen() {
        double expected = 10;
        double result = calc.divide(100, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void divide() {

        double expected2 = 3;
        double result2 = calc.divide(9, 3);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void whenMultipleFiveToTenThenResultFifty() {
        double expected = 50;
        double result = calc.multiple(5, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void multiple() {
        double expected2 = 9;
        double result2 = calc.multiple(3, 3);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void whenSquareTenThenResultOneHundread() {
        double expected = 100;
        double result = calc.square(10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void square() {

        double expected2 = 36;
        double result2 = calc.square(6);
        assertEquals(expected2, result2, 0.001);
    }

    @After
    public void close() {
        calc = null;
    }
}
