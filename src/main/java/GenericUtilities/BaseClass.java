package GenericUtilities;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	public JavaUtility jUtil = new JavaUtility();
	public ExcelFileUtility eutil = new ExcelFileUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public PropertyFileUtility pUtil = new PropertyFileUtility();

	public WebDriver driver = null;
	public static WebDriver sDriver;
	
	
}
