package co.edu.saucedemo.Comprar.stepdefinitions;

import co.edu.saucedemo.Comprar.questions.ValidationFor;
import co.edu.saucedemo.Comprar.tasks.*;
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

import co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage;

import static co.edu.saucedemo.Comprar.utils.Util.SECONDS;
import static co.edu.saucedemo.Comprar.utils.Util.VALID_USER;

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

	@Given("I have products in my shopping cart")
	public void iHaveProductsInMyShoppingCart() {
		client.attemptsTo(OpenThe.sauceDemoPage(new SouceDemoPage()), LoginInto.credentials(VALID_USER));
		WaitTime.putWaitTimeOf(SECONDS);
		client.attemptsTo(AddThe.backpack());
		WaitTime.putWaitTimeOf(SECONDS);
	}

	@When("I checkout my products")
	public void iCheckoutMyProducts() {
        client.attemptsTo(GoTo.theShoppingCart());
        WaitTime.putWaitTimeOf(SECONDS);
        client.attemptsTo(GoTo.checkOut());
        WaitTime.putWaitTimeOf(SECONDS);
	}
	@When("I enter my personal information")
	public void iEnterMyPersonalInformation() {
        client.attemptsTo(CheckOutInto.clientPersonalInformation(VALID_USER));
        WaitTime.putWaitTimeOf(SECONDS);
        client.attemptsTo(GoTo.finishShopping());
        WaitTime.putWaitTimeOf(SECONDS);
	}

	@When("I don't enter my personal information")
	public void iDonTEnterMyPersonalInformation() {
		WaitTime.putWaitTimeOf(SECONDS);
		client.attemptsTo(WronglyCheckoutInto.personalInformation());
		WaitTime.putWaitTimeOf(SECONDS);
	}

	@Then("I can see an error message which says that my personal information is required")
	public void iCanSeeAnErrorMessageWhichSaysThatMyPersonalInformationIsRequired() {
    GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.unSuccesfulShopping(), Matchers.containsString("Error")));
    GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.unSuccesfulShopping(), Matchers.containsString("is required")));
	}

	@Then("I can see a message which says that my order has been dispatched")
	public void iCanSeeAMessageWhichSaysThatMyOrderHasBeenDispatched() {
        GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.succesfulShopping(), Matchers.containsString("Thank you for your order!")));
        WaitTime.putWaitTimeOf(SECONDS);
	}

}