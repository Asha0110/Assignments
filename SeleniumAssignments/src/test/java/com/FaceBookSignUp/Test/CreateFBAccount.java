package com.FaceBookSignUp.Test;

import org.testng.annotations.Test;
import pageObjectModelFB.FaceBookHomepage;
import pageObjectModelFB.FaceBookSignUpPage;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CreateFBAccount {

	public WebDriver driver;

	@Test
	public void CreateAcountTest() throws InterruptedException {
		FaceBookHomepage FbOb = new FaceBookHomepage(driver);
		FbOb.createNewFbAccount();
		Thread.sleep(1000);
		FaceBookSignUpPage ob = new FaceBookSignUpPage(driver);
		ob.sendFname();
		ob.sendLname();
		ob.sendPhoneNo();
		ob.sendPassWord();
		ob.selectBMonth();
		ob.selectBDay();
		ob.selectBYear();
		ob.selectGender();
		Thread.sleep(5000);
		ob.clickSignUp();
		Thread.sleep(2000);

	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterMethod() {

		driver.close();
	}

}
