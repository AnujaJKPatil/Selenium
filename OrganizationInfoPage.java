package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationInfoPage {

	//Identify Organization name
	@FindBy(name="accountname")
	private WebElement OrganizationNameTf;

	public WebElement getOrganizationNameTf() {
		return OrganizationNameTf;
	}
	
	//Identify group radio button
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement groupbtn;

	public WebElement getGroupbtn() {
		return groupbtn;
	}
	
	//Identify the dropdown
	@FindBy(name="assigned_group_id")
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}
	
	//Identify save button
	@FindBy(xpath="(//input[@name='button'])[1]")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
}
