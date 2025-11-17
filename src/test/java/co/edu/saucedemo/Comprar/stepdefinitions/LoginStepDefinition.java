package co.edu.saucedemo.Comprar.stepdefinitions;


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
import co.edu.saucedemo.Comprar.tasks.OpenThe;
import co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage;
import static co.edu.saucedemo.Comprar.utils.Util.*;

public class LoginStepDefinition {

	public final Actor client = Actor.named("Ricardo");

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
		WaitTime.putWaitTimeOf(SECONDS);
		client.attemptsTo(OpenThe.sauceDemoPage(new SouceDemoPage()));
		WaitTime.putWaitTimeOf(SECONDS);
	}

	@When("I enter invalid credentials")
	public void iEnterInvalidCredentials() {
		WaitTime.putWaitTimeOf(SECONDS);
		client.attemptsTo(LoginInto.credentials(INVALID_USER));
		WaitTime.putWaitTimeOf(SECONDS);
	}

	@When("I enter my valid credentials")
	public void iEnterMyValidCredentials() {
		client.attemptsTo(LoginInto.credentials(VALID_USER));
		WaitTime.putWaitTimeOf(SECONDS);
	}

	@Then("I can see an error message and I cannot access the store")
	public void iCanSeeAnErrorMessageAndICannotAccessTheStore() {
		GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.failureLonin(),
				Matchers.containsString("Epic sadface: Username and password do not match any user in this service")));
		WaitTime.putWaitTimeOf(SECONDS);
	}

	@Then("I can access the Saucedemo store")
	public void iCanAccessTheSaucedemoStore() {
		GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.succesfulLonin(),
				Matchers.containsString("Products")));
		WaitTime.putWaitTimeOf(SECONDS);
	}
	
}