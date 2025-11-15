package co.edu.saucedemo.Comprar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage.FAILURE_LOGIN;
import static co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage.SAUCEDEMO_TITLE;

public class ValidationFor implements Question<String> {

    private final Target element;

    private ValidationFor(Target element) {
        this.element = element;
    }
    @Override
    public String answeredBy(Actor actor) {
        String message = BrowseTheWeb.as(actor).find(element).getText();
        return message;
    }

    public static ValidationFor succesfulLonin(){
        return new ValidationFor(SAUCEDEMO_TITLE);
    }

    public static ValidationFor failureLonin(){
        return new ValidationFor(FAILURE_LOGIN);
    }
}