package schedulingsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import schedulingsystem.model.entity.Person;
import schedulingsystem.model.repository.PersonRepository;
import schedulingsystem.model.service.PersonService;

import javax.inject.Inject;

/**
 * PersonController.java
 * Created by Madalin.Colezea on 4/17/2015.
 */
@RestController
public class PersonController {

    @Inject
    private PersonService personService;

    @RequestMapping(value = "/add")
    public Person addPerson(){
        return null;
    }
}
