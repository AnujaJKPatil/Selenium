package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUtils.WebDriverUtil;

public class OrganizationInfoPage {

	WebDriverUtil wutil = new WebDriverUtil();
	
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
	
	//Create a constructor to initialize the WebElement 
	public OrganizationInfoPage(WebDriver d){
		PageFactory.initElements(d, this);
	}
	
	//Create a method
	public void OrganizationInfo(String Orgnamedata, String groupdata) {
		//Enter Organization name
		OrganizationNameTf.sendKeys(Orgnamedata);
		
		//Click on group radio button
		groupbtn.click();
		
		//Select support group in the drop down
		wutil.handleDropdown(dropdown, groupdata);
		
		//Click on Save button
		savebtn.click();
	}
}
