package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC6_MultiEnv {

	WebDriver driver;
	
	@BeforeClass
	public void open() {
		driver = new ChromeDriver();
	}

	@Parameters("environment")
	@Test
	public void TC(@Optional("pro") String env) {
		driver.get(getEnvirontment(env));
	}

	@AfterClass
	public void close() {
		driver.close();
	}

	public String getEnvirontment(String environments) {
		String urlValue = "";
		if (environments.equals("dev")) {
			urlValue = "https://dev.pos.mealsuite.com";
		} else if (environments.equals("staging")) {
			urlValue = "https://staging.pos.mealsuite.com";
		} else if (environments.equals("pro")) {
			urlValue = "https://pos.mealsuite.com";
		} else {
			System.out.println("No matching environment");
		}
		return urlValue;
	}
}
