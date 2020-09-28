package Test.AmazonTest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.repository.Loginrepository;
import Test.repository.Logoutrepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Logout extends baseClass {
	
	private AndroidDriver<AndroidElement> driver = null;
	private static String CLASS_NAME = "Logout.java";
	
	@Test
	public void logout()
	{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Reporter.log("Trace Enter: "+CLASS_NAME+"-"+"logout()");

	Logoutrepository logoutObj=new Logoutrepository(driver);
	logoutObj.getSideBar().click();
	logoutObj.getSettings().click();
	logoutObj.getSignOutBtn().click();
	logoutObj.getConfirmBtn().click();
	Reporter.log("Trace Exit: "+CLASS_NAME+"-"+"Logout()");
	
	}
}
