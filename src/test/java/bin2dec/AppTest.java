package bin2dec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    //@Test
    //public void shouldReturnDecimalValueOfBinary() {
    //    App binToDec = new App();
    //    int number = binToDec.Convert("00001111");
    //    assertEquals(15, number);
    //}
    
    @Test
    public void shouldReturnDecimalValueOfZero() {
        App binToDec = new App();
        int number = binToDec.Convert("00000000");
        assertEquals(0, number);
    }

    @Test
    public void shouldReturnDecimalValueOfOne() {
        App binToDec = new App();
        int number = binToDec.Convert("00000001");
        assertEquals(1, number);
    }

    @Test
    public void shouldReturnDecimalValueOfTwo() {
        App binToDec = new App();
        int number = binToDec.Convert("00000010");
        assertEquals(2, number);
    }
}

