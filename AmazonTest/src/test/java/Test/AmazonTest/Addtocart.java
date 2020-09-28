package Test.AmazonTest;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Test.repository.Addtocartrepository;
import Test.repository.Searchresultpagerepository;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Addtocart extends baseClass{
	
	private AndroidDriver<AndroidElement> driver = null;
	private static String CLASS_NAME = "Searchresultpage.java";
	

	
	
	
	@Test
	public void Addtocarttab()
	{
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		
		Reporter.log("Trace Enter: "+CLASS_NAME+"-"+"Addtocarttab()");

		Addtocartrepository addtocartObj=new Addtocartrepository(driver);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector().description(\"Addtocart\"));"));
		
	addtocartObj.getCartBtn().click();
	driver.hideKeyboard();
		
		Reporter.log("Trace Exit: "+CLASS_NAME+"-"+"Addtocarttab()");

		

	}

}

	
