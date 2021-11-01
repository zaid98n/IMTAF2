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
	
//	@Test
//	public void TC003_CheckSearch() throws IOException, InterruptedException, AWTException {
//		device.Search();
//	}
//	
//	@Test
//	public void TC004_CheckFilters() throws IOException, InterruptedException, AWTException {
//		device.Filters();
//	}
//	
//	@Test
//	public void TC005_CheckDownloadCalDetails() throws IOException, InterruptedException, AWTException {
//		device.DownloadCalDetails();
//	}
//	
//	@Test
//	public void TC006_CheckDeviceDetails() throws IOException, InterruptedException, AWTException {
//		device.DeviceDetails();
//	}
//	
//	@Test
//	public void TC007_Feedback() throws IOException, InterruptedException, AWTException {
//		device.feedback();
//	}

}
