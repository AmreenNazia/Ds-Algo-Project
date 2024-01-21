package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private FileInputStream fis;
	private Properties prop;
	
	public Properties init_prop() throws IOException {
		
		prop  = new Properties();
    is = new FileInputStream((System.getProperty("user.dir")+"/src/test/resources/ConfigFiles/config.properties"));
		prop.load(fis);
		 return prop;
		}
	

	}
	
		
	
}

