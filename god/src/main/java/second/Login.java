package second;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends Baseclass {
//ChromeDriver driver;
	
//	
////	@Given("open chrome browser")	
////	public	void openbrowser() {
////		WebDriverManager.chromedriver().setup();
////		ChromeOptions options = new ChromeOptions();
////		options.addArguments("--remote-allow-origins=*");
////		driver= new ChromeDriver(options);
////		}
////	@Given("Load application url")
////	public void loadapplicationurl() {
////		driver.get("http://leaftaps.com/opentaps/control/main");
////		
////	}
//
//
//	@Given("Enter the username as \"(.*)\"  and password as \"(.*)\"$")
//	public void enterusername(String username,String password) throws Throwable {
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		
//	}
	
	@Given("Enter the username as {string}")
	public void enterusername(String username) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(username);
		
	}

	

	@Given("Enter the password as {string}")
	public void enterpassword(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
	}
////	@Given("Enter the password as crmsfa")
////	public void enterpassword() {
////	driver.findElement(By.id("password")).sendKeys("crmsfa");
//////	}
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

@Before
public void precondition() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/main");
	
}
}

////		
//

