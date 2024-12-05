package step_Defination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Object.Signup;

public class Register_Luma {
	public static WebDriver driver;
	Signup signup;
	@Given("user open browser")
	public void user_open_browser() {
		 driver=new ChromeDriver();
	}

	@And("user open the application and click on the register button")
	public void user_open_the_application_and_click_on_the_register_button() {
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		signup=new Signup(driver);
		

	}

	@When("user enters FistName,LastName,EmailID,Password and Confirm Password")
	public void user_enters_fist_name_last_name_email_id_password_and_confirm_password() {
		
		signup.firstname();
		signup.lastname();
		signup.Email();
		signup.password();
		signup.conpassword();
	
	}

	@And("user clicks the create account button")
	public void user_clicks_the_create_account_button() {
		
		signup.create();
	  
	}

	@Then("user should successfully completed the Register functionality")
	public void user_should_successfully_completed_the_register_functionality() {
	  
	}

	@And("user should navigated into My Account page page")
	public void user_should_navigated_into_my_account_page_page() {
		String Exp_title=driver.getTitle();
		String Act_title="My Account";
		
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
