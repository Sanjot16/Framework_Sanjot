package vTiger.Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import GenericUtilities.ExcelFileUtility;
import GenericUtilities.JavaUtility;
import GenericUtilities.PropertyFileUtility;
import GenericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoScript {

	public static void main(String[] args) throws IOException {
	
		//Create object of all utilities
		JavaUtility jUtil=new JavaUtility();
		PropertyFileUtility pUtil=new PropertyFileUtility();
		ExcelFileUtility eUtil=new ExcelFileUtility();
		WebDriverUtility wUtil=new WebDriverUtility();
		
		//Read all the required data
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		String ORGNAME = eUtil.readDataFromExcel("Organization", 1, 2)+jUtil.getRandomNumber();

		WebDriver driver=null;
		
		//step 1 : Launch the browser-RUNTIME POLYMORPHISM
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			
			driver=new ChromeDriver(chromeOptions);	//driver is initialised to chrome
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	//driver is initialised to firefox
		}
		else {
			
			System.out.println("Invalid browser name");
		}
		
		wUtil.maximizeWindow(driver);
		wUtil.waitForPageLoad(driver);
		driver.get(URL);
		
		//Step 2 : Login to app
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
	}

}
