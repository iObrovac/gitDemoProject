package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class demoTests {
public void demoTest() {
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
}
}
