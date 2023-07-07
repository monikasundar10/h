package god.god;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnscreenshot {
	
	public static void main(String args[]) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		File source= driver.getScreenshotAs(OutputType.FILE);
		File destination= new File("./sn/out.png");
		FileHandler.copy(source,destination);
		
		// how to get one particular web element screenshot
		driver.get("https://letcode.in/buttons");
		WebElement info=driver.findElement(By.id("home"));
		File source1= info.getScreenshotAs(OutputType.FILE);
		File destination1= new File("./sn/out2.png");
		FileHandler.copy(source1,destination1);
		
		
	}

}
