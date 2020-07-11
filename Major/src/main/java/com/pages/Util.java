package com.pages;
import org.openqa.selenium.By;

public class Util extends Base {
	
	
	public Util() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long Implicit_Wait_Time = 30;
	public static long page_Load_Time = 30;
	
	
	//generic methods
	
	public void click(By locator) {
		driver.findElement(locator);
	}
	
	public void sendText(String text, By locator) {
		driver.findElement(locator).sendKeys(text);
		
	}
	
	public String getText(By locator) {
		
		return driver.findElement(locator).getText();
	}
		
		 
		
		
		

}
