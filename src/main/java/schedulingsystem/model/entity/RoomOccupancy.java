package schedulingsystem.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Adi on 29.04.2015.
 */

@Entity
public class RoomOccupancy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
