package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonUtils.BrowserFactory;
import commonUtils.ReadConfig;

public class AllDevice {
	
	public void AllDevices() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/all-devices\"]")).click();
	}
	
	public void CreateNewDevice() throws IOException, InterruptedException, AWTException {
		
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		String[] dname = {"Device A","Device B","Device C","Device D","Device E","Device F","Device G","Device H","Device I","Device J","Device K","Device L","Device M","Device N"};
		String[] model = {"1001","1002","1003","1004","1005","1006","1007","1008","1009","1010","1011","1012","1013","1014"};
		String[] serial = {"01","02","03","04","05","06","07","08","09","010","011","012","013","014"};
		String[] make = {"Lutron","Extech","Fluke","Testo","Lutron","Extech","Fluke","Testo","Lutron","Extech","Fluke","Testo","Lutron","Extech"};
		
		for(int i = 0; i<dname.length; i++) {
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[2]/div/button/span")).click();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[1]/div[1]/input").sendKeys(dname[i]);
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[1]/div[2]/input").sendKeys(model[i]);
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[2]/div[1]/input").sendKeys(serial[i]);
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[2]/div[2]/input").sendKeys(make[i]);
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[3]/div[1]/p-dropdown/div").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[3]/div[1]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		
		Actions builder = new Actions(BrowserFactory.LaunchBrowser());
		builder.sendKeys(Keys.END).build().perform();
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[4]/div[1]/p-dropdown/div").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[4]/div[1]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[4]/div[2]/p-dropdown/div").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[4]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[5]/div/textarea").sendKeys("Test accessories");
		Thread.sleep(500);
		WebElement datasheet = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[6]/div[1]/p-fileupload/span/input"));
		datasheet.sendKeys("D:\\avatar.png");
		Thread.sleep(500);
		WebElement uploadusermanual = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[6]/div[2]/p-fileupload/span/input"));
		uploadusermanual.sendKeys("D:\\avatar.png");
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[7]/div/input").sendKeys("https://www.youtube.com/embed/cWzGDEDVEgY");
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[3]/div[1]/button[1]").click();
		Thread.sleep(2000);
		builder.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		}
		
	}

}
