package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.Location;

/**
 * Created by Colezea on 30/04/2015.
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
