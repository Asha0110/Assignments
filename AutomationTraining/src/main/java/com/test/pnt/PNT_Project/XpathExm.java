package com.test.pnt.PNT_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExm { 
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement EmailAbsXpath = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		EmailAbsXpath.sendKeys("asha");
		Thread.sleep(5000);
		//WebElement passwordElm = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		WebElement passwordElm= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passwordElm.sendKeys("abc123");
		Thread.sleep(5000);
		//WebElement logbtnElm  = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		WebElement logBtn = driver.findElement(By.xpath("//button[@name='login']")); // relative xpath
		logBtn.click();
		
		
		
		
		
		Thread.sleep(5000);
	}

}
