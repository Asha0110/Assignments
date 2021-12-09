package com.test.pnt.PNT_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExm {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));
		searchIcon.click();
		Thread.sleep(5000);
		WebElement BestSellerElm = driver.findElement(By.linkText("Best Sellers"));
		BestSellerElm.click();
		Thread.sleep(5000);
		 WebElement epicParLinkElm = driver.findElement(By.partialLinkText("Epic"));
		 epicParLinkElm.click();
		 Thread.sleep(5000);
		WebElement searchFieldElm =  driver.findElement(By.name("field-keywords"));
		searchFieldElm.sendKeys("computer");
		searchFieldElm.click();
		 Thread.sleep(5000);
		
		driver.close();

	}

}
