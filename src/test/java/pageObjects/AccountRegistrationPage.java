package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//All Loctors
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement fiestNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastNameField;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement telephoneField;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement confirmPasswordField;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacyPolicy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continou_Btn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Action Method

	public void setFirstName(String fname) {
		fiestNameField.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lastNameField.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void setTelephone(String tel) {
		telephoneField.sendKeys(tel);
	}
	
	public void setPassword(String pwd) {
		passwordField.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String cpwd) {
		confirmPasswordField.sendKeys(cpwd);
	}
	
	public void clickPrivacyPolicy() {
		privacyPolicy.click();
	}
	
	public void clickContinouBtn() {
		continou_Btn.click();
	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
}
