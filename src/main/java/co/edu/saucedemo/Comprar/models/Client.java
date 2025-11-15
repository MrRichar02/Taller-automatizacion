package co.edu.saucedemo.Comprar.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String username;
    private String password;

    public static Client withCredentials(String username, String password) {
        return new Client(username, password);
    }
}