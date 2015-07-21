
import static java.lang.Math.abs;
public class ConvertNumberToText {

    public static void main(String[] args) {
        //long test = 999999999999L;
        long test=0;
        String word = splitNumber(abs(test));
        System.out.println(test);
        if (test<0) System.out.println("-"+word);
        else System.out.println(word);
    }

    public static String convNumber(long number, String a) {
        String string = "";
        if (number / 100 > 0) {
            string = findNumber(number / 100) + " hundred";
            number %= 100;
        }
        if (number / 10 > 0 && number % 10 > 0) {
            if (number > 0 && number <= 19) {
                string = string + " " + findNumber(number);
            } else {
                string = string + " " + findTen(number / 10) + "-" + findNumber(number % 10);
            }
        } else if (number / 10 > 0 && number % 10 == 0) {
            string = string + " " + findTen(number / 10);
        } else {
            string = string + " " + findNumber(number % 10);
        }
        return string + a;
    }

    public static String splitNumber(long number) {
        String word = "";
        if ((number > 999999999)) {
            word = word + convNumber(number / 1000000000, " billion ");
            number = number % 1000000000;
        }
        if ((number > 999999)) {
            word = word + convNumber(number / 1000000, " million ");
            number = number % 1000000;
        }
        if (number > 999) {
            word = word + " " + convNumber(number / 1000, " thousand ");
        }
        if (number >= 0) {
            word = word + convNumber(number % 1000, "");
        }
        return word ;
    }

public static String findTen(long strNumber) {
        String[] one = {"zero", "zero", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        return one[(int)strNumber];
    }

    public static String findNumber(long strNumber) {
        String[] one = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        return one[(int)strNumber];
    }
}
