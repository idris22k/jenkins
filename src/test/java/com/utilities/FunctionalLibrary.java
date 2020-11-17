package com.utilities;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {
public static WebDriver driver;

public WebDriver getDrive() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User1\\cucumber\\CucumberClass8AM\\driver\\chromedriver.exe");
return driver = new ChromeDriver();

}

public void loadUrl(String url) {
	driver.get(url);
	implicitWait();
	maximize();
}

public void maximize() {
	driver.manage().window().maximize();

}
public void implicitWait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

public void type(WebElement element,String data ) {
	element.sendKeys(data);

}

public void click(WebElement element) {
	element.click();

}	

public void quit() {
	driver.quit();

}

public void close() {
	driver.close();

}

public void typejs(WebElement element,String data) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('value','" + data +"')", element);
}

public void clickJs(WebElement element,String data) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", element);
}

public void selectByText(WebElement element,String data) {
Select s = new Select(element);
s.selectByVisibleText(data);
}


public void selectByValue(WebElement element,String data) {
	Select s = new Select(element);
	s.selectByValue(data);


}

public void selectByIndex(WebElement element,int number) {
	Select s = new Select(element);
	s.selectByIndex(number);

}


public String getText(WebElement element) {
return element.getText();

}

public String getTitle(WebElement element) {
return	driver.getTitle();


}


public String getUrl() {
return	driver.getCurrentUrl();
	
}

public void switchToWindow(String window) {
	if (window.equals("parentwindow")) {
		String pWid = driver.getWindowHandle();
	Set<String>alltwindows = driver.getWindowHandles();
	List<String> lstwindows = new ArrayList<String>();
	lstwindows.addAll(alltwindows);
	driver.switchTo().window(lstwindows.get(0));
	}
	else if(window.equals("childwindow"))
	
	{
		String pWid = driver.getWindowHandle();
	
	Set<String>alltwindows = driver.getWindowHandles();
	List<String> lstwindows = new ArrayList<String>();
	lstwindows.addAll(alltwindows);	
	driver.switchTo().window(lstwindows.get(1));
	}
	else {
System.err.println("not matching");		
	}	

}

public void switchToFrameByIndex(int number) {
	driver.switchTo().frame(number);

}


public void switchToFrameByIdName(String text) {
	
	driver.switchTo().frame(text);
}

public void switchToChildWindow() {

	String pWid = driver.getWindowHandle();
Set<String> allWindows = driver.getWindowHandles();
List<String> 	lstWindows = new ArrayList<String>();
lstWindows.addAll(allWindows);
driver.switchTo().window(lstWindows.get(1));


}
public void switchToFrameByElement(WebElement element) {

	driver.switchTo().frame(element);

}

public  String getCurrentWindowId() {
	
return	driver.getWindowHandle();
}

public void switchToParentWindow() {
String pWid = driver.getWindowHandle();
driver.switchTo().window(pWid);
}

}

