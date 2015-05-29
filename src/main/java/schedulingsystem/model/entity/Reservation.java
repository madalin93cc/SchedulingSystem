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

    @Column(name = "status", nullable = false)
    private Integer status;

    @ManyToOne(optional = false)
    @JoinColumn(name = "conferenceroom_id", unique = false, nullable = false, updatable = true)
    ConferenceRoom fkConferenceRoom;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", unique = false, nullable = false, updatable = true)
    User fkUserCreated;

    public Reservation() {
    }

    public Reservation(Date date, Integer status, ConferenceRoom fkConferenceRoom, User fkUserCreated) {
        this.date = date;
        this.status = status;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;

        Reservation that = (Reservation) o;

        if (!date.equals(that.date)) return false;
        if (!fkConferenceRoom.equals(that.fkConferenceRoom)) return false;
        if (!fkUserCreated.equals(that.fkUserCreated)) return false;
        if (!id.equals(that.id)) return false;
        if (!status.equals(that.status)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + fkConferenceRoom.hashCode();
        result = 31 * result + fkUserCreated.hashCode();
        return result;
    }
}
