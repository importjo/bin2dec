package bin2dec;

import java.lang.Math;

public class AppMock extends App {
    
    private boolean showResultWasCalled = false;  

    public void showResult(int result) {
        showResultWasCalled = true;
    }
    
    public boolean verify() {
      return showResultWasCalled;
    }
}
