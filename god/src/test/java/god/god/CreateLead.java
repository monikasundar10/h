package god.god;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class CreateLead extends Dataproviderbaseclass {
@BeforeSuite
public void setFileName() {
		ExcelfileName="CreateLead";

	}
	@Test(dataProvider="getData")
	public void createLead(String cName,String fname,String lname)  {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		
		
	}
	

	}
	


