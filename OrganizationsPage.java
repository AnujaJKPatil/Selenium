package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationsPage {

	//Identify create organization...(+)
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	WebElement createorg;

	public WebElement getCreateorg() {
		return createorg;
	}
}