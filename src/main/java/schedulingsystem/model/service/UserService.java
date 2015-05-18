package schedulingsystem.model.service;

import schedulingsystem.model.dto.CredentialsDTO;
import schedulingsystem.model.entity.User;

/**
 * Created by Colezea on 26/04/2015.
 */
public interface UserService {

    public User createAccount(String firstName, String lastName, String username, String password, String type);

    public User login(CredentialsDTO credentialsDTO);

    public void deleteAccount();
}