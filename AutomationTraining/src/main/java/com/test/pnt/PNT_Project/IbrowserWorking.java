package com.test.pnt.PNT_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IbrowserWorking {
	static WebDriver driver;
	// creating a object of chromedriver by taking reference to the webdriver interface.
	// chromedriver class implements all the methods of webdriver interface.

	public static void main(String[] args) throws InterruptedException {
		// webdriver is a interface 
		//String proPath = System.getProperty("user.dir");
		//System.out.println(proPath);
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.get("https://www.walmart.com/");
		driver.navigate().refresh();
		Thread.sleep(6000); // compile time exception
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		driver.close(); // only close current browser
		driver.quit(); // close all the open browser
	}

}
