package co.edu.saucedemo.Comprar.tasks;

import co.edu.saucedemo.Comprar.interactions.SelectThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage.*;

public class GoTo implements Task {
    private final Target target;

    public GoTo(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
    }
    public static GoTo theShoppingCart() {
        return Tasks.instrumented(GoTo.class, SHOPPING_CART_BOTTOM);
    }

    public static GoTo checkOut() {
        return Tasks.instrumented(GoTo.class,CHECKOUT_BOTTOM);
    }

    public static GoTo finishShopping() {
        return Tasks.instrumented(GoTo.class,FINISH_SHOPPING_BOTTOM);
    }
}