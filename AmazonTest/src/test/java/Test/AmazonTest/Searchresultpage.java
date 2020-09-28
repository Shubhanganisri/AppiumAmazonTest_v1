package Test.AmazonTest;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Test.repository.Homepagerepository;
import Test.repository.Searchresultpagerepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Searchresultpage extends baseClass {
	
	

	private AndroidDriver<AndroidElement> driver = null;
	private static String CLASS_NAME = "Searchresultpage.java";
	
	
	@Test
	public void Searchresultpage()
	{
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		
		Reporter.log("Trace Enter: "+CLASS_NAME+"-"+"searchresultpage()");

		Searchresultpagerepository searchresultObj=new Searchresultpagerepository(driver);
		
		searchresultObj.getProductList();
		searchresultObj.getProductNameElement();
		
		//searchresultObj.fetchProductName(element);
		//searchresultObj.fetchProductPrice(element);
		
		
		
		Reporter.log("Trace Exit: "+CLASS_NAME+"-"+"searchresultpage()");


	}

}
