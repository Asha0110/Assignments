package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	public WebDriver driver;
	
	@FindBy(css = "#ap_customer_name") WebElement name; // locating all the webelements for the create account page
	//@FindBy(css = "#ap_email")WebElement email;
	@FindBy(id = "ap_email") WebElement email; 
	@FindBy(css = "#ap_password") WebElement passWord;
	@FindBy(id = "ap_password_check") WebElement reEnterPass;
	@FindBy(id = "continue") WebElement contBtn;
	
	
	public CreateAccountPage( WebDriver driver) { // creating Pagefactory constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void sendYourName() { // method rto send name
		name.sendKeys("Hope");
	}
	
	public void sendEmail() {
		email.sendKeys("hope@gamil.com");
	}
	public void sendPassWord() {
		passWord.sendKeys("abc123");
		
	}
	public void reSendPassWord() {
		reEnterPass.sendKeys("abc123");
	}
	public void clickContinueBtn() {
		contBtn.click();
	}
}
