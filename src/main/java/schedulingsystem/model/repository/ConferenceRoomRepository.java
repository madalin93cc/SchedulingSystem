package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.ConferenceRoom;

/**
 * Created by Colezea on 28/04/2015.
 */
@Repository
public interface ConferenceRoomRepository extends JpaRepository<ConferenceRoom, Long> {

    public ConferenceRoom findByName();
}
