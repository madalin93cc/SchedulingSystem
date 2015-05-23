package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.Reservation;

/**
 * Created by Colezea on 23/05/2015.
 */
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
