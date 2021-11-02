package im;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import commonUtils.BrowserFactory;
import commonUtils.Screenshot;
import pages.AllDevice;

public class AllDeviceTest {
	
	AllDevice device = new AllDevice();
	
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
	public void TC001_ClickAllDevice() throws IOException, InterruptedException {
		device.AllDevices();
	}
	
	@Test
	public void TC002_CreateNewDevice() throws IOException, InterruptedException, AWTException {
		device.CreateNewDevice();
	}

}
