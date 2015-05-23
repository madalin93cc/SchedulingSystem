package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.ConferenceRoom;
import schedulingsystem.model.entity.User;

import java.util.List;

/**
 * Created by Colezea on 28/04/2015.
 */
@Repository
public interface ConferenceRoomRepository extends JpaRepository<ConferenceRoom, Long> {

    List<ConferenceRoom> findByFkOwner(User owner);

    List<ConferenceRoom> findByName(String name);

    List<ConferenceRoom> findByFkOwnerAndIsDeleted(User owner, Boolean isDeleted);
}
