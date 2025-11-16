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

public class CheckoutStepDefinition {

	public final Actor client = Actor.named("Ricardo");

	@Managed(driver = "chrome", uniqueSession = false)
	public WebDriver theDriver;

	@Before
	public void config() {
	client.can(BrowseTheWeb.with(theDriver));
	OnStage.setTheStage(new OnlineCast());
	OnStage.theActorCalled("user");
	}

	@When("I checkout my products")
	public void iCheckoutMyProducts() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When("I enter my personal information")
	public void iEnterMyPersonalInformation() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I don't enter my personal information")
	public void iDonTEnterMyPersonalInformation() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can see an error message which says that my personal information is required")
	public void iCanSeeAnErrorMessageWhichSaysThatMyPersonalInformationIsRequired() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can see a message which says that my order has been dispatched")
	public void iCanSeeAMessageWhichSaysThatMyOrderHasBeenDispatched() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
