import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        Factorial factorial = new Factorial();
        int result = (int) Factorial.calculateFactorial(0);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testFactorialOfFive() {
        Factorial factorial = new Factorial();
        int result = (int) Factorial.calculateFactorial(5);
        Assert.assertEquals(result, 120);
    }

    @Test
    public void testFactorialOfTen() {
        Factorial factorial = new Factorial();
        int result = (int) Factorial.calculateFactorial(10);
        Assert.assertEquals(result, 3628800);
    }
}