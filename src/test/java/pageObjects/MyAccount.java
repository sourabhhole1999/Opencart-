package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{

	public MyAccount(WebDriver driver) {
		super(driver);
	}
	
	//All Loctors
	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	//Action Method

		public boolean isMyAccountPageExists() {
			try {
			return (msgHeading.isDisplayed());
			}
			catch (Exception e) {
				return(false);
			}
		}
		
		public void clickLogout() {
			lnkLogout.click();
		}
}



