package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners (listener.TC10_Listener.class)
public class TC9_dependency {

    @Test
    public void TC1_Login() {

    }

    @Test (dependsOnMethods = "TC1_Login")
    public void TC2_AddNew() {

    }

    @Test (dependsOnMethods = "TC2_AddNew")
    public void TC3_ViewDetail() {
        Assert.assertTrue(false);
    }


    @Test (dependsOnMethods = "TC3_ViewDetail")
    public void TC4_Edit() {

    }

    @Test (dependsOnMethods = "TC1_Login")
    public void TC5_Logout() {

    }
}
