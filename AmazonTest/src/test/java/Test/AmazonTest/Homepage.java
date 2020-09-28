package Test.AmazonTest;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Test.repository.Homepagerepository;
import Test.repository.Loginrepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Homepage extends baseClass{
	


	private AndroidDriver<AndroidElement> driver = null;
	private static String CLASS_NAME = "Homepage.java";
	
	
	@Test
	public void searchelement()
	{
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		
		Reporter.log("Trace Enter: "+CLASS_NAME+"-"+"searchelement()");

		Homepagerepository searchObj=new Homepagerepository(driver);
		
searchObj.getSearchField().sendKeys("65-inch TV");
Reporter.log("Trace Exit: "+CLASS_NAME+"-"+"searchelement()");


	}
}
