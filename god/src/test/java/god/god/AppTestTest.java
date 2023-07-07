//package god.god;
//
//import java.time.Duration;
//import java.util.function.Function;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class AppTestTest {
//    @Test
//	public void name()
//	{
//    	ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver= new ChromeDriver(options);
//		WebDriver a;
//		
//	 return	a.findElement(By.name("submitButton")).isDisplayed();
//	}
//}
//		
//		
//		
//		driver.get("https://triton.damaka.com/web/");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		Function<WebDriver,Boolean> f= new Function <WebDriver,Boolean>(){
//
//			@Override
//			public Boolean apply(WebDriver driver) {
//				// TODO Auto-generated method stub
//				return driver.findElement(By.name("submitButton")).isDisplayed();
//			}
//			
//			
//		}
//}
//}
