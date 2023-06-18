package GenericUtilities;

import java.util.Date;
import java.util.Random;

/**
 * This class consists of generic utilities related to java
 * @author Sanjot
 *
 */

public class JavaUtility {
	
	/**
	 * This method will give random number for every run
	 * @return
	 */
	
	public int getRandomNumber() {
		
		Random r=new Random();
		return r.nextInt(1000);
		
	}
	
	/**
	 * This method will generate system date
	 * @return
	 */
	public String getSystemDate() {
		
		Date d=new Date();
		return d.toString();
	}
	
	/**
	 * This method will generate system date in specific format 
	 * @return
	 */
	
	public String getSystemDateInFormat() {
		
		Date d=new Date();
		String[] dArr=d.toString().split(" ");
		String day=dArr[2];
		String month=dArr[1];
		String year=dArr[5];
		String time=dArr[3].replaceFirst(":", "-");
		String date=day+"-"+month+"-"+year+"-"+time;
		return date;
	}

}
