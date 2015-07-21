import conv.Convert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConvertJUTest {
    @Test
    public void testConvert_1() {
        String test1 = "nine hundred ninety-nine billion "
                     + "nine hundred ninety-nine million "
                     + "nine hundred ninety-nine thousand "
                     + "nine hundred ninety-nine";
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(9.99999999999E11, answer, 0.000);
    }
    @Test
    public void testConvert_2() {
        String test1 = "one hundred ninety-two billion "
                     + "three hundred forty-five million "
                     + "six hundred ninety thousand "
                     + "eight hundred seventy-one";
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(1.92345690871E11, answer, 0.000);
    }
    @Test
    public void testConvert_3() {
        String test1 = "nine billion one";
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(9.000000001E9, answer, 0.000);
    }
    @Test
    public void testConvert_4() {
        String test1 = "zero";
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(0.00, answer, 0.000);
    }
    @Test
    public void testConvert_5() {
        String test1 = "";
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(0.00, answer, 0.000);
    }
    @Test (expected=NullPointerException.class)
    public void testConvert_6() {
        String test1=null;
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(0.00, answer, 0.000);
    }    
}
