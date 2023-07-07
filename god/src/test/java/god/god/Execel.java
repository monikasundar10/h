package god.god;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Execel extends Baseclass {
	//@Test(dataProvider="fetchData")
		@Test(dataProvider="getdata")
		public void createlead(String cname,String fname,String lname) {
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.name("submitButton")).click();
		}	
		//DataProvider
		@DataProvider(name="getdata")
		public String[][] fetchData()  throws IOException{
			//String[][] readData=ReadExcel.readData();
			return ReadExcel.readData();
		
		}
	}


