package co.edu.saucedemo.Comprar.interactions;

import co.edu.saucedemo.Comprar.models.Client;
import co.edu.saucedemo.Comprar.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage.*;

public class EnterThe implements Interaction {
    private final Client client;
    public EnterThe(Client client) {
        this.client = client;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(client.getUsername()).into(INPUT_USERNAME));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue(client.getPassword()).into(INPUT_PASSWORD));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Click.on(LINK_TO_LOGIN));
    }

    public static EnterThe credentials(Client client) {
        return Tasks.instrumented(EnterThe.class, client);
    }
}