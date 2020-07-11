package pageTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import io.appium.java_client.windows.WindowsDriver;

public class NotepadAppTest  {
	
	public static WindowsDriver windriver;
	
	
	@BeforeMethod
	public  void setUp() {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("Application", "C:\\Windows\\System32\\notepad.exe");
		/*
		 * cap.setCapability("apparguments", "testfile.txt");
		 * cap.setCapability("directory", "C:\\sample\\");
		 */
		
		try {
			windriver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		windriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
	}
		
		
	
	
	
	@Test
	
	public void sample() {
		windriver.findElementByName("View");
		
		
	}
	
	@AfterMethod
	
	public  void tearDown() {
		
		windriver.close();
		setUp();
	}

}
