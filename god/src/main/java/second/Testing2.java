//package second;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Testing2 extends Baseclass {
//	public ChromeDriver driver;
//	
//	@Given("open the chrome browser")	
//	public	void openbrowser() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver= new ChromeDriver(options);
//		} 
//	@Given("Load the application url")
//	public void loadapplicationurl() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//	
//	}
//
////
////	@Given("^Enter the username as \"(.*)\"  and password as \"(.*)\"$")
////	public void enterusername(String username,String password) throws Throwable {
////		driver.findElement(By.id("username")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
////		
////		
////	}
//	
//	@Given("^Enter the username as ([^\"]*)$")
//	public void enterusername(String username) throws Throwable {
//		driver.findElement(By.id("username")).sendKeys(username);
//		
//	}
//
//
//	@Given("^Enter the password as \"(.*)\"$")
//	public void enterpassword(String password) throws Throwable {
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
////	@Given("Enter the password as crmsfa")
////	public void enterpassword() {
////	driver.findElement(By.id("password")).sendKeys("crmsfa");
////	}
//	@When("Click on Login button")
//	public void clickloginbutton() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//		
//	}
//	@Then("Homepage should be displayed")
//	public  void verifyhomepage() {
//		boolean displayed =driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
//		if(displayed) {
//	System.out.println("Homepage is displayed");
//		}
//	else {
//		System.out.println("Homepage is  not displayed");
//	}
//
//	}
//	}
////		
//
//
//}
