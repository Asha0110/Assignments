package com.test.pnt.PNT_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Draggable']")).click();
		driver.findElement(By.xpath("//*[text()='Droppable']")).click();
		
		driver.switchTo().frame(0); // switching to iframe
		WebElement dragged = driver.findElement(By.id("draggable"));
		WebElement Dropped = driver.findElement(By.id("droppable"));
		
		int sizes = driver.findElements(By.tagName("iframe")).size();// gives number of frames
		System.out.println(sizes);
		
		for(int index=0;index<sizes;index++) {
			
			System.out.println(index);
		}
		
		
		
		
		
		Actions action = new Actions(driver);
		action.dragAndDrop(dragged, Dropped).build().perform();
		Thread.sleep(5000);
		//driver.switchTo().defaultContent(); // switching back to parent drive.
		driver.switchTo().parentFrame(); // switching back to parent frame
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a")).click();
		driver.switchTo().frame(0);
		//WebElement resize = driver.findElement(By.id("resizable"));
		Thread.sleep(5000);
		WebElement  size = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		action.dragAndDropBy(size, 5000, 300);
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
