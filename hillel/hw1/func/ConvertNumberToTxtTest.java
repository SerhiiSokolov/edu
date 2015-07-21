package edu.hillel.hw1.func;

import org.junit.Test;

import edu.hillel.hw1.func.ConvertNumberToText;

import static org.junit.Assert.*;

public class ConvertNumberToTxtTest {
    @Test
    public void testConvertNumberTotTxtTest_0() {
        long test = 0L;
        String answer = ConvertNumberToText.splitNumber(test);;
        assertEquals(" zero", answer);
    }
    @Test
    public void testConvertNumberTotTxtTest_1() {
        long test = 1L;
        String answer = ConvertNumberToText.splitNumber(test);
        assertEquals(" one", answer);
    }
    @Test
    public void testConvertNumberTotTxtTest_2() {
        long test = 0L;
        String answer = ConvertNumberToText.splitNumber(test);
        assertEquals("zero", answer);
    }
    @Test
    public void testConvertNumberTotTxtTest_3() {
        long test = 0L;
        String answer = ConvertNumberToText.splitNumber(test);
        assertEquals("zero", answer);
    }
    @Test (expected=NullPointerException.class)
    public void testConvertNumberTotTxtTest_4() {
        long test = 0L;
        String answer = ConvertNumberToText.splitNumber(test);
        assertEquals("zero", answer);
    }    
}
