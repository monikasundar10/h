package god.god;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learndropdowns {

public static void main(String args[]) throws IOException {
	
		//System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://letcode.in/dropdowns");
WebElement 	opt=	driver.findElement(By.id("fruits"));

Select opt1= new Select(opt);
opt1.selectByIndex(2);
// to display the selected value
WebElement selected=opt1.getFirstSelectedOption();
String ele=selected.getText();
System.out.println(ele);



// to display all the value in dropdowns

List<WebElement> wel=opt1.getOptions();
int size=opt1.getOptions().size();
for(int i=0; i<size;i++)
{

WebElement op= wel.get(i); 
String text= op.getText();
System.out.println(text);
}		
}
}
