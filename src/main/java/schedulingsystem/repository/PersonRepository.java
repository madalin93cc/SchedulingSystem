package schedulingsystem.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.entity.Person;

/**
 * Created by Colezea on 12/04/2015.
 */
@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
