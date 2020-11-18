package com.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.utilities.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends FunctionalLibrary {
WebDriver driver;
LoginPage loginpage;
SearchHotelPage SearchHotelPage;
	@Given("I am on the adactinhotelapp login page")
	public void i_am_on_the_adactinhotelapp_login_page() {
	driver = getDrive(); 
	loadUrl("http://adactinhotelapp.com/");
	
	
	
	}

	@When("I should enter invalid {string} and {string}")
	public void i_should_enter_invalid_and(String userName, String passWord) {
		LoginPage l =new LoginPage();
        l.login(userName, passWord);
        
	}

	@When("user should serach hotel  using {string},{string},{string},{string},{string},{string},{string},{string}")
  public void userShouldSerachHotelUsingSuperDeluxe(String string, String string2, String string3, String string4, String string5, String string6, String string7,String string8) {
	  
	}
	@Then("I should select Hotel")
	public void i_should_select_Hotel() {

	}
	
	
}
