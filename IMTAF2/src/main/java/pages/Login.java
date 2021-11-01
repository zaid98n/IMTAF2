package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonUtils.BrowserFactory;


public class Login {
	
	public void setUsername(String data) throws IOException, InterruptedException  {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.id("username")).clear();
		BrowserFactory.LaunchBrowser().findElement(By.id("username")).sendKeys(data);
	}
	
	public void setPassword(String data) throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.id("password")).clear();
		BrowserFactory.LaunchBrowser().findElement(By.id("password")).sendKeys(data);
	}
	
	public void clickLogin() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/div[2]/form/p-button/button/span")).click();
		
		try {
		WebElement box = BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-login/p-confirmdialog/div/div[3]/p-footer/button[1]");
		box.isDisplayed();
			BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-login/p-confirmdialog/div/div[3]/p-footer/button[1]").click();
			System.out.println("Login alertbox clicked");
		}
		catch (Exception e) {
			System.out.println("No alert while login");
		}
	}
}	
