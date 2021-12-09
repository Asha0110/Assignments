package com.test.pnt.PNT_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExm {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement alertbtn = driver.findElement(By.id("confirmButton"));
		alertbtn.click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		alertbtn.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
//		WebElement promtBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
//		promtBtn.click();
//		driver.switchTo().alert().sendKeys("abc");
		driver.close();
	}

}
