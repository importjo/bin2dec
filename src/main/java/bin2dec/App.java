package bin2dec;

import java.lang.Math;

public class App {
  
    public static void main(String[] args) {
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
