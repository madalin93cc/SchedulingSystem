package schedulingsystem.model.entity;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * Created by Adi on 29.04.2015.
 */

@Entity
public class RoomOccupancy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "FKConferenceRoom", nullable = false)
    private Integer fkConfereneceRoom;

    @Column(name = "FKEvent", nullable = false)
    private Integer fkEvent;

    @Column(name = "StartHour", nullable = false)
    private Timestamp startHour;

    @Column(name = "EndHour", nullable = false)
    private Timestamp endHour;

    public RoomOccupancy () {

    }

    public RoomOccupancy(Integer fkConfereneceRoom,
                         Integer fkEvent,
                         Timestamp startHour,
                         Timestamp endHour) {

        this.fkConfereneceRoom = fkConfereneceRoom;
        this.fkEvent = fkEvent;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFkConfereneceRoom() {
        return fkConfereneceRoom;
    }

    public void setFkConfereneceRoom(Integer fkConfereneceRoom) {
        this.fkConfereneceRoom = fkConfereneceRoom;
    }

    public Integer getFkEvent() {
        return fkEvent;
    }

    public void setFkEvent(Integer fkEvent) {
        this.fkEvent = fkEvent;
    }

    public Timestamp getStartHour() {
        return startHour;
    }

    public void setStartHour(Timestamp startHour) {
        this.startHour = startHour;
    }

    public Timestamp getEndHour() {
        return endHour;
    }

    public void setEndHour(Timestamp endHour) {
        this.endHour = endHour;
    }
}
