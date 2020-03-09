package bin2dec;

import java.lang.Math;

public class App {
  
    public static void main(String[] args) {
        validateBinary(args);
    }

    private static void validateBinary(String[] input) {
        if (!input[0].matches("[0-1]+"))
            throw new IllegalArgumentException(
                "Should contain only zero or one.");
    }

    public int convert(String number) {
        int decimal = 0;
        int position = number.length() - 1;
        for (int i = 0; i < number.length(); i++) {
            int binary = Character.getNumericValue(number.charAt(i)); 
            decimal += binary * Math.pow(2, position);
            position--;
        }
        return decimal;
    }
}
