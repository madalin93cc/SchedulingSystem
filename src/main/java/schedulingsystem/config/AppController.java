package schedulingsystem.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * AppController.java
 * Created by Madalin.Colezea on 4/17/2015.
 */
@RestController
public class AppController {
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
