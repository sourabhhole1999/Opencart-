package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//All Loctors
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement userNameField;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement login_Btn;

	
	//Action Method

		public void setUsername(String username) {
			userNameField.sendKeys(username);
		}
		
		public void setPassword(String password) {
			passwordField.sendKeys(password);
		}
		
		public void clickLogin() {
			login_Btn.click();		}
		
}
