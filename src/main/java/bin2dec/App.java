package bin2dec;

import java.lang.Math;

public class App {

    public static void main(String[] args) {
    }

    public int convert(String binaryNumber) {
        int sum = 0;
        int position = 7;
        for (String letter : binaryNumber.split("")) {
            int binary = Integer.parseInt(letter);
            sum += binary * Math.pow(2, position);
            position--;
        }
        return sum;
    }
}
