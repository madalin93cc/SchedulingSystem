package schedulingsystem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schedulingsystem.model.entity.Equipment;

/**
 * Created by Colezea on 30/04/2015.
 */
@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
