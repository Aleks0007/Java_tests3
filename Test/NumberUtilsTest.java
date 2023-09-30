package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import seminars.third.hw.NumberUtils;

public class NumberUtilsTest {

    @Test
    public void testEvenNumber() {
        NumberUtils nu = new NumberUtils();
        assertTrue(nu.evenOddNumber(2));
        assertTrue(nu.evenOddNumber(4));
        assertTrue(nu.evenOddNumber(0));
        assertTrue(nu.evenOddNumber(-2));
        assertTrue(nu.evenOddNumber(-4));
    }

    @Test
    public void testOddNumber() {
        NumberUtils nu = new NumberUtils();
        assertFalse(nu.evenOddNumber(1));
        assertFalse(nu.evenOddNumber(3));
        assertFalse(nu.evenOddNumber(-1));
        assertFalse(nu.evenOddNumber(-3));
    }

    @Test
    public void testNumberInInterval() {
        NumberUtils nu = new NumberUtils();
        assertTrue(nu.numberInInterval(26));
        assertTrue(nu.numberInInterval(99));
        assertFalse(nu.numberInInterval(25));
        assertFalse(nu.numberInInterval(100));
        assertFalse(nu.numberInInterval(24));
        assertFalse(nu.numberInInterval(101));
    }
}
