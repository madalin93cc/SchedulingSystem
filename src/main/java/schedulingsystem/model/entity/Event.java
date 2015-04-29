package schedulingsystem.model.entity;

import org.hibernate.metamodel.relational.Database;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;
import java.security.Timestamp;
import java.sql.Time;

/**
 * Created by Adi on 29.04.2015.
 */


public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "StartDate", nullable = false)
    private Data startDate;

    @Column(name = "EndDate", nullable = false)
    private Data endDate;

    @Column(name = "StartHour", nullable = false)
    private Timestamp startHour;

    @Column(name = "DurationNumber", nullable = false)
    private Integer durationNumber;

    @Column(name = "NumberOfPersons", nullable = false)
    private Integer numberOfPersons;

    @Column(name = "FKConferenceRoom", nullable = false)
    private Integer fkConferenceRoom;

    public Event(Data startDate,
                 Data endDate,
                 Timestamp startHour,
                 Integer durationNumber,
                 Integer numberOfPersons,
                 Integer fkConferenceRoom) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.startHour = startHour;
        this.durationNumber = durationNumber;
        this.numberOfPersons = numberOfPersons;
        this.fkConferenceRoom = fkConferenceRoom;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getStartDate() {
        return startDate;
    }

    public void setStartDate(Data startDate) {
        this.startDate = startDate;
    }

    public Data getEndDate() {
        return endDate;
    }

    public void setEndDate(Data endDate) {
        this.endDate = endDate;
    }

    public Timestamp getStartHour() {
        return startHour;
    }

    public void setStartHour(Timestamp startHour) {
        this.startHour = startHour;
    }

    public Integer getDurationNumber() {
        return durationNumber;
    }

    public void setDurationNumber(Integer durationNumber) {
        this.durationNumber = durationNumber;
    }

    public Integer getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(Integer numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public Integer getFkConferenceRoom() {
        return fkConferenceRoom;
    }

    public void setFkConferenceRoom(Integer fkConferenceRoom) {
        this.fkConferenceRoom = fkConferenceRoom;
    }
}
