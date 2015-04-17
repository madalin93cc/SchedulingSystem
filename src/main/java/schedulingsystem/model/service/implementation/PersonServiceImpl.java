package schedulingsystem.model.service.implementation;

import org.springframework.stereotype.Service;
import schedulingsystem.model.entity.Person;
import schedulingsystem.model.repository.PersonRepository;
import schedulingsystem.model.service.PersonService;

import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 * PersonServiceImpl.java
 * Created by Madalin.Colezea on 4/17/2015.
 */
@Service
@Transactional
public class PersonServiceImpl  implements PersonService{

    @Inject
    private PersonRepository personRepository;

    public PersonServiceImpl() {
    }

    @Override
    public Person addPerson() {
        Person person = new Person();
        person.setFirstName("lala");
        person.setLastName("lalala");
//        return personRepository.save(person);
        return null;
    }
}
