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

    @Override
    public User createAccount(String firstName, String lastName, String username, String password, Integer type) {
        User user = new User(firstName, lastName, username, password, type);
        return userRepository.save(user);
    }
}
