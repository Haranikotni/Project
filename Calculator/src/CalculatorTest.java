import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator ob=new Calculator();

    @Test
    void add() {
        assertEquals(3,ob.add(1,2));
    }

    @Test
    void mul() {
        assertEquals(2,ob.mul(1,2));
    }

    @Test
    void reverse() {
        assertEquals(12345,ob.reverse(54321));
    }
}