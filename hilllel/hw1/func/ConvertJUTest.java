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
        assertEquals(999999999999L, answer);
    }
    @Test
    public void testConvert_2() {
        String test1 = "one hundred ninety-two billion "
                     + "three hundred forty-five million "
                     + "six hundred ninety thousand "
                     + "eight hundred seventy-one";
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(192345690871L, answer);
    }
    @Test
    public void testConvert_3() {
        String test1 = "nine billion one";
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(9000000001L, answer);
    }
    @Test
    public void testConvert_4() {
        String test1 = "zero";
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(0, answer, 0);
    }
    @Test (expected=NullPointerException.class)
    public void testConvert_5() {
        String test1=null;
        String[] splitedTXT = test1.split(" ");
        long answer = Convert.convertArray(splitedTXT);
        assertEquals(0, answer, 0);
    }    
}
