package co.edu.saucedemo.Comprar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SouceDemoPage extends PageObject {
    public static final Target INPUT_USERNAME =Target.the("Text Box username").locatedBy("//*[@id=\"user-name\"]");
    public static final Target INPUT_PASSWORD =Target.the("Text Box password").locatedBy("//*[@id=\"password\"]");
    public static final Target LINK_TO_LOGIN =Target.the("Link to loggin").locatedBy("//*[@id=\"login-button\"]");
    public static final Target SAUCEDEMO_TITLE =Target.the("show products").locatedBy("//*[@id=\"header_container\"]/div[2]/span");
    public static final Target FAILURE_LOGIN =Target.the("Message the invalid credentials").locatedBy("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    public static final Target ADD_BOTTOM =Target.the("Bottom to add the backpack product").locatedBy("//*[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target REMOVE_BOTTOM =Target.the("Bottom to remove the backpack product").locatedBy("//*[@id='remove-sauce-labs-backpack']");
    public static final Target SHOPPING_CART =Target.the("Icon with text that indicates items in cart").locatedBy("//*[@id='shopping_cart_container']/a");

    public static final Target SHOPPING_CART_BOTTOM =Target.the("Icon with text that indicates items in cart").locatedBy("//*[@id=\"shopping_cart_container\"]");
    public static final Target CHECKOUT_BOTTOM =Target.the("Bottom to sheckout").locatedBy("//*[@id=\"checkout\"]");
    public static final Target INPUT_NAME =Target.the("Text Box name").locatedBy("//*[@id=\"first-name\"]");
    public static final Target INPUT_LASTNAME =Target.the("Text Box last name").locatedBy("//*[@id=\"last-name\"]");
    public static final Target INPUT_POSTCODE =Target.the("Text Box post code").locatedBy("//*[@id=\"postal-code\"]");
    public static final Target CHECKOUT_CONTINUE_BOTTOM =Target.the("Botton to continue with the chopping").locatedBy("//*[@id=\"continue\"]");
    public static final Target FINISH_SHOPPING_BOTTOM =Target.the("Botton to continue with the chopping").locatedBy("//*[@id=\"finish\"]");
    public static final Target SUCCESFUL_SHOPPING_TITLE =Target.the("show products").locatedBy("//*[@id=\"checkout_complete_container\"]/h2");
    public static final Target FAILURE_CHEKOUT =Target.the("Message for invalid checkout").locatedBy("//*[@id='checkout_info_container']/div/form/div[1]/div[4]");
}