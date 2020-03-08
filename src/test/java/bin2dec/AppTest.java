package bin2dec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    //@Test
    //public void shouldReturnDecimalValueOfBinary() {
    //    App binToDec = new App();
    //    int number = binToDec.convert("00001111");
    //    assertEquals(15, number);
    //}
    
    @Test
    public void shouldReturnDecimalValueOfZero() {
        App binToDec = new App();
        int number = binToDec.convert("00000000");
        assertEquals(0, number);
    }

    @Test
    public void shouldReturnDecimalValueOfOne() {
        App binToDec = new App();
        int number = binToDec.convert("00000001");
        assertEquals(1, number);
    }

    @Test
    public void shouldReturnDecimalValueOfTwo() {
        App binToDec = new App();
        int number = binToDec.convert("00000010");
        assertEquals(2, number);
    }

    @Test
    public void shouldReturnDecimalValueOfThree() {
        App binToDec = new App();
        int number = binToDec.convert("00000011");
        assertEquals(3, number);
    }

    @Test
    public void shouldReturnDecimalValueOfOnehundredTwentyNine() {
        App binToDec = new App();
        int number = binToDec.convert("10000001");
        assertEquals(129, number);
    }
}

