package co.edu.saucedemo.Comprar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static co.edu.saucedemo.Comprar.userinterfaces.SouceDemoPage.*;

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

    public static ValidationFor addProductBottom(){
        return new ValidationFor(REMOVE_BOTTOM);
    }

    public static ValidationFor removeProductBottom(){
        return new ValidationFor(ADD_BOTTOM);
    }

    public static ValidationFor shoppingCart(){
        return new ValidationFor(SHOPPING_CART);
    }

    public static ValidationFor succesfulShopping(){
        return new ValidationFor(SUCCESFUL_SHOPPING_TITLE);
    }

    public static ValidationFor unSuccesfulShopping(){
        return new ValidationFor(FAILURE_CHEKOUT);
    }
}