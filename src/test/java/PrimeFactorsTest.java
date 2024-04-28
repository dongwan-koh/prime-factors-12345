import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsTest {
    PrimeFactor primFactor;

    @BeforeEach
    public void setUp() {
        primFactor = new PrimeFactor();
    }

    @Test
    void testPrimeFactorOf1() {
        assertEquals(Arrays.asList(), primFactor.of(1));
    }

    @Test
    void testPrimeFactorOf2() {
        assertEquals(Arrays.asList(2), primFactor.of(2));
    }

    @Test
    void testPrimeFactorOf3() {
        assertEquals(Arrays.asList(3), primFactor.of(3));
    }

    @Test
    void testPrimeFactorOf4() {
        assertEquals(Arrays.asList(2,2), primFactor.of(4));
    }

    @Test
    void testPrimeFactorOf6() {
        assertEquals(Arrays.asList(2,3), primFactor.of(6));
    }
}
