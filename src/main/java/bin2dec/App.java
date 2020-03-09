package bin2dec;

import java.lang.Math;

public class App {

    public static void main(String[] args) {
    }

    public int convert(String binaryNumber) {
        int decimal = 0;
        int position = binaryNumber.length() - 1;
        for (int i = 0; i < binaryNumber.length(); i++) {
            char character = binaryNumber.charAt(i);
            int binary = Character.getNumericValue(character);
            decimal += binary * Math.pow(2, position);
            position--;
        }
        return decimal;
    }
}
