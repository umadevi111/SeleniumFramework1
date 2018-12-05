package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alertpopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//alert handling
	driver.navigate().to(("http://output.jsbin.com/usidix/1"));
	driver.findElement(By.xpath("//input[@type='button']")).click();
	driver.switchTo().alert().accept();
	//Thread.sleep(3000);

	//selecting radio buttons/ checkboxes
	driver.navigate().to("http://demo.guru99.com/test/radio.html");
	driver.findElement(By.xpath("//input[@value='Option 3']")).click(); 
	//Thread.sleep(3000);
	
	//selecting checkbox values
	WebElement checkbox= driver.findElement(By.xpath("//input[@value='checkbox2']"));
	checkbox.click();
	//Thread.sleep(3000);
	
	if(checkbox.isSelected()) {
	driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
	//Thread.sleep(3000);
	}
	else {
		checkbox.click();
	}
	
	driver.manage().window().maximize();
	driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
	Select country = new Select(driver.findElement(By.name("country")));
	country.selectByValue("BASSA DE INDIA");
	
	driver.findElement(By.xpath("//a[contains(@href, 'login.php')]")).click();
	
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	//closing the browser
	driver.close();
}
}
