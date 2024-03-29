package FlashcardTestPackage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FlashcardTest {
	
	public WebDriver driver;
	
	@Test
	public void openApp() {
		driver.get("http://localhost:8080/index.html");
	}
  
	@BeforeTest
	public void beforeTest() {
		driver = (WebDriver) new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
