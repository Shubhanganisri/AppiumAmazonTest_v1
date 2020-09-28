
package Test.AmazonTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.repository.Loginrepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Login extends baseClass {

	private AndroidDriver<AndroidElement> driver = null;
	private static String CLASS_NAME = "login.java";
	
	
	@BeforeMethod
	public void StartMethod() throws IOException
	{
		Reporter.log("Trace Enter: "+CLASS_NAME+"-"+"StartMethod()");
		Properties prop = ReadPropertyFiles.getGlobalPropertyObject();
		String appPackage = (String) prop.get("appPackage");
		String appActivity = (String) prop.get("appActivity");
		driver = Capabilities(appPackage, appActivity);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("Trace Exit: "+CLASS_NAME+"-"+"StartMethod()");

	}
		
		
		
		
		//xpath for inspecting elements
		//tagname[@atrribute="value"]
		
//Open login tab
		@Test
		public void PerformTest() throws IOException
		{
			Reporter.log("Trace Enter: "+CLASS_NAME+"-"+"PerformTest()");
			XSSFSheet sheet = ReadExcelSheet.getDataSheet();
			//iterating over excel file 
			Iterator<Row> itr = sheet.iterator();     
			
			itr.next(); // Skipping first row as it contains metadata
			while(itr.hasNext())                 
			{  
				Row row = itr.next();  
				//iterating over each column  
				Iterator<Cell> cellIterator = row.cellIterator(); 
				List<String> loginDataList = new ArrayList<String>();
				int i =0;
				while (cellIterator.hasNext())   
				{  
					Cell cell = cellIterator.next();
					String s = null;
					if(i==0)
					{
						DataFormatter df = new DataFormatter();
						s = df.formatCellValue(cell);
					}
					else
					{
						s = cell.getStringCellValue();
					}				 
					loginDataList.add(s); 
					i++;
				}
				login(driver, loginDataList.get(0),loginDataList.get(1));
			}
			}  
		
	
			@Test
			
		public void login(AndroidDriver<AndroidElement> driver, String phone_num, String name)
		{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		
		Reporter.log("Trace Enter: "+CLASS_NAME+"-"+"login()");

		Loginrepository loginObj=new Loginrepository(driver);
		loginObj.getSideBar().click();
		loginObj.getSignInBtn().click();
		
	
	
		//driver.hideKeyboard();
		loginObj.getEnterUserId().sendKeys(phone_num);
		loginObj.getContinueBtn().click();
		
		loginObj.getEnterPassword().sendKeys(name);
		loginObj.getLogInBtn().click();
		Reporter.log("Trace Exit: "+CLASS_NAME+"-"+"login()");
			
			
	
			
			
			
			
		
		//Enter login id credentials
		
//driver.findElementByClassName(prop.getProperty("Loginidbox").sendKeys(Loginid);
	//	driver.hideKeyboard();
		//driver.findElementByClassName("android.widget.Button").click();
		//driver.findElementById("in.amazon.mShop.android.shopping:id/action_bar_burger_icon").click();
		//driver.findElementByClassName("android.widget.ImageView").click();

		
		
		
		
		
			}
	



}
