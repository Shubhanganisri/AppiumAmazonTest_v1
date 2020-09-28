package Test.AmazonTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFiles {

	public static Properties getGlobalPropertyObject() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/utilities/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String device=(String)prop.get("device");
		return prop;
	}

}
