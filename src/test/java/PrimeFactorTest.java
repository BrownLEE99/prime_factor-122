import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    private PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimeFactorOf1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimeFactorOf2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    void testPrimeFactorOf3() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    void testPrimeFactorOf4() {
        assertEquals(Arrays.asList(2, 2), primeFactor.of(4));
    }

    @Test
    void testPrimeFactorOf6() {
        assertEquals(Arrays.asList(2, 3), primeFactor.of(6));
    }

    @Test
    void testPrimeFactorOf9() {
        assertEquals(Arrays.asList(3, 3), primeFactor.of(9));
    }

    @Test
    void testPrimeFactorOf12() {
        assertEquals(Arrays.asList(2, 2, 3), primeFactor.of(12));
    }
}