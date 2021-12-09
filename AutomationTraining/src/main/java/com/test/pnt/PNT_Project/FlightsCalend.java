package com.test.pnt.PNT_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightsCalend {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		WebElement flight = driver.findElement(By.xpath("//*[text()='Flights']"));
		flight.click();
		
		WebElement returnDate= driver.findElement(By.id("d2-btn"));
		returnDate.click();
		Thread.sleep(5000);
		WebElement datepic = driver.findElement(By.xpath("//button[@aria-label = 'Dec 29, 2021']"));
		datepic.click();
		Thread.sleep(5000);
		
		
		driver.close();

	}

}
