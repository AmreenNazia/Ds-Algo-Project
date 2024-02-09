package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static  FileInputStream fis;
	public static Properties prop;
	private static String browserType = null; 
	
	public  Properties init_prop() throws IOException {
		prop  = new Properties();
		fis = new FileInputStream((System.getProperty("user.dir")+"/src/test/resources/ConfigFiles/config.properties"));
		prop.load(fis);
		return prop;
	}
	
	
	public static void setBrowserType(String browser) {
		browserType = browser;
	}
	public static String getBrowserType() throws Throwable {
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
}

	 
		
	

