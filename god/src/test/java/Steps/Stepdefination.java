package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination {
	ChromeDriver driver;
	
	
@Given("open chrome browser")	
public	void openbrowser() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(options);
	
}
@Given("Load application url")
public void loadapplicationurl() {
	driver.get("http://leaftaps.com/opentaps/control/main");
	
}

@Given("Enter the username as DemosalesManager")
public void enterusername() {
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
}
@And("Enter the password as crmsfa")
public void enterpassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
}
@When("Click on Login button")
public void clickloginbutton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	
}
@Then("Homepage should be displayed")
public  void verifyhomepage() {
	boolean displayed =driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	if(displayed) {
System.out.println("Homepage is displayed");
	}
else {
	System.out.println("Homepage is  not displayed");
}

}
}
//	
//	
//	
//}
//	@Given("open chrome browser")	
//	public	void openbrowser() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver= new ChromeDriver(options);
//		}
//	@Given("Load application url")
//	public void loadapplicationurl() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		
//	}
//
//
//	@Given("Enter the username as {string}  and password as {string}")
//	public void enterusername(String username,String password) throws Throwable {
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		
//	}
//////	@Given("^Enter the username as (.*)$")
//////	public void enterusername(String username) throws Throwable {
//////		driver.findElement(By.id("username")).sendKeys(username);
//////		
//////	}
////
////
////	//@Given("Enter the username as DemosalesManager")
//////	public void enterusername(String password) {
//////		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
//////	}
//////	@And("Enter the password as crmsfa")
//////	public void enterpassword() {
//////		driver.findElement(By.id("password")).sendKeys("crmsfa");
//////	}
//	@When("Click on Login button")
//	public void clickloginbutton() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//		
//	}
//@Then("Homepage should be displayed")
//public  void verifyhomepage() {
//	boolean displayed =driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
//	if(displayed) {
//System.out.println("Homepage is displayed");
//	}
//	else {
//		System.out.println("Homepage is  not displayed");
//	}
//
//}
//	}
//		
//		

