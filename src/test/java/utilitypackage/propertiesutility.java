package utilitypackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesutility {
	
	public static String getData(String Key) throws IOException {
		
		//Create file class Object
		File file = new File("C:\\Users\\Bushra Anjum\\OneDrive\\Desktop\\Testing Workspace\\TestData.properties");
		
		//Create FileReader class object.
		
		FileReader reader = new FileReader(file);
		//Properties class object.
		Properties prop = new Properties();
		//Load properties file.
		prop.load(reader);
		//call getValue()
		return (String) prop.get(Key);
	}

}
