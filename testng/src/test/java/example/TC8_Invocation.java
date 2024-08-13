package example;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC8_Invocation {
	
	WebDriver driver;
	
	@BeforeClass
	public void open() {
		driver = new ChromeDriver();
	}
	
	@Test (invocationCount = 5)
	public void innovationTest() {
		String email = random()+"@gmai.com";
		String pass = "abcd1234@";
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(random());
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(random());
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@title='Register']")).click();
        
        driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[text()='Account']")).click();
        driver.findElement(By.xpath("//a[@title='Log Out']")).click();
        
        
        System.out.println(email + pass);
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	public String random() {
		String randomString = RandomStringUtils.randomAlphabetic(5);
		return randomString;
	}
}
