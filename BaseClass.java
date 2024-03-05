package commonUtils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

   public  WebDriver d= new ChromeDriver();
	PropertyFileUtil pu=new PropertyFileUtil();
	WebDriverUtil wu = new WebDriverUtil();
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("connet to database");
		
	}
	
	@BeforeClass
	public void BC() throws IOException
	{
		//@BeforeClass is used to launch application
		String url = pu.getDataFrompropertyFile("Url");
		
		//WebDriver driver = new ChromeDriver();
		//to maximize the window
		wu.maximize(d);
		//to apply wait for find element
		wu.implicitwait(d);
		
		  //to launch the application
			d.get(url);
	}
	
	@BeforeMethod
	public void BM() throws IOException
	{
		//@BeforeMethod is used to login to the application
		
		 String user = pu.getDataFrompropertyFile("Username");
		 String pass = pu.getDataFrompropertyFile("Password");
		  
		  d.findElement(By.name("user_name")).sendKeys(user);
		  d.findElement(By.name("user_password")).sendKeys(pass);
		  d.findElement(By.id("submitButton")).click();
		   
		
	}
	
	@AfterMethod()
	public void AM() throws InterruptedException
	{
		//@AfterMethodis used to logout/Sign out from the application
		
		Thread.sleep(2000);
		WebElement img = d.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		wu.mouseHover(d, img);
		//click on sign out
		d.findElement(By.xpath("//a[text()='Sign Out']")).click();

		
	}
	
	@AfterClass
	public void AC()
	{
		//@AfterClass is used to close the browser
		d.quit();
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("Disconnect from database");
	}
	
	
	
	
	
	
}
//public class BaseClass {
//
//	public WebDriver d = new ChromeDriver(); 
//	
//	WebDriverUtil wutil = new WebDriverUtil();
//	PropertyFileUtil putil = new PropertyFileUtil();
//	
//	@BeforeSuite
//	public void bs() {
//		
//		System.out.println("Connect to Database");
//	}
//	
//	@BeforeClass
//	public void bc() throws IOException{
//		//@BeforeClass is used to launch the application
//		
//		String url = putil.getDataFrompropertyFile("Url");
//		
//		//WebDriver d = new ChromeDriver();
//		
//		//To maximize the window
//		wutil.maximize(d);
//		
//		//To apply wait for findElement method
//		wutil.implicitwait(d);
//		
//		//To launch the application
//		d.get(url);
//		
//	}
//	
//	@BeforeMethod
//	public void bm() throws IOException {
//		//@BeforeMethod id used to login to the application
//		
//		WebDriver d = new ChromeDriver();
//		String username = putil.getDataFrompropertyFile("Username");
//		String pass = putil.getDataFrompropertyFile("Password");
//		
//		//Login to application
//		//ENTER USERNAME PASSWORD AND LOGIN 
//		d.findElement(By.name("user_name")).sendKeys(username);
//		d.findElement(By.name("user_password")).sendKeys(pass);
//		d.findElement(By.id("submitButton")).click();
//	}
//	
//	@AfterMethod
//	public void am() throws InterruptedException {
//		//@AfterMethod is used to logout(Sign out) from the application
//		
//		WebDriver d = new ChromeDriver();
//		Thread.sleep(2000);
//		
//		//Mouse hover on Administrator
//		WebElement img = d.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
//		
//		wutil.mouseHover(d, img);
//		
//		//Click on Sign out
//		d.findElement(By.xpath("//a[text()='Sign Out']")).click();
//	}
//	
//	@AfterClass
//	public void ac(){
//		//@AfterClass is used to close the browser
//		WebDriver d = new ChromeDriver();
//		d.quit();
//	}
//	
//	@AfterSuite
//	public void as() {
//		
//		System.out.println("Disconnect from Database");
//	}
//	
//}
