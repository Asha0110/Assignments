package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;

	@FindBy(name = "email") // located webelement 
	WebElement Email;
	@FindBy(id = "continue") WebElement ContinueBtn;
	@FindBy(css = "#createAccountSubmit") WebElement cretAccount;

	public SignInPage(WebDriver driver) { // Pagefactory constructor created
		this.driver = driver;
		PageFactory.initElements(driver, this); // its reinitialize driver and all webelemets
	}
	
	public void sendEmail() { // method created 
		Email.sendKeys("ash@gmail.com");
	}
	
	public void clickContinue() {
		ContinueBtn.click();
	}
	
	public void creatAccount() {
		cretAccount.click();
	}

}
