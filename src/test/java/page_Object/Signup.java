package page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	WebDriver driver;
	public Signup (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//a[text()='Create an Account")
	WebElement createbtn;
	
	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="email_address")
	WebElement mail;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="password-confirmation")
	WebElement cpass;
	
	@FindBy(xpath="//button[@class='action submit primary']")
	WebElement submit;
	

	public void sign() {
		createbtn.click();
	}
	
	public void firstname() {
		fname.sendKeys("praveen");
	}
	
	public void lastname() {
		lname.sendKeys("kumar");
	}
	public void Email() {
		mail.sendKeys("praveen46@gmail.com");
	}
	public void password() {
		pass.sendKeys("praveen@44");
	}
	public void conpassword() {
		cpass.sendKeys("praveen@44");
	}
	public void create() {
		submit.click();
	}
}
