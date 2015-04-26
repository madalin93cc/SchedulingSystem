package schedulingsystem.model.service.implementation;

import org.springframework.stereotype.Service;
import schedulingsystem.model.entity.User;
import schedulingsystem.model.repository.UserRepository;
import schedulingsystem.model.service.UserService;

import javax.inject.Inject;
import javax.transaction.Transactional;

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
        if ("option1".compareTo(type) == 0){
            intType = 0;
        }
        else if ("option2".compareTo(type) == 0){
            intType = 1;
        }
        User user = new User(firstName, lastName, username, password, intType);
        return userRepository.save(user);
    }
}
