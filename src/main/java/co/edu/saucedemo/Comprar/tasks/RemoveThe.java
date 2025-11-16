package co.edu.saucedemo.Comprar.tasks;

import co.edu.saucedemo.Comprar.interactions.SelectThe;
import co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage;
import co.edu.saucedemo.Comprar.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RemoveThe implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		WaitTime.putWaitTimeOf(2000);
		actor.attemptsTo(SelectThe.backPack(SouceDemoPage.REMOVE_BOTTOM));
	}

	public static RemoveThe backpack() {
		return Tasks.instrumented(RemoveThe.class);
	}
	
}
