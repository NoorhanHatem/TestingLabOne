package com.example.testinglab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class test1Test {

    @Test
    public void testFunction() {
        test1 test = new test1();
        assertEquals("YES", test.watermelon(4));
        assertEquals("YES", test.watermelon(8));
        assertEquals("YES", test.watermelon(6));
        assertEquals("YES", test.watermelon(10));
        assertEquals("YES", test.watermelon(32));
        assertEquals("YES", test.watermelon(44));
        assertEquals("YES", test.watermelon(98));

        assertEquals("NO", test.watermelon(2));
        assertEquals("NO", test.watermelon(5));
        assertEquals("NO", test.watermelon(53));
        assertEquals("NO", test.watermelon(1));
        assertEquals("NO", test.watermelon(7));
        assertEquals("NO", test.watermelon(9));
        assertEquals("NO", test.watermelon(99));
    }
}