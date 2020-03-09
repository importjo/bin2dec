package bin2dec;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.IllegalArgumentException;

class AppTest {
    
    App binToDec;
  
    @BeforeEach
    public void init() {
        binToDec = new App();
    }
    
    @ParameterizedTest
    @CsvSource({
         "00000000, 0" })
    public void shouldReturnDecimalValueOfZero(String number, int expected) {
        int actual = binToDec.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnDecimalValueOfOne() {
        int number = binToDec.convert("00000001");
        assertEquals(1, number);
    }

    @Test
    public void shouldReturnDecimalValueOfTwo() {
        int number = binToDec.convert("00000010");
        assertEquals(2, number);
    }

    @Test
    public void shouldReturnDecimalValueOfThree() {
        int number = binToDec.convert("00000011");
        assertEquals(3, number);
    }

    @Test
    public void shouldReturnDecimalValueOfOnehundredTwentyNine() {
        int number = binToDec.convert("10000001");
        assertEquals(129, number);
    }

    @Test
    public void shouldReturnDecimalValueOfFifteen() {
        int number = binToDec.convert("1111");
        assertEquals(15, number);
    }

    @Test
    public void shouldReturnDecimalValueOfFifteenWithHeadingZero() {
        int number = binToDec.convert("00001111");
        assertEquals(15, number);
    }

    @Test
    public void shouldContainOnlyZeroOrOneNumbers() {
        assertThrows(IllegalArgumentException.class, () -> {
            binToDec.main(new String[] {"aabbccdd"});
        });
    }

    @Test
    public void shouldNotCatchExceptionWithZeroOrOneNumber() {
        try {
            binToDec.main(new String[] {"1111"});
        } catch (IllegalArgumentException ex) {
            fail("Should not catch exception.");
        }
    }
    
    @Test
    public void shouldContainInputWithEightDigitsMax() {
        assertThrows(IllegalArgumentException.class, () -> {
            binToDec.main(new String[] {"000000001"});
        });
    }
}

