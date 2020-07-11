package com.pages;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	
	
	  public Base() throws Throwable {
	  
	  FileInputStream reader = new
	  FileInputStream("C:\\Users\\kumar\\eclipse-workspace\\Major\\prop.properties"
	  ); prop = new Properties(); prop.load(reader);
	  
	  
	  }
	 
	// Opening the required browser

	public static void initialization() {

		
		  String browsername = prop.getProperty("Browser");
		  
		  //ChromeDriver
		  
		  if(browsername.equalsIgnoreCase("chrome")) {
		 

		
		  System.setProperty("webdriver.chrome.driver",
		  "./chromedriver/chromedriver.exe");
		  
		  driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Util.Implicit_Wait_Time,
		  TimeUnit.SECONDS);
		  
		  driver.get("https://ui.freecrm.com/");
		 

	}
	}
}
	

