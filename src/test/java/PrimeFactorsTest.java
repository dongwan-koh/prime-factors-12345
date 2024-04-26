import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {
    @Test
    void testPrimeFactorOf1() {
        PrimeFactor primFactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primFactor.of(1));
    }
}
