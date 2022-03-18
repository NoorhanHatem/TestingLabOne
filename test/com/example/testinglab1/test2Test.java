package com.example.testinglab1;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class test2Test {

    @Test
    public void testSolution() {
        test2 test = new test2();
        String x = "2" + System.lineSeparator()
                + "2" + System.lineSeparator() + "1" + System.lineSeparator() + "3" + System.lineSeparator()
                + "-2" + System.lineSeparator() + "-1" + System.lineSeparator() + "-3" + System.lineSeparator();
        InputStream input1 = new ByteArrayInputStream(x.getBytes());
        assertEquals("YES", test.solution(input1));

        String y = "3" + System.lineSeparator()
                + "3" + System.lineSeparator() + "1" + System.lineSeparator() + "8" + System.lineSeparator()
                + "-2" + System.lineSeparator() + "-1" + System.lineSeparator() + "-3" + System.lineSeparator()
                + "-1" + System.lineSeparator() + "0" + System.lineSeparator() + "-5" + System.lineSeparator();
        InputStream input2 = new ByteArrayInputStream(y.getBytes());
        assertEquals("YES", test.solution(input2));

        String w = "2" + System.lineSeparator()
                + "5" + System.lineSeparator() + "1" + System.lineSeparator() + "-3" + System.lineSeparator()
                + "-2" + System.lineSeparator() + "7" + System.lineSeparator() + "6" + System.lineSeparator();
        InputStream input3 = new ByteArrayInputStream(w.getBytes());
        assertEquals("NO", test.solution(input3));

        String z = "3" + System.lineSeparator()
                + "3" + System.lineSeparator() + "1" + System.lineSeparator() + "8" + System.lineSeparator()
                + "7" + System.lineSeparator() + "0" + System.lineSeparator() + "-6" + System.lineSeparator()
                + "-1" + System.lineSeparator() + "0" + System.lineSeparator() + "-5" + System.lineSeparator();
        InputStream input4 = new ByteArrayInputStream(z.getBytes());
        assertEquals("NO", test.solution(input4));
    }
}