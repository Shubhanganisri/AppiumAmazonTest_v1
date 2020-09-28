package Test.AmazonTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Test.repository.Loginrepository;
import Test.repository.Productssearchrepository;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Productspage extends baseClass {
	
	private AndroidDriver<AndroidElement> driver = null;
	private static String CLASS_NAME = "Productspage.java";
	
	@Test
	
	public void scrolldown()
	{
		//driver.findElementById("").get(3).click();
		
		AndroidElement list=(AndroidElement)driver.findElementById("");
		MobileElement listitem=(MobileElement)driver.findElement
	(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector().description(\"TCL\"));"));
		listitem.click();
	}
	public void searchproduct()
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		
		Reporter.log("Trace Enter: "+CLASS_NAME+"-"+"searchproduct()");

		Productssearchrepository productObj=new Productssearchrepository(driver);
		
			
		productObj.getAddToCartBtn().click();
		

		Reporter.log("Trace Exit: "+CLASS_NAME+"-"+"searchproduct()");


	}

}
