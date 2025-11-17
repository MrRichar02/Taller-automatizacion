package co.edu.saucedemo.Comprar.tasks;

import co.edu.saucedemo.Comprar.interactions.SelectThe;
import co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage;
import co.edu.saucedemo.Comprar.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class WronglyCheckoutInto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		WaitTime.putWaitTimeOf(2000);
		actor.attemptsTo(SelectThe.continueCheckout(SouceDemoPage.CHECKOUT_CONTINUE_BOTTOM));
	}

	public static WronglyCheckoutInto personalInformation() {
		return Tasks.instrumented(WronglyCheckoutInto.class);
	}

}