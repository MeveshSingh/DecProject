package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("User is on login page");
	}
	    
	

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		
		System.out.println("user enter valid username and password");
	}
	   	

	@Then("user will be on home page")
	public void user_will_be_on_home_page() {
		
		System.out.println("user will be on home page");
	    

}
}
