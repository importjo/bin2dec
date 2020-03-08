package bin2dec;

import java.lang.Math;

public class App {

    public static void main(String[] args) {
    }

    public int convert(String binaryNumber) {
        //if (binaryNumber.equals("00000010")) {
        //    return 2;
        //}
        //if (binaryNumber.equals("00000011")) {
        //    return 3;
        //}
        //return binaryNumber.equals("00000001") ? 1 : 0;
        return mathConvert(binaryNumber);
    }
    
    private int mathConvert(String binaryNumber) {
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
