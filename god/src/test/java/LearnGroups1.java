import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups= {"all"})
public class LearnGroups1 {
	
	
	@Test(groups= {"sanity"})
	public void test1() {

System.out.println("first test case");
	
	
	
	}
	@Test(groups= {"non functional"})
	public void test2() {

System.out.println("third test case");
	
	
	
	}
	
	@Test
	public void test3() {

System.out.println("first test case");
	
	
	
	}

}
