package co.edu.saucedemo.Comprar.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginStepDefinition {

	public final Actor client = Actor.named("Ricardo");
	@Managed(driver = "chrome", uniqueSession = true)
	public WebDriver theDriver;

	// @Before
	// public void config() {
	// 	client.can(BrowseTheWeb.with(theDriver));
	// 	OnStage.setTheStage(new OnlineCast());
	// 	OnStage.theActorCalled("user");
	// }

	@Given("I am on the Saucedemo login page")
	public void iAmOnTheSaucedemoLoginPage() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When("I enter invalid credentials")
	public void iEnterInvalidCredentials() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When("I enter my valid credentials")
	public void iEnterMyValidCredentials() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Then("I can see an error message and I cannot access the store")
	public void iCanSeeAnErrorMessageAndICannotAccessTheStore() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can access the Saucedemo store")
	public void iCanAccessTheSaucedemoStore() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	
}

