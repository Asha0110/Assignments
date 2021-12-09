package com.test.pnt.PNT_Project;

import org.testng.annotations.Test;

import pageObjectModel.CreateAccountPage;
import pageObjectModel.HomePage;
import pageObjectModel.SignInPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignInAmazon {
	public static WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		HomePage Hp = new HomePage(driver);
		Thread.sleep(5000);
		Hp.signToClick();
		SignInPage Sp = new SignInPage(driver);
		Thread.sleep(5000);
		// Sp.sendEmail();
		// Sp.clickContinue();
		Sp.creatAccount();
		
		CreateAccountPage Ca = new CreateAccountPage(driver);// creating object of createAccountPage
		Thread.sleep(3000);
		Ca.sendYourName();
		Ca.sendEmail();
		Ca.sendPassWord();
		Ca.reSendPassWord();
		Ca.clickContinueBtn();
		Thread.sleep(3000);

	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asha_\\eclipse-workspace_PNT\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {

		driver.close();
	}

}
