package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.Features;

/**
 * Created by Colezea on 30/04/2015.
 */
@Repository
public interface FeaturesRepository extends JpaRepository<Features, Long> {
}
