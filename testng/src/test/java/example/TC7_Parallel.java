package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7_Parallel {

	WebDriver driver;

	@BeforeMethod
	public void open() {
		driver = new ChromeDriver();
	}

	@Test
	public void Tc1() {
		System.out.println("Test 1");
	}

	@Test
	public void Tc2() {
		System.out.println("Test 2");
	}

	@Test
	public void Tc3() {
		System.out.println("Test 3");
	}

	@Test
	public void Tc4() {
		System.out.println("Test 4");
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}
