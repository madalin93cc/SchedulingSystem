package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.Location;

import java.util.List;

/**
 * Created by Colezea on 30/04/2015.
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    @Query("select DISTINCT(l.city) from Location l")
    List<String> getAllCityes();
}
