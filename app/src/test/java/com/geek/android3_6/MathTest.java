package com.geek.android3_6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
 Math math;
    @Before
    public void setUp() {
        math = new Math();
        System.out.println("Before");
    }


    @Test
    public void add() {
        assertEquals(6,math.add(2,4));
        System.out.println("add test");
    }

    @Test
    public void subtract() {
        assertEquals(-2,math.subtract(2,4));
        System.out.println("subtract test");
    }

    @Test
    public void multiply() {
        assertEquals(8,math.multiply(2,4));
        System.out.println("multiply test");
    }

    @Test
    public void divide() {
        assertEquals(2,math.divide(4,2));
        assertEquals(0,math.divide(12,0));
        System.out.println("divide test");
    }
    @After
    public void tearDown() {
        System.out.println("After");
    }
}