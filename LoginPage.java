package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//Identify user name tf
	@FindBy(name="user_name")
	private WebElement usernametf;
	
	//Identify password tf
	@FindBy(name="user_password")
	private WebElement passwordtf;
	
	//Identify login button
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsernametf() {
		return usernametf;
	}

	public WebElement getPasswordtf() {
		return passwordtf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
}
