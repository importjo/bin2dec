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
        int number = binToDec.Convert("00000001");
        assertEquals(0, number);
    }
}
