package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
System.out.println("************** Test Started: "+result.getName());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("************** Test Success: "+result.getName());		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("************** Test failed: "+result.getName());		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("************** Test Skipped: "+result.getName());		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("************** Test Failed with the success percentage: "+result.getName());		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("************** Test OnStart: "+context.getName());		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("************** Test OnFinish: "+context.getName());		
		
	}

}
