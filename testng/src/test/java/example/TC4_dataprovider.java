package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC4_dataprovider {

    WebDriver driver;

    @BeforeMethod
    public void open() {
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "webSite")
    public void TC1_dataprovider(String webName) throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(webName);
        Thread.sleep(3000);
    }
    @AfterMethod
    public void close() {
        driver.close();
    }

    @DataProvider(name = "webSite")
    public Object[] webSiteName() {
        return new Object[] {
                "fb", "zalo", "instagram"

        };

    }
}
