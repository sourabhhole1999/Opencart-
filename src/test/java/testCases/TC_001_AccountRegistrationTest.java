package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups = {"Regression", "Master"})
	public void verify_account_registration() throws InterruptedException {
		
		try
		{
			logger.info("**** Starting TC_OO1_TC_001_AccountRegistrationTest*****");
		HomePage hp = new HomePage(driver);
		hp.myAccount();
		hp.Registartion();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName(randomString());
		regpage.setLastName(randomString());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setTelephone(randomNumber());
		
		String password=randomAlphaNumber();
		
		regpage.setPassword(password);
		Thread.sleep(2000);
		regpage.setConfirmPassword(password);
		
		regpage.clickPrivacyPolicy();
		regpage.clickContinouBtn();
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**** Finished TC_001_TC_001_AccountRegistrationTest *****");
	}

}
