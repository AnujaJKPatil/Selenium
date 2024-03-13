package basicPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import commonUtils.ExcelUtil;
import commonUtils.JavaUtil;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;
import pom.HomePage;
import pom.LoginPage;
import pom.OrganizationInfoPage;
import pom.OrganizationsPage;

public class BasePage {

	public static WebDriver d;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		//Object creation
		PropertyFileUtil putil = new PropertyFileUtil();
		ExcelUtil eutil = new ExcelUtil();
		WebDriverUtil wutil = new WebDriverUtil();
		JavaUtil jutil = new JavaUtil();
		
		
		String browser = putil.getDataFrompropertyFile("Browser");
		String url = putil.getDataFrompropertyFile("Url");
		String username = putil.getDataFrompropertyFile("Username");
		String password = putil.getDataFrompropertyFile("Password");
		
		//To read data from excel file
		String orgname = eutil.getDataFromExcel("Organizations", 0, 1);
		String drop = eutil.getDataFromExcel("Organizations", 1, 1);
		
		//To launch the browser
		if(browser.equals("Chrome")) {
			d = new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			d =  new EdgeDriver();
		}
		else {
			d = new FirefoxDriver();
		}
		
		//To launch the application
		d.get(url);
		
		//To maximize the browser
		d.manage().window().maximize();
		
		//Create object of LoginPage
		LoginPage lp = new LoginPage(d);
		
		lp.login(username, password);
		
		//To initialize webElements 
		//PageFactory.initElements(d, lp);
		
		
		//Enter user name
//		lp.getUsernametf().sendKeys(username);
//	
//		//Enter password
//		lp.getPasswordtf().sendKeys(password);
	
		//Click on login
		//lp.getLoginbtn().click();
	
		
		//Create object of HomePage
		HomePage hp = new HomePage(d);
		
		//To initialize webElements
		//PageFactory.initElements(d, hp);
		
		//Click on organization
		//hp.getOrg().click();
		hp.home();
		
		
		//Create object of OrganizationsPage
		OrganizationsPage op = new OrganizationsPage(d);
		//PageFactory.initElements(d,op);
		
		//Click on create organization...(+) 
		//op.getCreateorg().click();
		op.Organizations();
		
		
		//Create object of OrganizationInfoPage 
		OrganizationInfoPage oip = new OrganizationInfoPage(d);
		//PageFactory.initElements(d, oip);
		
		//To enter organization name
		//oip.getOrganizationNameTf().sendKeys(orgname+jutil.getRandomNumber());
		oip.OrganizationInfo(orgname+jutil.getRandomNumber(), drop);
		
		//Click on group radio button
		//oip.getGroupbtn().click();
		
		
		//Select support group in the drop down
		//wutil.handleDropdown(oip.getDropdown(), drop);
		
		
		//Click on Save button
		//oip.getSavebtn().click();
		
		
		Thread.sleep(2000);
		
	
		//Mouse hover on img
//		wutil.mouseHover(d, hp.getImg());
		hp.home(d);

		//Click on Sign out button
		//hp.getSignout().click();
		
	}

}
