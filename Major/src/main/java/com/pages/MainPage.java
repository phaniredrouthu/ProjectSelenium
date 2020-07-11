package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Util{
	
	public MainPage() throws Throwable {
		
		super();
		
	}
	
	
	
	//Page Locators
	
	By logo = By.tagName("Selenium Easy");
	
	By inputforms = By.xpath("//ul//li[@class=\"dropdown open\"]");
	
	By username = By.name("email");
	By password = By.name("password");
	By login = By.xpath("//div[contains(text(),'Login')]");
	
	
	
	//Page Actions
	
	public void   getInputforms() {
		click(inputforms);
		
	}
	
	public HomePage login(String user , String pwd) throws Throwable {
		
		sendText(user , username );
		sendText(pwd, password);
		click(login);
		
		return new HomePage();
		

		}
}





	
	
	
	
	
	
	
	
