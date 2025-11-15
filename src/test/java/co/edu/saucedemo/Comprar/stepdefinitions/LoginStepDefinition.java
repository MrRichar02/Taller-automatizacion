package co.edu.saucedemo.Comprar.stepdefinitions;

import co.edu.saucedemo.Comprar.models.Client;
import co.edu.saucedemo.Comprar.questions.ValidationFor;
import co.edu.saucedemo.Comprar.tasks.LoginInto;
import co.edu.saucedemo.Comprar.utils.WaitTime;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

import co.edu.saucedemo.Comprar.tasks.OpenThe;
import co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage;

public class LoginStepDefinition {

	public final Actor client = Actor.named("Ricardo");

	// HAY QUE VER DONDE SE COLOCAN ESTO
	private static final Client VALID_USER = Client.withCredentials("standard_user", "secret_sauce");
	private static final Client INVALID_USER = Client.withCredentials("standard_user", "secret_sauc");


	@Managed(driver = "chrome", uniqueSession = true)
	public WebDriver theDriver;

	@Before
	public void config() {
	client.can(BrowseTheWeb.with(theDriver));
	OnStage.setTheStage(new OnlineCast());
	OnStage.theActorCalled("user");
	}

	@Given("I am on the Saucedemo login page")
	public void iAmOnTheSaucedemoLoginPage() {
		WaitTime.putWaitTimeOf(2000);
		client.attemptsTo(OpenThe.sauceDemoPage(new SouceDemoPage()));
		WaitTime.putWaitTimeOf(2000);
	}

	@When("I enter invalid credentials")
	public void iEnterInvalidCredentials() {
		WaitTime.putWaitTimeOf(2000);
		client.attemptsTo(LoginInto.credentials(INVALID_USER));
		WaitTime.putWaitTimeOf(2000);
	}

	@When("I enter my valid credentials")
	public void iEnterMyValidCredentials() {
		client.attemptsTo(LoginInto.credentials(VALID_USER));
		WaitTime.putWaitTimeOf(2000);
	}

	@Then("I can see an error message and I cannot access the store")
	public void iCanSeeAnErrorMessageAndICannotAccessTheStore() {
		GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.failureLonin(),
				Matchers.containsString("Epic sadface: Username and password do not match any user in this service")));
		WaitTime.putWaitTimeOf(2000);
	}

	@Then("I can access the Saucedemo store")
	public void iCanAccessTheSaucedemoStore() {
		GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.succesfulLonin(),
				Matchers.containsString("Products")));
		WaitTime.putWaitTimeOf(2000);
	}
	
}