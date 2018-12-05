package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		System.out.println(	System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe"));
		WebDriver driver =new ChromeDriver();
		
	}

}
