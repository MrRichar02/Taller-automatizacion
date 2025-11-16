package co.edu.saucedemo.Comprar.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.edu.saucedemo.Comprar.models.Client;
import co.edu.saucedemo.Comprar.questions.ValidationFor;
import co.edu.saucedemo.Comprar.tasks.OpenThe;
import co.edu.saucedemo.Comprar.tasks.RemoveThe;
import co.edu.saucedemo.Comprar.tasks.AddThe;
import co.edu.saucedemo.Comprar.tasks.LoginInto;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage;
import co.edu.saucedemo.Comprar.utils.WaitTime;

public class ShoppingStepDefinition {

	public final Actor client = Actor.named("Ricardo");
	private static final Client VALID_USER = Client.withCredentials("standard_user", "secret_sauce");

	@Managed(driver = "chrome", uniqueSession = false)
	public WebDriver theDriver;

	@Before
	public void config() {
		client.can(BrowseTheWeb.with(theDriver));
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("Ricardo");
	}

	@Given("I am logged into the Saucedemo store")
	public void iAmLoggedIntoTheSaucedemoStore() {
		client.attemptsTo(OpenThe.sauceDemoPage(new SouceDemoPage()), LoginInto.credentials(VALID_USER));
		WaitTime.putWaitTimeOf(2000);
	}
	@When("I select a product to add to the cart")
	public void iSelectAProductToAddToTheCart() {
		client.attemptsTo(AddThe.backpack());
		WaitTime.putWaitTimeOf(2000);
	}
	@Then("I can see the product in my shopping cart")
	public void iCanSeeTheProductInMyShoppingCart() {
		GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.addProductBottom(), Matchers.containsString("Remove")));
		GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.shoppingCart(), Matchers.containsString("1")));
	}

	@Given("I have products in my shopping cart")
	public void iHaveProductsInMyShoppingCart() {
		client.attemptsTo(OpenThe.sauceDemoPage(new SouceDemoPage()), LoginInto.credentials(VALID_USER), AddThe.backpack());
		WaitTime.putWaitTimeOf(2000);
	}
	@When("I remove a product from the cart")
	public void iRemoveAProductFromTheCart() {
		client.attemptsTo(RemoveThe.backpack());
		WaitTime.putWaitTimeOf(2000);
	}
	@Then("I can see that the product is no longer in my shopping cart")
	public void iCanSeeThatTheProductIsNoLongerInMyShoppingCart() {
		GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.removeProductBottom(), Matchers.containsString("Add")));
		GivenWhenThen.then(client).should(GivenWhenThen.seeThat(ValidationFor.shoppingCart(), Matchers.containsString("")));
	} 
}