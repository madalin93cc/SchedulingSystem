package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.Person;

/**
 * PersonRepository.java
 * Created by Madalin.Colezea on 4/17/2015.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
}
