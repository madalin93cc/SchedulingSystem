package schedulingsystem.controller;

import org.springframework.data.authentication.UserCredentials;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import schedulingsystem.config.SchedulingSystemApplication;
import schedulingsystem.model.dto.CredentialsDTO;
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

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST, produces = "application/json")
    public User login(@RequestBody CredentialsDTO credentialsDTO){
        return userService.login(credentialsDTO);
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET, produces = "application/json")
    public User getUser(){
        return SchedulingSystemApplication.userLoged;
    }

    @RequestMapping(value = "/get/newcredentials", method = RequestMethod.GET, produces = "application/json")
    public CredentialsDTO getUserCredentials(){
        return new CredentialsDTO();
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET, produces = "application/json")
    public Boolean logout(){
        SchedulingSystemApplication.userLoged = null;
        return true;
    }

    @RequestMapping(value = "/deleteAccount", method = RequestMethod.GET, produces = "application/json")
    public Boolean deleteAccount(){
        userService.deleteAccount();
        return true;
    }
}
