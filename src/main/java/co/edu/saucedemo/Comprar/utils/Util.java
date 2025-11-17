package co.edu.saucedemo.Comprar.utils;

import co.edu.saucedemo.Comprar.models.Client;

public class Util {
    private Util(){
    }
    public static final int SECONDS = 2000;
    public static final Client VALID_USER = Client.withCredentials("Santiago","Zapata","Medellin 0013","standard_user", "secret_sauce");
    public static final Client INVALID_USER = Client.withCredentials("Santiago","Zapata","Medellin 0013","standard_user", "secret_sauc");
}