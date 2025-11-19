package co.edu.saucedemo.Comprar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Interaction {

	private final Target bottom;

	public ClickOn(Target bottom) {
		this.bottom = bottom;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(bottom));
	}

	public static ClickOn the(Target bottom){
		return Tasks.instrumented(ClickOn.class, bottom);
	}

}