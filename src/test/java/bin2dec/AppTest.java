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
         "00000000, 0",
         "00000001, 1",
         "00000010, 2",
         "00000011, 3",
         "10000001, 129"
     })
    public void shouldConvertBinaryToDecimal(String number, int expected) {
        assertEquals(expected, binToDec.convert(number));
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

    @Test
    public void shouldShowBinaryToDecimalResult() {
        //binToDec = new AppMock();
        //binToDec.main(new String[] {"00001111"});
        //assertTrue(binToDec.verify()); 
    }
} 

