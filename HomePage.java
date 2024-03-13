package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUtils.WebDriverUtil;

public class HomePage extends WebDriverUtil{

	//Identify organization 
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement org;

	//Identify Contact
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contact;
	
//	//Identify Lead
//	@FindBy(xpath="(//a[text()='Leads'])[1]")
//	private WebElement leads;
		
	//Identify image
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement img;
	
	//Identify Sign out
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;

	public WebElement getOrg() {
		return org;
	}

	public WebElement getContact() {
		return contact;
	}

//	public WebElement getLeads() {
//		return leads;
//	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	public void home() {
		//Click on organization
		org.click();
	}
	
	public void home(WebDriver d) { 
		//Mouse hover in img
		mouseHover(d, img);
		
		//Click on sign out
		signout.click();
	}
	
}
