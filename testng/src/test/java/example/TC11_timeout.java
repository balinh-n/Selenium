package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC11_timeout {
    WebDriver driver;

    @Test (timeOut = 5000)
    public  void TC() {
        driver = new ChromeDriver();
        driver.get("http://live.techpanda.org/");
        driver.close();
    }

}
