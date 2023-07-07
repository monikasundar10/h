package god.god;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderbaseclass {
	public ChromeDriver driver;
	public String ExcelfileName;
	
	@DataProvider(name="getData")
	public String[][] fetchData() throws IOException
		{
		return DataproviderExcel.readData(ExcelfileName);
	}
	@Parameters({"url","username","password"})
	@BeforeMethod
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
