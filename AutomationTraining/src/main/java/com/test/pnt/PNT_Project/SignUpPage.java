package com.test.pnt.PNT_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement creatAccount = driver.findElement(By.xpath("//*[text()='Create new account']"));
		creatAccount.click();
		Thread.sleep(5000);

		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("hope");
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("shreth");
		//WebElement phoneNo = driver.findElement(By.xpath("//input[@id='u_k_g_/M']"));
//		WebElement phoneNo = driver.findElement(By.xpath("//*[contains(text(), 'Mobile number or email')]"));
//		phoneNo.sendKeys("123456780");
		WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newPassword.sendKeys("abc123");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s = new Select(month); // select class
		s.selectByValue("3");
		WebElement brirtday = driver.findElement(By.name("birthday_day"));
		Select sl = new Select(brirtday);
		sl.selectByVisibleText("4");

		// WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		WebElement year = driver.findElement(By.name("birthday_year"));

		Select se = new Select(year);
		// se.selectByIndex(3);
		se.selectByValue("2020");
		// se.selectByVisibleText("2019");
		Thread.sleep(5000);

		 //WebElement gender = driver.findElement(By.xpath("//*[contains(text(), 'Female')]"));
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[1]"));// creating xpath using grouping
		// WebElement gender = driver.findElement(By.xpath("//*[contains(text(), 'Male')]"));
		//WebElement gender = driver.findElement(By.xpath("//*[contains(text(), 'Custom')]"));
		gender.click();
//		Thread.sleep(5000);
//		WebElement selectPronoun = driver.findElement(By.xpath("//select[@id= 'js_5m4']"));
//		Select slect = new Select(selectPronoun);
//		slect.selectByIndex(0);
		//slect.selectByVisibleText("She: \"Wish her a happy birthday!\"");
		WebElement signUp = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signUp.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
