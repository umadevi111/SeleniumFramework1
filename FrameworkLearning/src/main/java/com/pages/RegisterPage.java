package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
WebDriver driver;

public RegisterPage(WebDriver driver) {
	this.driver=driver;
}
public RegisterPage initElements() {
	return PageFactory.initElements(driver, RegisterPage.class);
}

@FindBy(name = "firstName")
private WebElement firstName;

@FindBy(name = "lastName")
private WebElement lastName;

@FindBy(id="userName")
private WebElement emailID;

@FindBy(name = "country")
private WebElement countryDropdown;

@FindBy(name = "submit")
private WebElement submitButton;

/*
 * mathod to input values
 */
public void registerUser(String firstname, String Lastname, String Emailid, String Country) {
	try{
		firstName.sendKeys(firstname);
		lastName.sendKeys(Lastname);
		emailID.sendKeys(Emailid);
		
		Select country = new Select(countryDropdown);
		country.selectByVisibleText(Country);
		Thread.sleep(3000);
		
		submitButton.click();
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
