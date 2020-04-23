package gluecode;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	public WebDriver rdriver ;
	
	@Given("^Enter name name and password$")
	public void Enter_name_name_and_password() throws Throwable {
	   System.out.println("Given call");
	   
	   
	}

	@When("^login page landed$")
	public void login_page_landed() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("When call");
	}

	@Then("^homepage should be open$")
	public void homepage_should_be_open() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Then call");
	}
}
