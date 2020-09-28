package Test.AmazonTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class baseClass
{
  
    	public static AndroidDriver<AndroidElement> Capabilities(String appPackage,String appActivity) throws MalformedURLException {
    		// TODO Auto-generated met
    		
    		System.out.println("Start");
    	
    	
    		DesiredCapabilities cap=new DesiredCapabilities();
    		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
    		//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
    		cap.setCapability(MobileCapabilityType.NO_RESET, true);
    	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,appPackage);
    	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,appActivity);
    	cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
    		cap.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES,true);
    		
    		
    		
    		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	    return driver;
    	  
    	    

    		
    	
    	}
}

