package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	
	private Properties prop;
	
	public Properties init_prop() throws IOException {
		
		prop  = new Properties();
		FileInputStream fis = new FileInputStream("/Users/binnyjayakumaremily/git/ds-algo/src/test/resources/ConfigFiles/config.properties");
		prop.load(fis);
		return prop;
		
	}
	
		
	
}

