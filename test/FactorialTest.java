import static org.junit.Assert.*;

import org.junit.*;

public class FactorialTest {
    private Factorial factorial;
    @Before
    public void setUp(){
        factorial = new Factorial();
    }
    @Test
    public void calculate_0(){
        int testStartValue = 0;
        int expectedResult = 0;

        assertEquals(expectedResult, factorial.calculateFactorial(testStartValue));
    }

    @Test
    public void calculate_1(){
        int testStartValue = 1;
        int expectedResult = 1;

        assertEquals(expectedResult, factorial.calculateFactorial(testStartValue));
    }

    @Test
    public void calculate_5(){
        int testStartValue = 5;
        int expectedResult = 120;

        assertEquals(expectedResult, factorial.calculateFactorial(testStartValue));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculate_negative(){
        factorial.calculateFactorial(-5);
    }
}