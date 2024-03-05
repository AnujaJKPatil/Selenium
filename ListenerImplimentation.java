package commonUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplimentation implements ITestListener {

	ExtentReports report;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" Testscript execution is started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" Testscript execution is passed", true);
		//Test
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		String message = result.getThrowable().toString();
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" Testscript execution is failed "+message , true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" Testscript execution is skipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

//		String methodName = result.getMethod().getMethodName();
//		Reporter.log("To start the execution", true);
	
		JavaUtil jutil = new JavaUtil();
		
		//Create the object of ExtentSparkReporter
		//Use ExtentSparkReporter class just to configure extent report
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extentreport/report"+jutil.getRandomNumber()+".html");
		
		//To give title to report
		reporter.config().setDocumentTitle("vtigercrm");
		
		//To set the theme for Extent report either standard or dark 
		reporter.config().setTheme(Theme.DARK);
		
		//To set name to your report
		reporter.config().setReportName("Pune");
		
		//Create the object of ExtentReports class to generate the report (call globally)
		report = new ExtentReports();
		
		//Call method called attachReporter to add all configurations to Extentreport
		report.attachReporter(reporter);
		
		report.setSystemInfo("OS", "Window");
		
		report.setSystemInfo("Browser", "Chrome");
		
		report.setSystemInfo("ChromeVersion", "122");
		
		report.setSystemInfo("Author", "Anuja");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
//		String methodName = result.getMethod().getMethodName();
//		Reporter.log("To finish the exection", true);
		
		report.flush();
		
	}

	
}
