package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	@Test
	@Parameters({"name"})
	public void test(String name) {

		System.out.println("Name is :"+name);
	}
}
