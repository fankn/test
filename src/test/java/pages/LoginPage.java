package pages;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	WebDriver driver;
	WebElement element;
	WebDriverWait waitDriver;
	
	By userName = By.name("userName");
	By password = By.name("password");
	By login = By.name("login");
	
	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
	}

	//Set user name in textbox
	public void setUserName(String strUserName)
	{
		
		try {
			element = driver.findElement(userName);
			if (element.isEnabled()) 
			{
				element.clear();
				element.sendKeys(strUserName);
			}
		} catch (Exception e) {
			System.out.println("userName can not found " + e.getMessage());
		}
		
	}
	
	//Set password in password textbox
	public void setPassword(String strPassword)
	{
		try {
			element = driver.findElement(password);
			if (element.isEnabled()) 
			{
				element.clear();
				element.sendKeys(strPassword);
			}
		} catch (Exception e) {
			System.out.println("password can not found " + e.getMessage());
		}
		
	}
	
	//Click on login button
	public void clickLogin()
	{
		try {
			element = driver.findElement(login);
			if (element.isEnabled()) 
			{
				element.click();
			}
		} catch (Exception e) {
			System.out.println("login can not found " + e.getMessage());
		}
	}
	
	//Get LoginPage title
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	//Login method
	public void login(String strUserName, String strPassword)
	{
		//Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPassword);
		//Click Login button
		this.clickLogin();
	}
}
    
    
    
    
