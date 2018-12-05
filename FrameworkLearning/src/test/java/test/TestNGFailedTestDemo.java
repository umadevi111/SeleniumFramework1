package test;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGFailedTestDemo {

	@Test
	public void test1() {
		System.out.println("Passed test case");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 1 for failure");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = Listners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("Test 2 for failure");
		Assert.assertTrue(0>1);
	}
}
