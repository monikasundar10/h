//package god.god;
//
//import java.io.IOException;
//import java.time.Duration;
//
//import org.junit.BeforeClass;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class EditLead extends Dataproviderbaseclass {
//	
//	@BeforeClass
//	public void setFileName() {
//		excelfileName="Testing";
//	}
//	@Test(dataProvider="getdata")
//	public void editLead(String ph,String cname) throws InterruptedException{
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("username")).sendKeys("DemoCSR");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Find Leads")).click();
//		driver.findElement(By.xpath("//span[text()='phone']")).click();
//		driver.findElement(By.xpath("//input[@name=' phoneNumber']")).sendKeys(ph);
//		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partId']/a")).click();
//		driver.findElement(By.linkText("Edit")).click();
//		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
//		driver.close();
//		
//	}
//		
//	
//		
		
		
		
		

		
//		
//	}
