package vTiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GenericUtilities.WebDriverUtility;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class HomePage extends WebDriverUtility{
	
	//declaration
	@FindBy(linkText="Organiation")
	private WebElement OrganizationsLnk;
	
	@FindBy(linkText = "Contacts")
	private WebElement ContactsLnk;
	
	@FindBy(linkText = "Opportunities")
	private WebElement OpportunitiesLnk;
	
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdministratorImg;
	
	@FindBy (linkText = "Sign out")
	private WebElement SignOutLnk;
	
	//Initialization
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getOrgnaizationsLnk() {
		return OrganizationsLnk;
	}
	
	public WebElement getContactsLnk() {
		return ContactsLnk;
	}
	
	public WebElement getOpportunitisLnk() {
		return OpportunitiesLnk;
	} 
	
	public WebElement getAdministratorImg() {
		return AdministratorImg;
	}
	
	public WebElement getSignOutlnk() {
		return SignOutLnk;
	}
	
	//BUsiness Library
	/**
	 * This method will click on organizations link
	 */
	
	public void clickOnOrgLink() {
		OrganizationsLnk.click();
		}
	
	/**
	 * This method will click on conatcts link
	 */
	
	public void clickOnContactsLnk() {
		ContactsLnk.click();
	}
	
	/**
	 * This method will perform signout operation
	 */
	
	public void logOutOfApp() {
		SignOutLnk.click();
	}
}
