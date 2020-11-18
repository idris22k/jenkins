package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalLibrary;

import org.junit.Assert;

public class LoginPage extends FunctionalLibrary  {

	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement txtUserName;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String log,String passWord) {
		type(getTxtUserName(),log);
		type(getTxtPassword(),passWord);
		click(btnLogin);
		WebElement findElement = driver.findElement(By.xpath("//b[contains(text(),'Invalid')]"));
		String text = findElement.getText();
		System.out.println(text);
		Assert.assertEquals("Invalid Login details or Your Password might have expired. Click here to reset your password", text);
	
	//close();
	}
	
	
}
