
import java.util.Arrays;

public class Convert {

    public static void main(String[] args) {
        String test1 = "nine hundred ninety-nine billion nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine";
        //String test1 = "one hundred ninety-two billion three hundred forty-five million six hundred ninety thousand eight hundred seventy-one";
        //String test1 = "nine billion one";
        //String test1 = "one hundred one";
        //String test1 = null;
        try {
            String[] splitedTXT = test1.split(" ");

            double digit = convertArray(splitedTXT);
            System.out.println(digit);
        } catch (NullPointerException errObj) {
            System.out.println("NullPointerException");
        }
    }

    public static int convert(String test1) {
        int n = 0;
        String[] test2 = test1.split(" ");

        if (test1.contains("hundred")) {
            n = 100 * findNumber(test2[0]);
        }

        if (test1.contains("-")) {
            String[] test3 = test2[test2.length - 1].split("-");
            n = n + findTen(test3[0]) * 10 + findNumber(test3[1]);
        }

        if (test2.length == 1 || test2.length == 3) {
            n = n + findTen(test2[test2.length - 1]) * 10;
            n = n + findNumber(test2[test2.length - 1]);
        }
        return n;
    }

    public static int findTen(String strNumber) {
        int sday = 0;
        String[] one = {"zero", "zero", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        for (int i = 0; i < one.length; i++) {
            if (strNumber.equals(one[i])) {
                sday = i;
                break;
            }
        }
        return sday;
    }

    public static int findNumber(String strNumber) {
        int sday = 0;
        String[] one = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        for (int i = 0; i < one.length; i++) {
            if (strNumber.equals(one[i])) {
                sday = i;
                break;
            }
        }

        return sday;
    }

    public static double convertArray(String[] array) {
        int start = 0, stop = array.length;
        long factor, digit = 0;
        boolean last = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("billion")) {
                stop = i;
                factor = 1000000000;
                String[] tempArray = new String[(stop - start)];
                String tempString = "";
                for (int j = start, k = 0; j < stop; j++) {
                    tempString = tempString + String.valueOf(array[j]) + " ";
                    k++;
                }
                digit = digit + convert(tempString) * factor;
                String[] temp1 = Arrays.copyOfRange(array, stop + 1, array.length);
                array = temp1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("million")) {
                factor = 1000000;
                stop = i;
                String tempString = "";
                String[] tempArray = new String[array.length];
                for (int j = 0, k = 0; j < stop; j++) {
                    tempString = tempString + String.valueOf(array[j]) + " ";
                    k++;
                }
                digit = digit + convert(tempString) * factor;
                String[] temp1 = Arrays.copyOfRange(array, stop + 1, array.length);
                array = temp1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("thousand")) {
                factor = 1000;
                stop = i;
                String tempString = "";
                String[] tempArray = new String[array.length];
                for (int j = 0, k = 0; j < stop; j++) {
                    tempString = tempString + String.valueOf(array[j]) + " ";
                    k++;
                }
                digit = digit + convert(tempString) * factor;
                String[] temp1 = Arrays.copyOfRange(array, stop + 1, array.length);
                array = temp1;
            }
        }
        long digit1 = 0;
        for (int i = 0; i < array.length; i++) {
            String tempString = "";
            String[] tempArray = new String[array.length];
            for (int j = 0, k = 0; j < array.length; j++) {
                tempString = tempString + String.valueOf(array[j]) + " ";
                k++;
            }
            digit1 = convert(tempString);
        }
        return digit1 + digit;
    }
}
