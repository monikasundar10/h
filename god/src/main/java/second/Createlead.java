package second;

import org.openqa.selenium.By;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Createlead extends Baseclass{
	
	@When("click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	@Then("MyHome page should be displayed")
	public void verifyMyHomePage()

	{
		
		System.out.println("my home page is displayed");
		
	}
	@But("Error  message should be displayed")
	public void click()
	{
		System.out.println("bcdjbc");
	}

}

