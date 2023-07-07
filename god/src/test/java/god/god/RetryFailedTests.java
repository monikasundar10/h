package god.god;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {
	int  retryCount=0;
	@Override
	public boolean retry(ITestResult result) {
		if(retryCount < 2)
		{
			retryCount=retryCount+1;
			return true;
		}
	
		// TODO Auto-generated method stub
		return false;
	}
}