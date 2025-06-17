import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Setup: runs before each test
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @After
    public void tearDown() {
        // Teardown: runs after each test
        calculator = null;
        System.out.println("Teardown complete.");
    }

    @Test
    public void testMultiply() {
        // Arrange
        int a = 4, b = 5;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        // Arrange
        int a = 10, b = 2;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(5, result);
    }
}
