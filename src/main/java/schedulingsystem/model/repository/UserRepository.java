package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.User;

import java.util.List;

/**
 * Created by Colezea on 26/04/2015.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findByUsername(String username);
}
