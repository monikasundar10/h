package god.god;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Baseclass {
	public ChromeDriver driver;
	//@Parameters({"url","username","password"})
	
	
	@Test()
	public void precondition(@Optional("http://leaftaps.com/opentaps/") String url,@Optional("DemoSalesManager") String username,@Optional("crmsfa") String password) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver(options);
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		
		
	}

}
