package co.edu.saucedemo.Comprar.tasks;

import co.edu.saucedemo.Comprar.interactions.ClickOn;
import co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddThe implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(ClickOn.the(SouceDemoPage.ADD_BOTTOM));
	}

	public static AddThe backpack() {
		return Tasks.instrumented(AddThe.class);
	}
}