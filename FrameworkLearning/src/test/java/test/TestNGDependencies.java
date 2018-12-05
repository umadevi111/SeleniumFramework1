package test;

import org.testng.annotations.Test;

public class TestNGDependencies {

	@Test(dependsOnMethods= {"test2"})
	public void test1() {
		System.out.println("Executing Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Executing Test2");

	}
	
	@Test
	public void test3() {
		System.out.println("Executing Test3");

	}
}
