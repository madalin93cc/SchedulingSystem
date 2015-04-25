package schedulingsystem.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Colezea on 26/04/2015.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String username;
    private String password;

    private Integer type;
    private Integer fkEventsCreated;
    private Integer fkEventsJoined;

    public User() {
    }

    public User(String firstName, String lastName, String username, String password, Integer type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFkEventsCreated() {
        return fkEventsCreated;
    }

    public void setFkEventsCreated(Integer fkEventsCreated) {
        this.fkEventsCreated = fkEventsCreated;
    }

    public Integer getFkEventsJoined() {
        return fkEventsJoined;
    }

    public void setFkEventsJoined(Integer fkEventsJoined) {
        this.fkEventsJoined = fkEventsJoined;
    }
}
