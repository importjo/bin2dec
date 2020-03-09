package bin2dec;

import java.lang.Math;

public class App {
  
    public static void main(String[] args) {
        App binToDec = new App();
        binToDec.validateBinary(args);
        binToDec.validateBinaryLength(args);
        binToDec.showResult(binToDec.convert(args[0]));
    }

    private void validateBinary(String[] input) {
        if (!input[0].matches("[0-1]+"))
            throw new IllegalArgumentException(
                "Should contain only zero or one.");
    }

    private void validateBinaryLength(String[] input) {
        if (input[0].length() > 8)
            throw new IllegalArgumentException(
                "Should be eight digits number.");
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

    private void showResult(int result) {
        System.out.println(result);
    }
}
