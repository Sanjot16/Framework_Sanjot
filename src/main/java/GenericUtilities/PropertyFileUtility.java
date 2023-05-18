package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class consists of generic utilities related to property file
 * @author Sanjot
 *
 */

public class PropertyFileUtility {
	
	/**
	 * This method will read data from property file 
	 * @param key
	 * @throws IOException 
	 * @return
	 */
	

	public String readDataFromPropertyFile (String key) throws IOException {
		
		FileInputStream fis=new FileInputStream(ConstantsUtility.propertyFilePath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;

	}

}
