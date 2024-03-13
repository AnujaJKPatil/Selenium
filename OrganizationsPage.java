package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	//Identify create organization...(+)
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	WebElement createorg;

	public WebElement getCreateorg() {
		return createorg;
	}
	
	//Create a constructor to initialize the WebElement 
	public OrganizationsPage(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	
	//Create a method 
	public void Organizations() {
		//Click on create organization...(+) 
		createorg.click();
	}
}