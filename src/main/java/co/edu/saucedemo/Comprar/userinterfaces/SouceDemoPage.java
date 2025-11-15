package co.edu.saucedemo.Comprar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SouceDemoPage extends PageObject {
    public static final Target INPUT_USERNAME =Target.the("Text Box username").locatedBy("//*[@id=\"user-name\"]");
    public static final Target INPUT_PASSWORD =Target.the("Text Box password").locatedBy("//*[@id=\"password\"]");
    public static final Target LINK_TO_LOGIN =Target.the("Link to loggin").locatedBy("//*[@id=\"login-button\"]");
    public static final Target SAUCEDEMO_TITLE =Target.the("show products").locatedBy("//*[@id=\"header_container\"]/div[2]/span");
    public static final Target FAILURE_LOGIN =Target.the("Message the invalid credentials").locatedBy("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
}