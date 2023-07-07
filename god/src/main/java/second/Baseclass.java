package second;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public  static ChromeDriver driver;
//	@BeforeMethod
//	public void precondition() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver= new ChromeDriver(options);
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		
//	}
//
//	@AfterMethod()
//	public void postcondirion() {
//		driver.close();
//		
//	
//	
//
//}
}

