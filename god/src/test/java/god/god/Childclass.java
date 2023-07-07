package god.god;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Childclass extends Baseclass 


{
	
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
	public String[][] fetchData() {
		String[][] data=new String[2][3];
		data[0][0]="qeagle";
		data[0][1]="qeagle";
		data[0][2]="nend";
		
		data[1][0]="moni";
		data[1][1]="dude";
		data[1][2]="welcome";
		
		return data;
	}
}
		
		
		
	

	
	


