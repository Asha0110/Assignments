package pageObjectModelFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookHomepage {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Create new account']") WebElement CreatNewAccount;
	
	public FaceBookHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void createNewFbAccount() {
		CreatNewAccount.click();
	}
	
	
	
	
	
	

}// ending
