package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//All Loctors
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement registartion;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement login;
	
	//Action Method
	
	public void myAccount() {
		linkAccount.click();
	}
	
	public void Registartion() {
		registartion.click();
	}
	
	public void Login() {
		login.click();
	}

}
