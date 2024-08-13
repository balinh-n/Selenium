package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC5_Parameter {
	
	WebDriver driver;
	
	@BeforeClass
	public void open() {
		driver = new ChromeDriver();
	}
	@Parameters ("web")
	@Test
	public void TC1(String webname) {
		driver.get("https://google.com");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(webname);
		new Actions(driver).keyDown(Keys.ENTER).build().perform();
		new Actions(driver).release();
	}
	
	@AfterClass
	public void close () {
		driver.quit();
	}
}
