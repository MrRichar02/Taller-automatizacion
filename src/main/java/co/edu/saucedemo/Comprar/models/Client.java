package co.edu.saucedemo.Comprar.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String name;
    private String lastname;
    private String postcode;
    private String username;
    private String password;

    public static Client withCredentials(String name, String lastname, String postcode, String username, String password) {
        return new Client(name,lastname,postcode,username, password);
    }

}