package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class demoTests {
	
	@Test
public void demoTest() {
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.udemy.com/");
	
	
	
}
}
