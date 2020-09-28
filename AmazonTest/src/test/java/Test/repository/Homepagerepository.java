package Test.repository;


import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepagerepository {

	
public Homepagerepository(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

@AndroidFindBy(className ="android.widget.EditText")
private AndroidElement searchField;

public AndroidElement getSearchField() {
	return searchField;
}

}


