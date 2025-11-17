package co.edu.saucedemo.Comprar.interactions;

import co.edu.saucedemo.Comprar.models.Client;
import co.edu.saucedemo.Comprar.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage.*;

public class CheckOutEnterThe implements Interaction {

    private final Client client;
    public CheckOutEnterThe(Client client) {
        this.client = client;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(client.getName()).into(INPUT_NAME));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue(client.getLastname()).into(INPUT_LASTNAME));
        WaitTime.putWaitTimeOf(2000);
        actor.attemptsTo(Enter.theValue(client.getPostcode()).into(INPUT_POSTCODE));
        actor.attemptsTo(Click.on(CHECKOUT_CONTINUE_BOTTOM));
    }

    public static CheckOutEnterThe clientPersobalInformation(Client client) {
        return Tasks.instrumented(CheckOutEnterThe.class, client);
    }
}