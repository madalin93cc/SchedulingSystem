package schedulingsystem.model.service.implementation;

import org.springframework.stereotype.Service;
import schedulingsystem.config.SchedulingSystemApplication;
import schedulingsystem.model.dto.CredentialsDTO;
import schedulingsystem.model.entity.User;
import schedulingsystem.model.repository.UserRepository;
import schedulingsystem.model.service.UserService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Colezea on 26/04/2015.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Inject
    UserRepository userRepository;

    public UserServiceImpl() {
    }

    @Override
    public User createAccount(String firstName, String lastName, String username, String password, String type) {
        Integer intType = null;
        User user;
        List<User> users = userRepository.findAll();
        if ("option1".compareTo(type) == 0){
            intType = 0;
        }
        else if ("option2".compareTo(type) == 0){
            intType = 1;
        }
        if (existUser(username)){
            return null;
        }
        else {
            user = new User(firstName, lastName, username, password, intType);
        }
        return userRepository.save(user);
    }

    private Boolean existUser(String username){
        List<User> users = userRepository.findByUsername(username);
        if (users.size() == 0){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public User login(CredentialsDTO credentialsDTO) {
        List<User> user = userRepository.findByUsername(credentialsDTO.getUsername());
        if (user.size() == 0) return null;
        else {
            if (user.get(0).getPassword().compareTo(credentialsDTO.getPassword()) != 0) return null;
        }
        SchedulingSystemApplication.userLoged = user.get(0);
        return user.get(0);
    }
}
