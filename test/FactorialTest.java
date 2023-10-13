import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void calculate_0(){
    //   first, create an instance of the class that you want to test
        Factorial factorial = new Factorial();
        int testStartValue = 0;
        int expectedResult = 0;

        assertEquals(expectedResult, factorial.calculateFactorial(testStartValue));
    }
}