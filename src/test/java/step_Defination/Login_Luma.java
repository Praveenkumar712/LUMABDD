package step_Defination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Object.Login;


public class Login_Luma {
	public static WebDriver driver;
	Login Log;
	
	@Given("user open browsers")
	public void user_open_browsers() {
		 driver=new ChromeDriver();
	}
	@And("user open the application and click on signin button")
	public void user_open_the_application_and_click_on_signin_button() {
		driver.get("https://magento.softwaretestingboard.com/");
		Log=new Login(driver);
		
		Log.sign();
	}

	@When("user enters Email and password")
	public void user_enters_email_and_password() {
		
		Log.EmailId();
		Log.password();
		
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		Log.login();
		
	}

	@Then("user should succussfully completed the login functionality")
	public void user_should_succussfully_completed_the_login_functionality() {
		
	}

	@And("user should naviagated into home page")
	public void user_should_naviagated_into_home_page() {
		String Exp_title=driver.getTitle();
		String Act_title="Home Page";
		
		if(Exp_title.equals(Act_title)) {
			Assert.assertTrue(true);
			System.out.println("test case passed");
		}
			else {
				System.out.println("test case failed");
				Assert.assertTrue(false);
				
			}
		
	}
}
