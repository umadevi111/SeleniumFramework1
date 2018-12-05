package test;

import org.testng.annotations.Test;

public class TestNGPriorityMethod {

	@Test(priority = 1)
	public void one() {
		System.out.println("Test1");
	}
	
	@Test(priority = 0)
	public void two() {
		System.out.println("Test2");
		
	}
	
	@Test(priority=1)
	public void three() {
		System.out.println("Test3");
	}
}
