package co.edu.saucedemo.Comprar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectThe implements Interaction {

	private final Target bottom;

	public SelectThe(Target bottom) {
		this.bottom = bottom;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(bottom));
	}

	public static SelectThe backPack(Target bottom){
		return Tasks.instrumented(SelectThe.class, bottom);
	}

}