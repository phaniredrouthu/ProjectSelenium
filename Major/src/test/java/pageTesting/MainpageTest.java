package pageTesting;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.Base;
import com.pages.HomePage;
import com.pages.MainPage;
import com.pages.Util;


public class MainpageTest  extends Base{
	
	MainPage mainpage;
	HomePage homepage;
	
	public MainpageTest() throws Throwable {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws Throwable {
		
		
		Base.initialization();
		
		mainpage = new MainPage();
		
		
	}
	
	 
	
	@Test
	public void loginTest() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			homepage = mainpage.login("kumarphani30@gmail.com", "Password222!");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
			
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	@AfterMethod
	
	
		public void close() {
		
		driver.quit();
		
		
			
		}
	
	

}
