package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{

	@Test(groups = {"Sanity", "Master"})
	public void verify_Login() {
		try {
			
			logger.info("logger.info(\"**** Starting TC_002_LoginTest  ****\")");
			
			//Home page

			HomePage hp = new HomePage(driver);
			hp.myAccount();
			logger.info("clicked on myaccount link on the home page..");
			hp.Login();
			logger.info("clicked on login link under myaccount..");
			
			//Login page
			
			LoginPage lp = new LoginPage(driver);
			logger.info("Entering valid email and password..");
			lp.setUsername(p.getProperty("userName"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			logger.info("clicked on ligin button..");
			
			//My Account Page

			MyAccount macc=new MyAccount(driver);
			boolean target = macc.isMyAccountPageExists();
			
			Assert.assertEquals(target, true ,"Login Failed");
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("**** Finished TC_002_LoginTest  ****");
	}
}
