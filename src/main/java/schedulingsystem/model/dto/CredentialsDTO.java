package schedulingsystem.model.dto;

import java.io.Serializable;

/**
 * Created by Colezea on 17/05/2015.
 */
public class CredentialsDTO implements Serializable{

    private String username;

    private String password;

    public CredentialsDTO() {
    }

    public CredentialsDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
