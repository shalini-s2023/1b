package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EvenOddTest {
    @Test
    public void testEven() {
        EvenOdd app = new EvenOdd();
        assertEquals("Even", app.check(10));
    }

    @Test
    public void testOdd() {
        EvenOdd app = new EvenOdd();
        assertEquals("Odd", app.check(7));
    }
}
