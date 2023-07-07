package god.god;

import org.testng.annotations.Test;

public class LearntoRerunFailedTests {
	@Test(retryAnalyzer=RetryFailedTests.class)
	public void createLead() {
		System.out.println("CreateLead");
		throw  new RuntimeException();
		
	}
	@Test(retryAnalyzer=RetryFailedTests.class)
	public void editLead() {
		System.out.println("editeLead");
		
		
	}
	@Test(retryAnalyzer=RetryFailedTests.class)
	public void deleteLead() {
		System.out.println("delerteLead");
		
		
	}
	
	

}
