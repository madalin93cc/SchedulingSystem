package schedulingsystem.model.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Colezea on 23/05/2015.
 */
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Date", nullable = false)
    private Date date;

    @Column(name = "IsConfirmed", nullable = false)
    private Boolean isConfirmed;

    @ManyToOne(optional = false)
    @JoinColumn(name = "conferenceroom_id", unique = false, nullable = false, updatable = true)
    ConferenceRoom fkConferenceRoom;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", unique = false, nullable = false, updatable = true)
    User fkUserCreated;

    public Reservation() {
    }

    public Reservation(Date date, Boolean isConfirmed, ConferenceRoom fkConferenceRoom, User fkUserCreated) {
        this.date = date;
        this.isConfirmed = isConfirmed;
        this.fkConferenceRoom = fkConferenceRoom;
        this.fkUserCreated = fkUserCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public ConferenceRoom getFkConferenceRoom() {
        return fkConferenceRoom;
    }

    public void setFkConferenceRoom(ConferenceRoom fkConferenceRoom) {
        this.fkConferenceRoom = fkConferenceRoom;
    }

    public User getFkUserCreated() {
        return fkUserCreated;
    }

    public void setFkUserCreated(User fkUserCreated) {
        this.fkUserCreated = fkUserCreated;
    }
}
