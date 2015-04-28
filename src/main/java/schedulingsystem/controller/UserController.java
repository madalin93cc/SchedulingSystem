package schedulingsystem.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import schedulingsystem.model.entity.User;
import schedulingsystem.model.service.UserService;
import schedulingsystem.utils.RequestMappingEnum;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Colezea on 26/04/2015.
 */
@RestController
public class UserController {

    @Inject
    private UserService userService;

    @RequestMapping(value = "/add/{firstName}/{lastName}/{username}/{password}/{type}",
            method = RequestMethod.POST, produces = "application/json")
    public User createAccount(@PathVariable("firstName") String firstName,
                              @PathVariable("lastName") String lastName,
                              @PathVariable("username") String username,
                              @PathVariable("password") String password,
                              @PathVariable("type") String type){
        return userService.createAccount(firstName, lastName, username, password, type);
    }
}
