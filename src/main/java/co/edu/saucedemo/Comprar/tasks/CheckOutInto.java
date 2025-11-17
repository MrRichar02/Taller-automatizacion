package co.edu.saucedemo.Comprar.tasks;

import co.edu.saucedemo.Comprar.interactions.CheckOutEnterThe;
import co.edu.saucedemo.Comprar.models.Client;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CheckOutInto implements Task {
    private final Client client;

    public CheckOutInto(Client client) {
        this.client = client;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(CheckOutEnterThe.clientPersobalInformation(client));
    }

    public static CheckOutInto clientPersonalInformation(Client client){
        return Tasks.instrumented(CheckOutInto.class, client);
    }

}