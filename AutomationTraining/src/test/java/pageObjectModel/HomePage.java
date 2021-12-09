package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement Sign;

	public HomePage(WebDriver driver) { // created param PageFactory constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signToClick() {
		Sign.click();
	}

}
