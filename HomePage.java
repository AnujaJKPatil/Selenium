package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

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
	
	
}
