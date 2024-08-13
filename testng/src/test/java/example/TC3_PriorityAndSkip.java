package example;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TC3_PriorityAndSkip {
    

     @Test(priority = 3)
    public void TC1() {
        System.out.println("Testcase 1");
    }

    @Test(priority = 2)
    public void TC2() {
        System.out.println("Testcase 2");
    }

    @Test @Ignore
    public void TC3() {
        System.out.println("Testcase 3");
    }

    @Test(priority = 1)
    public void TC4() {
        System.out.println("Testcase 4");
    }
}
