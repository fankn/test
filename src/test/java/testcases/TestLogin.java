package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;


public class TestLogin {
	WebDriver driver;
	LoginPage objLogin;
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	  public void test_HomePage() {
		
		//Create LoginPage object
		objLogin = new LoginPage(driver);
		
		//Verify login_page title
		String actualLoginPageTitle = objLogin.getLoginPageTitle();
		String expectedLoginPageTitle = "Welcome: Mercury Tours";
		Assert.assertEquals(actualLoginPageTitle,expectedLoginPageTitle);
		
		//login to application
		objLogin.login("tutorial", "tutorial");			
				
	  }
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
