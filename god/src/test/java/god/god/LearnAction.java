package god.god;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;






public class LearnAction {
	@Test
	public void kk()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver(options);
		
	driver.get("https://www.snapdeal.com/");
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(120));
    wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[@class='catText']"))));
  	WebElement elemen2 =driver.findElement(By.xpath("//span[@class='catText']"));
	WebElement elemen=driver.findElement(By.xpath("//span[contains(text(),'Shirts')]"));
	Actions  builder= new Actions(driver);
   //2
	builder.moveToElement(elemen2).click(driver.findElement(By.xpath("//span[contains(text(),'Shirts')]"))).perform();
	//builder.moveToElement(elemen2).moveToElement(elemen).click().perform();
	
	
	
	}
}
	
		

