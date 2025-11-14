package co.edu.saucedemo.Comprar.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ShoppingStepDefinition {

	// @Before
	// public void config() {
	// 	student.can(BrowseTheWeb.with(theDriver));
	// 	OnStage.setTheStage(new OnlineCast());
	// 	OnStage.theActorCalled("user");
	// }

	@Given("I am logged into the Saucedemo store")
	public void iAmLoggedIntoTheSaucedemoStore() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When("I select a product to add to the cart")
	public void iSelectAProductToAddToTheCart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Then("I can see the product in my shopping cart")
	public void iCanSeeTheProductInMyShoppingCart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


	@Given("I have products in my shopping cart")
	public void iHaveProductsInMyShoppingCart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When("I remove a product from the cart")
	public void iRemoveAProductFromTheCart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Then("I can see that the product is no longer in my shopping cart")
	public void iCanSeeThatTheProductIsNoLongerInMyShoppingCart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


}
