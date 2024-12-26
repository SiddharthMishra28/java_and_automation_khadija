package com.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIAutomationSteps {
	
	@Given("I am navigating to {string}")
	public void i_am_navigating_to(String url) {
	   System.out.println("Navigatig to : "+url);
	}
	@When("I search for term {string}")
	public void i_search_for_term(String searchTerm) {
	    System.out.println("Searching for Term : "+searchTerm);
	}
	@Then("I should see multiple results")
	public void i_should_see_multiple_results() {
	    
	}

}
