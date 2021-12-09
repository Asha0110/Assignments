package com.test.pnt.PNT_Project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindownHandlesExm {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		WebElement books = driver.findElement(By.linkText("Kindle Books"));
		Actions ob = new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		books.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		
		String currentWindow = driver.getWindowHandle(); // this will handle current(parent) window
		System.out.println(currentWindow);
		
		
		Set<String> windowhandles = driver.getWindowHandles();// this will get all the windows of open window. parent as well child window
		Iterator<String> it = windowhandles.iterator(); // gives values in sequence
		it.hasNext();
		String parentWindow = it.next();
		System.out.println("This is parent window: " + parentWindow);
		String ChildWindow = it.next();
		System.out.println("This is ChildWindow : " + ChildWindow);
		driver.switchTo().window(ChildWindow);
		
		WebElement exclusive = driver.findElement(By.linkText("Kindle Exclusives"));
		exclusive.click(); 
		 
		
		
	}

}
