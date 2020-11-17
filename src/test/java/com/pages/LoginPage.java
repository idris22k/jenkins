package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalLibrary;

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
	close();
	}
	
	
}
