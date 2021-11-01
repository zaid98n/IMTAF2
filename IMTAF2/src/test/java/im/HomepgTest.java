package im;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import commonUtils.BrowserFactory;
import commonUtils.Screenshot;
import pages.Login;

public class HomepgTest {
	
	Login login = new Login();
	
	static Date currentdate = new Date();
	static String fname = currentdate.toString().replace(" ","_").replace(":","-");
	@AfterMethod 
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException, InterruptedException { 
		String methodname = testResult.getName();
		if (testResult.getStatus() == ITestResult.FAILURE) { 
			Screenshot.capture(BrowserFactory.LaunchBrowser(), (methodname+"_"+fname));
		} 
	}
	
	@Test
	public void TC001_LaunchURL() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser();
	}
	
	@Test
	public void TC002_Login() throws Exception {
		login.setUsername("dazaid01");
		login.setPassword("JuZ!UNDZze");
		login.clickLogin();
		Thread.sleep(4000);
		BrowserFactory.LaunchBrowser().manage().deleteAllCookies();
	}

}
