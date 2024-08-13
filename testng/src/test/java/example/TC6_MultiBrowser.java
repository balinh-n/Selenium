package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC6_MultiBrowser {
    

    WebDriver driver;
    @Parameters ("browser")
    @BeforeClass
    public void open(String brs) {
        if (brs.equals("chrome")) {
            driver = new ChromeDriver();
        }
        else if (brs.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        else if (brs.equals("edge")) {
            driver = new EdgeDriver();
        }
        else {
			System.out.println("No matching browser");
		}
    }
    
    @Test
    public void TC() {
		driver.get("https://google.com");
	}
    
    @AfterClass
    public void close() {
		driver.close();
	}
}
