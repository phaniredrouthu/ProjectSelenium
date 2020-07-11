package com.pages;

import org.openqa.selenium.By;

public class HomePage extends Util{
	
	public HomePage homepage;
	
	public Util util;

	public HomePage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	
	By Contactpage = By.xpath("//span[contains(text(),'Contacts')]");
	
	By Calendarpage = By.xpath("//span[contains(text(),'Calendar')]");
	
	
	
	// Actions 
	
	//Leads to contacts page:
	
	public ContactsPage contactPage() throws Throwable {
		
		util.click(Contactpage);
		return new ContactsPage();
		
	}
	//Leads to calendar page:
	
	public CalendarPage calendarPage() throws Throwable {
		
		util.click(Calendarpage);
		return new CalendarPage();
		
	}
}
