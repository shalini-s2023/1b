import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EvenOddTest {
    @Test
    public void testEven() {
        assertEquals("Even", new EvenOdd().check(10));
    }
}
