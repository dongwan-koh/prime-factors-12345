import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {
    @Test
    void testPrimeFactorOf1() {
        PrimeFactor primFactor = new PrimeFactor();
        assertEquals(1,1);
    }
}
