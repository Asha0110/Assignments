package com.test.pnt.PNT_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExm {
public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob = new Actions(driver);
		WebElement sigin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(sigin).build().perform();
		WebElement books = driver.findElement(By.linkText("Kindle Unlimited"));
		ob.moveToElement(books).click().build().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
