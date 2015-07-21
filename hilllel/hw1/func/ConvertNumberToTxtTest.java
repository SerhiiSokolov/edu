import conv.ConvertNumberToText.*;
import static conv.ConvertNumberToText.splitNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConvertNumberToTxtTest {
    @Test
    public void testConvertNumberTotTxtTest_0() {
        long test = 0L;
        String answer = splitNumber(test);;
        assertEquals(" zero", answer);
    }
    @Test
    public void testConvertNumberTotTxtTest_1() {
        long test = 1L;
        String answer = splitNumber(test);
        assertEquals(" one", answer);
    }
    @Test
    public void testConvertNumberTotTxtTest_2() {
        long test = 0L;
        String answer = splitNumber(test);
        assertEquals("zero", answer);
    }
    @Test
    public void testConvertNumberTotTxtTest_3() {
        long test = 0L;
        String answer = splitNumber(test);
        assertEquals("zero", answer);
    }
    @Test (expected=NullPointerException.class)
    public void testConvertNumberTotTxtTest_4() {
        long test = 0L;
        String answer = splitNumber(test);
        assertEquals("zero", answer);
    }    
}
