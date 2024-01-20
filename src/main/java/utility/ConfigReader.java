package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	
	private Properties prop;
	
	public Properties init_prop() throws IOException {
		
		prop  = new Properties();
		FileInputStream fis = new FileInputStream("/Users/amreennaziasyed/eclipse-workspace/Ds-Algo/src/test/resources/ConfigFiles/config.properties");
		prop.load(fis);
		return prop;
		
	}
	
		
	
}

