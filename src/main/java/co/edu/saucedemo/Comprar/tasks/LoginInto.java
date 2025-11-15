package co.edu.saucedemo.Comprar.tasks;

import co.edu.saucedemo.Comprar.interactions.EnterThe;
import co.edu.saucedemo.Comprar.models.Client;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginInto implements Task {

    private final Client client;

    public LoginInto(Client client) {
        this.client = client;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(EnterThe.credentials(client));
    }

    public static LoginInto credentials(Client client){
        return Tasks.instrumented(LoginInto.class, client);
    }
}