package page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	public Login (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//li[@class='authorization-link']")
	WebElement signinbtn;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="pass")
	WebElement pass;
	
	@FindBy(xpath="//button[@class='action login primary']")
	WebElement submit;
	
	public void sign() {
		signinbtn.click();
	}
	
	public void EmailId() {
		Email.sendKeys("praveen46@gmail.com");
	}
	
	public void password() {
		pass.sendKeys("praveen@44");
	}
	public void login() {
		submit.click();

}
}