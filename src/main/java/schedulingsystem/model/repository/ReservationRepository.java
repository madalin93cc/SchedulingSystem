package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.Reservation;
import schedulingsystem.model.entity.User;

import java.util.List;

/**
 * Created by Colezea on 23/05/2015.
 */
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByFkUserCreated(User fkUserCreated);

    @Query("select r from Reservation r where r.fkConferenceRoom.fkOwner = :user and r.status = 0")
    List<Reservation> findAllForConfirmation(@Param("user") User user);

    @Query("select r from Reservation r where r.fkConferenceRoom.fkOwner = :user")
    List<Reservation> findAllReservationsByManager(@Param("user") User user);
}
