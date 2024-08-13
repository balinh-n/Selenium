package example;

import org.testng.annotations.Test;

public class TC2_Group {

    @Test(groups = { "sanity", "smoke" })
    public void TC1() {
        System.out.println("Testcase 1");
    }

    @Test(groups = { "smoke" })
    public void TC2() {
        System.out.println("Testcase 2");
    }

    @Test(groups = { "sanity" })
    public void TC3() {
        System.out.println("Testcase 3");
    }

    @Test(groups = { "sanity", "smoke" })
    public void TC4() {
        System.out.println("Testcase 4");
    }
}
