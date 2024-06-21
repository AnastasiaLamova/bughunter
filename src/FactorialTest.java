import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void testFactorialOf0() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    void testFactorialOf5() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    void testFactorialOf10() {
        assertEquals(3628800, Factorial.calculateFactorial(10));
    }
}