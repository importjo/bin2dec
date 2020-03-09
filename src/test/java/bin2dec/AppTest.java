package bin2dec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.IllegalArgumentException;

class AppTest {

    //@Test
    //public void shouldReturnDecimalValueOfBinary() {
    //    App binToDec = new App();
    //    int number = binToDec.main(new String[] {"00001111"});
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

    @Test
    public void shouldReturnDecimalValueOfFifteen() {
        App binToDec = new App();
        int number = binToDec.convert("1111");
        assertEquals(15, number);
    }

    @Test
    public void shouldReturnDecimalValueOfFifteenWithHeadingZero() {
        App binToDec = new App();
        int number = binToDec.convert("00001111");
        assertEquals(15, number);
    }

    @Test
    public void shouldContainOnlyZeroOrOneNumbers() {
        assertThrows(IllegalArgumentException.class, () -> {
            App binToDec = new App();
            binToDec.main(new String[] {"aabbccdd"});
        });
    }

    @Test
    public void shouldNotCatchExceptionWithZeroOrOneNumber() {
        try {
            App binToDec = new App();
            binToDec.main(new String[] {"1111"});
        } catch (IllegalArgumentException ex) {
            fail("Should not catch exception.");
        }
    }
    
    @Test
    public void shouldContainInputWithMaxEightDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            App binToDec = new App();
            binToDec.main(new String[] {"000000001"});
        });
    }
}

