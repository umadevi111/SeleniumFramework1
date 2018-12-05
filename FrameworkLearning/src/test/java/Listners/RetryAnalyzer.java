package Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
private int retrycount = 0;
private static final int maxRetryCount = 3;
	
	public boolean retry(ITestResult result) {
		if(retrycount<maxRetryCount) {
			retrycount++;
			return true;
		}
		
		return false;
	}

}
